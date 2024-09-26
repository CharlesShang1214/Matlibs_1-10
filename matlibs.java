import java.util.Scanner;

public class matlibs{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Give me a noun");
        String noun=scanner.nextLine();
        System.out.println("Give me a plural noun");
        String pNoun=scanner.nextLine();
        System.out.println("Give me a number");
        String number=scanner.nextLine();
        System.out.println("Give me a adj");
        String adj=scanner.nextLine();
        System.out.println("Give me a adv");
        String adv=scanner.nextLine();
        System.out.println("I went to the animal "+noun+", the "+pNoun+" and the "+number+ " beasts were there.");
        

    }
}