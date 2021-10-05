package oop;

public class Dice {
	
	
private	int faceValue;
	
public int getFaceValue()
{
	return faceValue;
}

public void setFaceValue(int faceValue)
{
	this.faceValue = faceValue;
}
	public void roll() {
		
		faceValue =(int) (Math.random()*10)%5+1;
	}

}
// 0-1 0.01, 0.934 1-6 2.34