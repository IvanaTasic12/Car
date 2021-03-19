
package main.car;


public class Main {

    
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Car audi = new Car();
        audi.printAttributes();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "black";
//        audi.buildYear = 2005;
        
        audi.printAttributes();
        
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "x5";
        bmw.printAttributes();
        
        Car fiat = new Car(2010);
        
        System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
        
        Car lada = new Car("Lada","Niva","green", 2018, 0, 20, 5);
        lada.printAttributes();
        
        lada.travel(100);
        
        lada.printAttributes();
        
        
        
        

        
        
        
                

        
        
        
        
        
        
            
    }
    
}
