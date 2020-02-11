package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        System.out.println("Pocetak");
        
        String message = "Ovo je poruka";
        
        Car fiat = new Car();
        fiat.model = "Fiat Punto";
        fiat.buildYear = 2010;
        fiat.color = "black";
        fiat.consumption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        System.out.println("Model: " + fiat.model);
        System.out.println("Godina proizvodnje: " + fiat.buildYear);
        System.out.println("Boja: " + fiat.color);
        System.out.println("Potrosnja: " + fiat.consumption);
        System.out.println("Maximalna brzina: " + fiat.maxSpeed);
        System.out.println("Trenutno stanje goriva: " + fiat.currentFuel);
        System.out.println("Maximalna potrosnja: " + fiat.maxFuel);
        
        
        
        Car ford = new Car();
        ford.model = "Ford fiesta";
        ford.buildYear = 2015;
        ford.color = "white";
        ford.consumption = 5;
        ford.maxSpeed = 160;
        ford.currentFuel = 30;
        ford.maxFuel = 55;
        
        
        
        System.out.println("Model: " + ford.model);
        System.out.println("Godina proizvodnje: " + ford.buildYear);
        System.out.println("Boja: " + ford.color);
        System.out.println("Potrosnja: " + ford.consumption);
        System.out.println("Maximalna brzina: " + ford.maxSpeed);
        System.out.println("Trenutno stanje goriva: " + ford.currentFuel);
        System.out.println("Maximalna potrosnja: " + ford.maxFuel);
        
        Car peugeot = new Car();
        peugeot.model = "Peugeot 3008";
        peugeot.buildYear = 2017;
        peugeot.color = "silver";
        peugeot.consumption = 6;
        peugeot.maxSpeed = 170;
        peugeot.currentFuel = 35;
        peugeot.maxFuel = 60;
        
        
        
        System.out.println("Model: " + peugeot.model);
        System.out.println("Godina proizvodnje: " + peugeot.buildYear);
        System.out.println("Boja: " + peugeot.color);
        System.out.println("Potrosnja: " + peugeot.consumption);
        System.out.println("Maximalna brzina: " + peugeot.maxSpeed);
        System.out.println("Trenutno stanje goriva: " + peugeot.currentFuel);
        System.out.println("Maximalna potrosnja: " + peugeot.maxFuel);
        
        
        
        
        
        
        
        
    }
    
}
