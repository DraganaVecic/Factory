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
        System.out.println("Model: " + ford.model);
        
        
        
        
        
        
        
        
        
        
    }
    
}
