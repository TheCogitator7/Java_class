public class Accounting{
	public static double valueOfSupply;

	public static double vatRate=0.1;

	public static double getVAT(){
		return valueOfSupply * vatRate;
}
	public static double getTotal(){
		return valueOfSupply + getVAT();
}
}