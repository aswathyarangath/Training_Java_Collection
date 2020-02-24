package collection.list;

public class Hall implements Comparable<Hall>{
	String name;
	double costperday;
	int capacity;
	Hall(String name,double costperday,int capacity){
		this.name=name;
		this.costperday=costperday;
		this.capacity=capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCostperday() {
		return costperday;
	}
	public void setCostperday(double costperday) {
		this.costperday = costperday;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int compareTo(Hall ob){
		double comcostperday=((Hall)ob).getCostperday();
		return (int) (comcostperday-this.costperday);
	}
	
}
