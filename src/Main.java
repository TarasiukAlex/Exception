import java.util.ArrayList;
import java.util.*;

/**
 * Created by all on 10.04.2015.
 */
public class Main {
     protected static final float pi = 3.14f;

    public static void main (String [] qwe){

       List <String> ls =  new ArrayList<String>();
        ls.add("qw");
        ls.add("wd");
        for (String i: ls){
            System.out.println(i);
        }
//        Iterator<String> iter = ls.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
    Set <String> set= new TreeSet <String>();
        set.add("a11111");
        Iterator<String> iter1 = set.iterator();
        while (iter1.hasNext()){
            System.out.println(iter1.next());
        }



    }
}
