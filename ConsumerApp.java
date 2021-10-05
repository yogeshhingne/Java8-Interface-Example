package java8Interface;
	import java.util.function.Consumer;


public class ConsumerApp {
	    public static void main(String args[])
	    {
	        Consumer<String> display = a -> System.out.println(a);
	 
	       	        display.accept("Happy with Trainer");
	}
	}


