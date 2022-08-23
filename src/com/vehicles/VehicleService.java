package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike obj = new Bike("BUGATI",5678,"SportsBike");
        System.out.println(obj.getManufacturerInformation());
        int res = obj.maxSpeed("sportsBike");
        System.out.println("Bike type is "+obj.getVehicleType() +" its speed is " + res);
        Car obj2 = new Car("Aston Martin",2346,"SportsCar");
        System.out.println(obj2.getManufacturerInformation());
        int res2 = obj2.maxSpeed("SportsCar");
        System.out.println("Car type is "+obj2.getVehicleType() +" its speed is "+ res2);
    }
}
