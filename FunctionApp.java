package java8Interface;
import java.util.function.Function;
import java.util.Scanner;
public class FunctionApp {  
	
	    public static void main(String args[])
	    {    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	      int n=sc.nextInt();
	        Function<Integer,Double> oneforth = a -> a/4.0;
	        System.out.println(oneforth.apply(n));
	    }
	}

