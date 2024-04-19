package ud7;

public class SimploteCalculadora 
{
	public double add(double numA, double numB)
	{
		return numA + numB;
	}
	
	public double difference(double numA, double numB)
	{
		return numA - numB;
	}
	
	public double multiply(double numA, double numB)
	{
		return numA * numB;
	}
	
	public Double divide(double num, double den)
	{
		if(den == 0)
			return null;
		return num / den;
	}
}