package com.bocek.api;
public class Main{

    public static void main(String[] args) {
    CarService carService = new CarService(new MercedesImpl());
    carService.model();
    }

}