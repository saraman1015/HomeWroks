package collections;

import java.util.*;

public class ArrayListsMethods {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Java");
        ar.add("Selenium");
        ar.add("python");
        ar.add("PHP");
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("Sql");
        ar1.add("JavaScript");

        /*
        Question: Can you combine tow array list together ?
        Answer: Yes.
         */
        int i = ar1.lastIndexOf("Sql");
        System.out.println(i);
        //System.out.println(ar1.lastIndexOf("sql")>0);
        ar.addAll(ar1);
        System.out.println(ar);
        System.out.println(ar.lastIndexOf("sql"));
        //this is a first way of doing it .
        //Does any one knows how to clear data from reference variable?
        //Answer: clear()
        ar.clear();
        System.out.println(ar);
        /*
         Question: Can we clone  data from one list to another list
         Answer: Yes
         ==I want  to clone  data that is stored inside     ar
         */
        ar.clone();//-- I just clone data now I need to store it into ArrayList
        ArrayList<String> ar2 = (ArrayList<String>) ar.clone();
        System.out.println("Cloned list :" + ar2);

        ArrayList<String> lsts = new ArrayList<String>(Arrays.asList("Sheikh", "Rahman", "Java", "Program"));
        System.out.println(lsts);
        System.out.println(lsts.remove(2));
        System.out.println(lsts);
         /*
         Suppose I have some number which index based. such as 123456789 like this , but I want to
         print only the odd number such as 13579 or 2468
         how you can do that
          */
        List<Integer> aslt = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        aslt.removeIf(ast ->ast%2 ==1);
        System.out.println(aslt);
//        if(aslt==0||aslt%2==0){
//
//        }
        List<Integer> sls= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer>lists= new ArrayList<Integer>(sls);
         for (Integer e:lists){
           //  System.out.print("Nun"+e);
             if(e%2==0){
                 System.out.print(e+",");
             }
         }

        ArrayList<String>sr= new ArrayList<String>(Arrays.asList("Sam","John","Mem","Jov"));
        sr.removeIf(sm ->sm.contains("Sam"));
        System.out.println(sr);

        List<String> strng= new ArrayList<String>(Arrays.asList("Mohammad","Javed","khan","Samuel","Iftkher","Alal"));
        Object [] lss=strng.toArray();
        for(int m=0;m<strng.size();m++){
            System.out.println("M "+strng.get(m));
        }

        List<String> slt= Collections.synchronizedList(new ArrayList<String>());
    }

}