package abstraction;

public interface Speaker {
	
	
	public abstract void speak();
	public default int add(int a, int b)
	{
	return a + b;	
	}
	
	
	/*
	 *  1) create sub class for interface using implements keyword
	 *  
	 *  2) anonymous classes
	 *  
	 *  3) lambda expression- interface must be functional interface
	 *  
	 *   functional interface is an interface with exactly one abstract method
	 *   
	 *   @FunctionalInterface
	 *   
	 *   
	 *   4) method references
	 */
	
}
