import java.util.Scanner;

public class Clas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Wat is ur shape?: ");
        String shape = scn.next();
        
        switch(shape){
            case "circle": System.out.print("You chose: " + shape + "!");
            break;

            case "square": System.out.println("You chose: " + shape + "!");
            break;

            case "rectangle": System.out.println("You chose: " + shape + "!");
            break;

            case "rhombus": System.out.println("You chose: " + shape + "!");
            break;

            case "triangle": System.out.println("You chose: " + shape + "!");
            break;

            default: System.out.println("WRONG");
        }
    }
}
