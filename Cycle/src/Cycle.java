
public class Cycle {
	private int numberOfWheels;
	private int weight;
	/**
	 * Assign respective parameters to its properties in class
	 * @param numberOfWheels
	 * @param weight
	 */
	public Cycle(int numberOfWheels, int weight)
	{
		this.numberOfWheels= numberOfWheels;
		this.weight= weight;
	}
	/**
	 * Initialize the properties with default values of 100, 1000 for numberOfWheels and weight respectively
	 */
	public Cycle()
	{
		this(100,1000);
	}
	
	/*public void setNumberOfWheels(int value){numberOfWheels=value;}
	public int getNumberOfWheels(){return numberOfWheels; }
	public void setWeight(int value){ weight = value;}
	public int getWeight(){ return weight; }*/
	
	/**
	 * Convert the value of numberOfWheels and weight to string
	 */
	public String toString()
	{
		String s = "number of wheels: ";
		s += Integer.toString(numberOfWheels);
		s += ", weight: ";
		s += Integer.toString(weight);
		return s;
	}
}
