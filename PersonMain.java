class Book{
    private String title;
    private String author;
    private int pgno;

    Book (String title, String author, int pgno){
        this.title = title;

        this.author = author;

        this.pgno = pgno;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    
    public int getPgno(){
        return pgno;
    }

}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Student extends Person{
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor(){
        return major;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person obj1 = new Student("Alice", 20, "Computer Science");
        System.out.println("Name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
        System.out.println("Major: " + ((Student) obj1).getMajor());

        Book book = new Book("JAVA", "ayan", 500);

        System.out.println("name " + book.getTitle());
        System.out.println("author " + book.getAuthor());
        System.out.println("pgno " + book.getPgno());

    }
}
