package oop;

public class Player {
	private int value;
	private String name;
	//100
	//default constructor or No arg constructor
	
	
	
	// setter
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	// getter
	
	
	public int getValue()
	{
		return value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Player()
	{
	name = "krishna";
		System.out.println("Defualt constructor");
	}
	// arg or parameterized constructor
	public Player(String name)
	{
		//System.out.println(name);
		this.name = name;
	}
	
	
	public void throwDice(Dice d1,Dice d2)
	{
		d1.roll();
		d2.roll();
		value = d1.getFaceValue() + d2.getFaceValue();
	}

}
