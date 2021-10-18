package com.bocek.api;

public class CarService {
    private Car car;

    public CarService(Car car) {

        this.car = car;
    }
    public void model(){
        car.model();
    }

}
