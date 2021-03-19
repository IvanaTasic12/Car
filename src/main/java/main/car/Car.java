
package main.car;


public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    
    public Car(){
        
    }
    
    public Car(int year){
        this.buildYear = year;
        
    }
    
    public Car(String brand, String model, String color, int buildYear){
        this.brand = brand;
        this.model = color;
        this.color = color;
        this.buildYear = buildYear;
        
    }
    
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void printAttributes(){
        System.out.println("Brand:" + this.brand );
        System.out.println("Model:" + this.model );
        System.out.println("Color:" + this.color );
        System.out.println("Build year:" + this.getBuildYear() );
    }
    
}
