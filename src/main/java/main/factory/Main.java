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
        
        Car fiat = new Car("Fiat Punto", 2010, "black", 45);
        fiat.showData();
        //Car = ("Fiat Punto", 2010, "black", 6, 20, 45)
        
        
        /*fiat.setModel("Fiat Punto");
        fiat.setBuildYear(2010);
        fiat.setColor("black");
        fiat.setConsumption(6);
        fiat.setCurrentFuel(20);
        fiat.setMaxFuel(45);
        fiat.setMaxSpeed(170);*/
        
        
        Car ford = new Car("Ford", 2015, "red", 40, 10, 5, 300); 
        ford.showData();
        
        /*ford.setModel("Ford fiesta");
        ford.setBuildYear(2015);*/
        
        
        
        //System.out.println("Model: " + ford.getModel());
        
        Car lada = new Car("Lada Niva", 1980, "green", 50, 40, 10, 500);
        lada.showData();
        lada.travel(20);
        lada.showData();
        
        lada.travel(400);
        lada.showData();
        
        lada.fuelUp(20);
        lada.travel(400);
        
        lada.fuelUp (10);
        lada.travel(400);
        
       
        
       // Car peugeot = new Car();
      //  peugeot.model = "Peugeot 3008";
      //  peugeot.buildYear = 2017;
       // peugeot.color = "silver";
       // peugeot.consumption = 6;
       // peugeot.maxSpeed = 170;
       // peugeot.currentFuel = 35;
       // peugeot.maxFuel = 60;
        
        
        
       // System.out.println("Model: " + peugeot.model);
      //  System.out.println("Godina proizvodnje: " + peugeot.buildYear);
       // System.out.println("Boja: " + peugeot.color);
        //System.out.println("Potrosnja: " + peugeot.consumption);
       // System.out.println("Maximalna brzina: " + peugeot.maxSpeed);
       // System.out.println("Trenutno stanje goriva: " + peugeot.currentFuel);
       // System.out.println("Maximalna potrosnja: " + peugeot.maxFuel);
        
    
        
        
        
        
        
        
    }
    
}
