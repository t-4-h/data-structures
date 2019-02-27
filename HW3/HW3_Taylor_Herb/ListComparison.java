import java.util.*;


public class ListComparison <E> {
	

	public static void main(String[] args) {

		   long start = System.nanoTime();

		   ArrayList<Integer> array = new ArrayList<>();
		   LinkedList<Integer> link = new LinkedList<>();
		   
		   
		   //////ARRAYLIST ADD
		   start = System.nanoTime();
		   for (int i = 0; i < 1000000; i++) {
			   array.add(i);
		   }
	
		   
		   System.out.println("ArrayList add: " + (System.nanoTime()- start)/1000000000.0+ " secs");    
		   
		   
		   ///////LINKEDLIST ADD
		   
		   start = System.nanoTime();
		   
		   for (int p = 0; p < 1000000; p++) {
			   link.add(p);
		   }
		   
		   System.out.println("LinkedList add: " + (System.nanoTime()- start)/1000000000.0+ " secs");  
		

		   ///////ARRAYLIST GET
		   start = System.nanoTime();
		   
		   for (int j = 0; j < 1000000; j++) {
			   array.get(j);
			   
		   }
		   
		   System.out.println("ArrayList get: " + (System.nanoTime() - start)/1000000000.0+ " secs");

		
		 ///////LINKEDLIST GET -- had to reduce size to get through program; 1 million timed out
		 start = System.nanoTime();
		  
		/*	for (Integer q : link) {
				link.get(q);
			} *///not working; times out 
		   
		/* for (int q = link.size-1; q >= 0; q--) {
			   link.get(q); 
			} *///not working; times out
		 
		 /* for (int q = 0; q < 9000; q++) {
		 		link.get(q);
			} */// works; super slow (~ .2438secs)
		 
		  for (int q = 9000; q >= 0; q--) {   
			   link.get(q);   
		  	} //works; (~ .0898secs)
		   
		   System.out.println("LinkedList get: " + (System.nanoTime() - start)/1000000000.0+ " secs"); 
		
		 
		   ///////ARRAYLIST REMOVE
		   start = System.nanoTime();
		   
		   for (int t = array.size()-1; t >= 0; t--) {
			   array.remove(t);
		   }
		  
		   
		   System.out.println("ArrayList remove: " + (System.nanoTime() - start)/1000000000.0 + " secs"); 

		   
		   
		   ///////LINKEDLIST REMOVE
		   start = System.nanoTime();
	

		   for (int j = link.size()-1; j >= 0; j --) {
			   link.remove(j);
		   }
		   System.out.println("LinkedList remove: " + (System.nanoTime() - start)/1000000000.0 + " secs"); 
		   
}}