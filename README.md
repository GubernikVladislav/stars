
    CREATE TABLE PAGE(
        ID SERIAL PRIMARY KEY,
        CODE VARCHAR NOT NULL,
        DESCRIPTION VARCHAR
    );
    
    CREATE UNIQUE INDEX UX_PAGE_CODE ON PAGE(CODE);
    
    INSERT INTO PAGE(CODE, DESCRIPTION) VALUES('MAIN', 'Главная страница');
    INSERT INTO PAGE(CODE, DESCRIPTION) VALUES('PROFILE', 'Страница профиля');
    
    CREATE TABLE RATING(
        ID SERIAL PRIMARY KEY,
        STARS INTEGER NOT NULL DEFAULT 0,
        COMMENT VARCHAR,
        PAGE_ID INTEGER NOT NULL,
        FOREIGN KEY (PAGE_ID) REFERENCES PAGE(ID)
    );