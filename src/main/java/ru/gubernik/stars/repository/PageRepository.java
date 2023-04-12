package ru.gubernik.stars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gubernik.stars.model.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Integer> {

    /**
     * Поиск страницы по уникальному коду
     *
     * @param code код страницы
     * @return найденная страница
     */
    Page findByCode(String code);
}
