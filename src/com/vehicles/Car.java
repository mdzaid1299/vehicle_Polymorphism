package com.vehicles;

public class Car extends  VehicleManufacturer implements Vehicle{
    public Car(String vehicleName, int vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }


    public String getManufacturerInformation() {
        return  "Car{ Manufacturer Name : '" + getVehicleName() +"', Model Name : '" + getVehicleModelName() +"' , " +
                "Type : '" + getVehicleType()+"' }";
    }


    public int maxSpeed(String vehicleType) {
        if(vehicleType.equals("SportsCar")){
            return 250;
        }
        if(vehicleType.equals("Sedan")){
            return 170;
        }
        return  0;
    }
}
