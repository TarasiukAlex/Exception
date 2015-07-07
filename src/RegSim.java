import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by all on 08.04.2015.
 */
public class RegSim {

    void reg(String s){
        Pattern p1 = Pattern.compile("[0-9]");

    }


    public static void main (String [] args){

        Pattern pat;
        Matcher mat;
        boolean found;

        RegSim a = new RegSim();

        a.reg("1223");
        System.out.println();

        pat = Pattern.compile("Java");
        mat  = pat.matcher("[A-Za-z]");
        found = mat.matches();

        System.out.println( "Проверка совпадения ");
        if (found) {
            System.out.println("Совпадает");
        }
        else {
            System.out.println("Не совпадает");
        }
        System.out.println();
        System.out.println("Проверка совпадений с Java 7");
        mat = pat.matcher("Java 7");
        found = mat.matches();
        if (found) {
            System.out.println("Совпадает");
        }
        else {
            System.out.println("Не совпадает");
        }
    }
}
