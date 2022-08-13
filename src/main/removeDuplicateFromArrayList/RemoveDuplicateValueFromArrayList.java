package removeDuplicateFromArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateValueFromArrayList {
    /*
    How do you remove duplicate  element from arraylist??
    There are tow way we can do it.
     */
    public static void main(String[] args) {
        //Using LinkedHashSet
        //Suppose I have ArrayList where I stored multiple duplicate data. but I wnat to print only constant data
        ArrayList<Integer> num= new ArrayList<Integer>(Arrays.asList(1,5,2,5,4,5,6,7,8,4,5,6,1,0,3, 9));
        // Now we need to pass  ArrayList inside    --LinkedHashSet--
        LinkedHashSet<Integer> linkset= new LinkedHashSet<Integer>(num);
        System.out.println(linkset);
        System.out.println("===========================================");
        ArrayList<Integer>distinctList= new ArrayList<Integer>(linkset);
        System.out.println(distinctList);
    }
}
