package ru.gubernik.stars.exception;

public class PageNotFoundException extends RuntimeException {

    public PageNotFoundException(String code) {
        super("На найдена страница по коду: " + code);
    }
}
