package abstraction;

import java.util.function.Consumer;

import poly.Addition;

public class InterfaceDemo {

	public static void main(String[] args) {
	
		/*
		 * Speaker s = new Teacher(); s.speak();
		 * 
		 * s = new Speaker() {
		 * 
		 * @Override public void speak() { System.out.println("Anonymous speaker"); }
		 * 
		 * }; s.speak();
		 */

		
		/*
		 * //public int add(int a, int b);
		 * 
		 * Adder ad = (x,y)->x+y;
		 * 
		 * int res = ad.add(4, 5);
		 * 
		 * System.out.println(res);
		 * 
		 * 
		 * //public int sub(int a);
		 * 
		 * Subtracter sb =x->x-5; int res1 = sb.sub(10); System.out.println(res1);
		 * 
		 * //public abstract void speak();
		 * 
		 * Speaker s1 = ()->System.out.println("Lambda speaker"); s1.speak();
		 * 
		 * AdderForIntandString s2 = (x,y,z)->x+Integer.parseInt(y)+Integer.parseInt(z);
		 * s2.add(2, "5","3");
		 * 
		 * 
		 * Consumer<Integer> cons=t->System.out.println(t); cons.accept(50);
		 * 
		 */
	Addition poYADD = new Addition();
		
		Adder ad =  poYADD::addition;
		ad.add(3, 4);
		
	}

}
