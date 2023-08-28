package org.example;

import org.example.entity.Producto;
import org.example.entity.Tienda;
import org.example.service.MenuService;
import org.example.service.TiendaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MenuService menu = new MenuService();
        menu.run();
    }
}