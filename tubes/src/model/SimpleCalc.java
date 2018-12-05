package model;
public class SimpleCalc{
	private double first, second;

	public void setFirst(double first){
		this.first = first;
	}
	public void setSecond(double second){
		this.second = second;
	}

	public double sum(){
		return first+second;
	}

	public double diff(){
		return first-second;
	}

}