/*
 * 3)Write a program in java for LambdaExpressionFilter demo. The filter will filter the list 
of electronic products whose cost is less than 20000 and print the details of products in the list
whose cost is greater than 20000
Step1: Create an Electronic Product bean class with attributes id , name and price
Step2: create a main method and add list of products created to product list
Step3: create a stream object and filter the list using stream filter and lambda expression
Step4: Using lambda expression iterate through list to print product name and product price
Sample output
Iphone 6S: 65000.0
Sony Xperia: 25000.0
Redmi4 : 26000.0
 */

package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product6
{
	int id;
	String name;
	float price;
	
	public Product6(int id, String name, float price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
public class LamdaExpressionFilter {
	
	
	public static void main(String[] args) 
	{
		List<Product6> list=new ArrayList<Product6>();
		
		list.add(new Product6(1,"Nokia Lumia",26000f));
		list.add(new Product6(3,"Lenevo Vibe",19000f));
		list.add(new Product6(2,"Sony Xperia",35000f)); 	   
		list.add(new Product6(4,"Samsung A5",24000f));
		list.add(new Product6(5,"Iphone 6S",68000f));
		list.add(new Product6(6,"Redmi4 ",20000f));
		  
		Stream<Product6> filterdata = list.stream().filter(p -> p.price>20000);
		
		filterdata.forEach(product -> System.out.println(product.id + " " + product.name + " " + product.price));
		  
	}

}
