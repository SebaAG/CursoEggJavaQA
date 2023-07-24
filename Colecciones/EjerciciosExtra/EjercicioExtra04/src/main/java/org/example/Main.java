package org.example;

import org.example.service.MenuService;

public class Main {
    public static void main(String[] args) {
        MenuService menu = new MenuService();
        menu.run();
    }
}