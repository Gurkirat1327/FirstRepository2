package javacollection;

import java.util.*;

public class MAPcollection {

	public static void main(String[] args) {
		
		//when we are doing maps same as set
		Map<Integer,String> hm = new HashMap<>();
		hm.put(10, "Ten");
		hm.put(15, "Fifteen");
		hm.put(20, "Twenty");
        hm.put(2,"Two" );
       	hm.put(1, "One");
      
       	System.out.println(hm.get(10));
       	System.out.println(hm);
       	System.out.println("============Linked==========");
       
       	
       	Map<Integer,String> hm1 = new LinkedHashMap<>();
		hm1.put(10, "Ten");
		hm1.put(15, "Fifteen");
		hm1.put(20, "Twenty");
       hm1.put(2,"Two" );
       	hm1.put(1, "One");
      
       	System.out.println(hm1.get(10));
       	System.out.println(hm1);
 	System.out.println("============Treemap==========");
       
       	
       	Map<Integer,String> hm2 = new TreeMap<>();
		hm2.put(10, "Ten");
		hm2.put(15, "Fifteen");
		hm2.put(20, "Twenty");
       hm2.put(2,"Two" );
       	hm2.put(1, "One");
      
       	System.out.println(hm2.get(10));
       	System.out.println(hm2);
    	
    	
	}    	

}
