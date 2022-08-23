package com.vehicles;

public abstract class VehicleManufacturer {
    private  String vehicleName;
    private int vehicleModelName;
    private String vehicleType;

    public VehicleManufacturer(String vehicleName, int vehicleModelName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelName = vehicleModelName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(int vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public  abstract  String getManufacturerInformation();
}
