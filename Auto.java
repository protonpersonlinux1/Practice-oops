abstract class Vehicle {
    private String name;
    private int year;
    private String model;

    public Vehicle(String name, int year, String model){
        this.model = model;
        this.name= name;
        this.year = year;
    }

    public abstract void drive();
    
    public String getName() {
        return name;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getModel() {
        return model;
    }
}

class Mercedes extends Vehicle {
    private int numDoors;

    public Mercedes(String name, String model, int year, int numDoors){
        super(name, year, model);
        this.numDoors = numDoors;
    }

    @Override

    

    public void drive() {
        System.out.println("driving car");
    }
        public int numDoors(){
            return numDoors;
        }
  
    
}

class Truck extends Vehicle{
    private int tires;
    private int payloadcapacity;

    public Truck(String name, String model, int year, int tires, int payloadcapacity){
        super(name, year, model);
        this.tires = tires;
        this.payloadcapacity = payloadcapacity;
    }

    @Override
    public void drive() {
        System.out.println("driving truck");
    }

        public int getTires(){
            return tires;
        }
}

class Auto{
    public static void main(String[] args){
        Mercedes M = new Mercedes("hi", "Benz", 2013, 100);
        Truck T = new Truck("hi", "truck", 2013, 10, 100);

        M.drive();
        T.drive();

        System.out.println(M.numDoors() + " " + M.getName() + " " + M.getModel() + " " + M.getYear());
        System.out.println(T.getTires() + " " + T.getName() + " " + T.getModel() + " " + T.getYear());
    }
}

