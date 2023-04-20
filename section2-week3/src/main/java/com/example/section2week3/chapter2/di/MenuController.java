package com.example.section2week3.chapter2.di;

import java.util.List;

public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    public List<Menu> getMenus() {
        return menuService.getMenuList();
    }
}
