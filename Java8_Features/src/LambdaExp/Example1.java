package LambdaExp;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Cricket");
		list.add("Hockey");
		list.add("Chess");
		System.out.println("Via lambda Expressions");
		list.forEach(game->System.out.println(game));
		System.out.println("Via Method Reference");
		list.forEach(System.out::println);
		
	}
	
}
