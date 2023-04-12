package ru.gubernik.stars.service;

import ru.gubernik.stars.model.Page;
import ru.gubernik.stars.view.PageView;

import java.util.List;

public interface PageService {

    /**
     * Получить страницу по уникальному коду
     *
     * @param code уникальный код страницы
     * @return найденная страница
     */
    Page getByCode(String code);


    /**
     * Получение всех страниц с рейтингами
     *
     * @return список всех страниц с рейтингами
     */
    List<PageView> getPages();
}
