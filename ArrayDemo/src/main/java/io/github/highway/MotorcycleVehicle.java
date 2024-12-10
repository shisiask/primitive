package io.github.highway;

public class MotorcycleVehicle extends Vehicle implements Motorcycle{
    private String MotorcycleType;

    public void setMotorcycleType(String MotorcycleType){
        this.MotorcycleType = MotorcycleType;
    }

    public String getMotorcycleType(){
        return MotorcycleType;
    }

}
