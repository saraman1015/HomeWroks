package compareTwoArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String[] args) {
        ArrayList<String> ar= new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        ArrayList<String> ar1= new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        /*
        Very first thing is I need to sort both ArrayList , then compare , How to sort , use Collections class
         */
        Collections.sort(ar);
        Collections.sort(ar1);
        System.out.println(ar.equals(ar1));

        /*
           Important Interview question :  compare between two arraylist and find out additional elements from it
         */
        System.out.println("=========================");
        ArrayList<String> ar3= new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        ArrayList<String> ar4= new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G"));
        ar4.removeAll(ar3);
        System.out.println(ar4);
        /*
          Interview Question: Find out common element  between two ArrayList
         */
        System.out.println("=======================");
        ArrayList<String> ar5= new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        ArrayList<String> ar6= new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G"));
        ar5.retainAll(ar6);
        System.out.println(ar5);



    }
}
