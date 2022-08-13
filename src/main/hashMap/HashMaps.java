package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMaps {
    public static void main(String[] args) {
     HashMap<String,String> hashMaps= new HashMap<String,String >();
     hashMaps.put("Japan","Tokyo");
     hashMaps.put("Bangladesh","Dhaka");
     hashMaps.put("Inida","Delli");
     hashMaps.put("Pakintan","Karachi");
     hashMaps.put("London","Uk");
     hashMaps.put(null,"France");
     hashMaps.put(null,"Doha");
     hashMaps.put("German",null);
     hashMaps.put("Finland",null);
     Iterator<String> itr=hashMaps.keySet().iterator();
     while (itr.hasNext()){
         String key=itr.next();
        String val= hashMaps.get(key);
        System.out.println(key +" : "+val);
     }
     System.out.println("===========Using for each loop=========");
     hashMaps.forEach((k,v) ->System.out.println("Key: "+k+" value :"+v));

     System.out.println("=====Iterator print key value pair========");
     Iterator<Map.Entry<String,String>> hs=hashMaps.entrySet().iterator();
     while (hs.hasNext()){
        Map.Entry<String,String> hss= hs.next();
        System.out.println(hss.getKey()+" : "+hss.getValue());
     }

    }

}
