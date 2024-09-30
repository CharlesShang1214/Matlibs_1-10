import java.util.Scanner;

public class matlibs{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        while (true) {


        String madlib;
        while (true) {
            System.out.println("Which madlib you want?(one-two-three)");
            String matlibNum= scanner.nextLine();
            if (matlibNum.compareTo("one")==0) {
            madlib="I went to the animal <noun>, the <plural_noun> and the <number> beasts were there." ;
            break;
            }

            if (matlibNum.compareTo("two")==0) {
                madlib="Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
                break;
            }
            if (matlibNum.compareTo("three")==0) {
                madlib="The <adjective> <animal> decided to <verb> all day, but <different adjective> <different animal> <different verb> it.";
                break;
            }
            else{
                System.out.println("Please input one, two, or three, all lowercase.(Has to be words!)");
            }
        }
        while (madlib.indexOf("<")!=-1) {
        //https://www.w3schools.com/java/java_operators.asp
        String BSB=madlib.substring(madlib.indexOf("<"),madlib.indexOf(">")+1);
        System.out.println("Please give me a "+BSB);
        String word= scanner.nextLine();
        madlib=madlib.replace(BSB,word);
}
        System.out.println(madlib);
        // this is method one that what probably ap grader would want
        // String BSB1=madlib.substring(madlib.indexOf("<"),madlib.indexOf(">")+1);
        // System.out.println("Please give me a "+BSB1);
        // String wordOne= scanner.nextLine();
        // madlib=madlib.replace(BSB1,wordOne);


        // String BSB2=madlib.substring(madlib.indexOf("<"),madlib.indexOf(">")+1);
        // System.out.println("Please give me a "+BSB2);
        // String wordTwo= scanner.nextLine();
        // madlib=madlib.replace(BSB2,wordTwo);


        // String BSB3=madlib.substring(madlib.indexOf("<"),madlib.indexOf(">")+1);
        // System.out.println("Please give me a "+BSB3);
        // String wordThree= scanner.nextLine();
        // madlib=madlib.replace(BSB3,wordThree);
        // System.out.println(madlib);
        System.out.println("Do you want to try angain?(yes or no)");
        String again=scanner.nextLine();
        if (again.compareTo("no")==0) {
            System.out.println("Sure, Thanks For Playing");
            break;
        }
        else{
            System.out.println("Sure, lets do it again");
        }

        }
    }}
