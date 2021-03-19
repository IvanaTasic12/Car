
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
        audi.printAttributes();
        audi.travel(150);
        audi.printAttributes();

        
        audi.printAttributes();
        
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "x5";
        bmw.printAttributes();
        
        Car fiat = new Car(2010);
        
        System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
        
        Car lada = new Car("Lada","Niva","green", 2018, 0, 50, 10);
        lada.printAttributes();
        
        lada.travel(300);
        lada.printAttributes();
        lada.travel(200);
        lada.printAttributes();
        lada.travel(100);
        
        

        
        
        
        

        
        
        
                

        
        
        
        
        
        
            
    }
    
}
