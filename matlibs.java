import java.util.Scanner;

public class matlibs{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String madlib="I went to the animal <noun>, the <plural_noun> and the <number> beasts were there." ;
        String betweenSqBrac=madlib.substring(madlib.indexOf("<")+1,madlib.indexOf(">"));
        if (betweenSqBrac=="noun"){
            System.out.println("Please give me a noun");
            String noun=scanner.nextLine();
        }


    }
}