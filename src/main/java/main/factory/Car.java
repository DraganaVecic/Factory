package main.factory;


public class Car {
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    private double mileage;
    private int passengers;
    private int seats;
    
    
    public Car () {
        this.model = "";
        this.buildYear = 0;
        this.maxSpeed = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
        this.mileage = 0;
        this.passengers = 1;
        this.seats = 0;
    }
    
    public Car(String customModel, int customBuildYear, String customColor, int customMaxFuel) {
        this.model = customModel;
        this.buildYear = customBuildYear; 
        this.color = customColor;
        this.maxFuel = customMaxFuel;
    }
    public Car(String customModel, int customBuildYear, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption, double customMileage) {
        this.model = customModel;
        this.buildYear = customBuildYear; 
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
        this.mileage = customMileage;
        
    }
    
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String customModel) {
        this.model = customModel;
    }
    
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear ) {
        this.buildYear = customBuildYear;   
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel() {
        return this.maxFuel;
    }
    
    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
    public int getCurrentFuel() {
        return this.currentFuel;
    }
    
    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption() {
        return this.consumption;
    }
    
    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }
    
    public int getMaxSpeed() {
       return this.maxSpeed;
    }
    
    public void setMaxSpeed(int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }
    
    public String getVehicleType() {
        return this.vehicleType;
    }
    
    public void setMileage(double customMileage) {
        this.mileage = customMileage;
    }
    
    public double getMileage() {
        return this.mileage;
    }
    
    public void setPassengers(int customPassengers) {
      this.passengers = customPassengers;
    }
    
    public int getPassengers() {
       return this.passengers;
    }
    
    public void setSeats (int customSeats) {
        this.seats = customSeats;
    }
    public int getSeats() {
        return this.seats;
    }
    
   public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara je: " + this.getMaxFuel());
        System.out.println("Maksimalna brzina je: " + this.getMaxSpeed());
        System.out.println("Predjena kilometraza je:" + this.getMileage());
        System.out.println();
    }
    
    
   public void travel(int distance) {
       //1. definisati novi atribut "mileage"
       //2. napraviti get i set metode
       //3. prosiriti jedan od konstruktora da moze da se setuje i mileage
       //
       //4.kolicina goriva da se smanji za onoliko koliko je potroseno
       //5.kilometraza treba da se uveca
       
       //opciono: novi atribut za stanje motora, da li je automobil ukljucen
       
       
       if (this.getCurrentFuel() > (distance * this.getConsumption()) / 100) {
           this.mileage = this.getMileage() + distance;
           this.currentFuel = this.getCurrentFuel() - (distance * this.getConsumption()) / 100;
           System.out.println("Uspesno ste putovali: " + distance + " kilometara.");
       } else {
           System.out.println("Nema dovoljno goriva za put od: " + distance);
       }
          
       
   }
   
    public void fuelUp (int refill) {
       int emptySpace = this.getMaxFuel() -this.getCurrentFuel();
       
       if (refill < emptySpace) {
           this.currentFuel = this.getCurrentFuel() + refill;   
           System.out.println("Uspesno ste sipali " + refill + ". Novo stanje je: " + this.getCurrentFuel());      
        } else {
           this.currentFuel = this.getMaxFuel();
           System.out.println("Rezervoar je pun.Sipali ste: " + emptySpace);
        }
       
}
    
    //stanje: 30 , pokusavamo  da sipamo 7, Uspesno ste sipali 7 l, novo stanje je 37.
    //stanje: 30, pokusavamo da sipamo 40. Sipano je 20, rezervoar je pun.
    
       public void getIn() {
           //1 osoba je usla u vozilo
           if (this.getPassengers() + 1 <= this.getSeats()) {
               this.setPassengers(this.getPassengers() + 1);
               System.out.println("Jedna osoba je usla u auto. Novo stanje je: " + this.getPassengers());
           } else {
               System.out.println("Automobil je pun. Nema mesta za jos jednog putnika");
           }
       }
       
       public void getIn(int numberOfPeople) {
           //numberOfPeople osoba je uslo u vozilo
           if (this.getPassengers() + numberOfPeople <= this.getSeats()) {
               this.setPassengers(this.getPassengers() + numberOfPeople);
               System.out.println(numberOfPeople + " osoba je usla u auto.Novo stanje je: " + this.getPassengers());
           } else {
               System.out.println("U automobilu je trenutno " + this.getPassengers() + " putnika. Ne mogu uci jos " + this.getPassengers());
       }
       
       public void getOut() {
           //1 osoba je izasla iz vozila
          if (this.getPassengers() - 1 <= this.getSeats()) {
               this.setPassengers(this.getPassengers() - 1);
               System.out.println("Jedna osoba je izasla iz auta. Novo stanje je: " + this.getPassengers());
           } else {
               System.out.println(" U automobilu je nula putnika. Ne mogu izaci jos " + this.getPassengers());
           }
       }
       
       public void getOut(int numberOfPeople) {
          //numberOfPeople osoba je izaslo iz vozila
            if (this.getPassengers() - numberOfPeople <= this.getSeats()) {
               this.setPassengers(this.getPassengers() - numberOfPeople);
               System.out.println(numberOfPeople + " osoba je izaslo iz auta. Novo stanje je: " + this.getPassengers());
           } else {
               System.out.println("U automobilu je trenutno nula putnika. Ne mogu izaci jos " + this.getPassengers());
       }   
}
       
 
       
