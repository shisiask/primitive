package io.github.shisiask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Vehicle implements HighwayVehicles{
    private String VIN;
    private String Make;
    private String Model;
    private int Year;

    public void setVIN(String VIN){
        this.VIN = VIN;
    }

    public String getVIN(){
        return VIN;
    }

    public void setMake(String Make){
        this.Make = Make;
    }

    public String getMake() {
        return Make;
    }

    public void setModel(String Model){
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }
    public void setYear(int Year){
        this.Year = Year;
    }

    public int getYear(){
        return Year;
    }

    public static void main(String[] args) {

    }
}