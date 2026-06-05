package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class SortingDemo {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		
		list.add("javeed");
		list.add("tom cruze");
		list.add("smith");
		list.add("akash kumar");
		list.add("jerry");
		
		
		//	list.stream().sorted().forEach(System.out::println);
		
		boolean isAvailable =	list.stream().anyMatch((String name) -> { return  name.startsWith("k");} );
		
			System.out.println(isAvailable);
			
			
	}

}
