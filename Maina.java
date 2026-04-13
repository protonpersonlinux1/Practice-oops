class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void makeSound(){
        System.out.println("make sound");
    }
}

class Dog extends Animal{
    private String breed;

    public Dog(String breed, String name, int age) {
            super(name, age);
            this.breed = breed;
        }
    
        public String getBreed(){
            return breed;
        }

    @Override
    public void makeSound(){
        System.out.print("bark");
    }
}

class Cat extends Animal{
    private boolean inIndoor;

    public Cat(String name, int age, boolean isIndoor){
            super(name, age);
            this.inIndoor = isIndoor;
        }

    public boolean isIndoor(){
        return inIndoor;
    }

    @Override

    public void makeSound(){
        System.out.println("meaows");
    }
}

class Maina{
    public static void main(String[] args) {
        Dog d = new Dog("Golden Retriever", "hi", 5);
        Cat c = new Cat("Meauw", 2, true);

        System.out.println(d.getName() + " - " + d.getAge() + " - " + d.getBreed());

        d.makeSound();
        System.out.println(c.getName() + " - " + c.getAge() + " - " + c.isIndoor());
        c.makeSound();
    }
}