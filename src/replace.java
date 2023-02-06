import java.util.Vector;

public class replace {

	public static void main(String[] args) {
		  Vector<String> vec = new Vector<String>(3);  
          //Adding elements to a vector  
          vec.add("Tiger");  
          vec.add("Lion"); 
          vec.add("Cat"); 
          vec.add("Dog");  
          vec.add("Elephant");  
           
          System.out.println("Default capacity is: "+vec.capacity());  
          System.out.println("Size is: "+vec.size());  
          
          System.out.println("Vector element is: "+vec);  
	}
}