package java8Interface;
import java.util.function.Predicate;
import java.util.Scanner;
public class PredaicateApp {
			    public static void main(String[] args) { 
			    	Predicate<Integer> p = i -> i%2==1;
			 Scanner sc=new Scanner(System.in);
			 System.out.print("Sample Input :\t ");
			 int a=sc.nextInt();
			 System.out.println( "Sample Output :\t "+p.test(a));
			 
			    }
			}



