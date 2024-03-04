public class Accountings{
	public double valueOfSupply;//공급가액
	public static double vatRate=0.1;//부가가치

	public Accountings(double valueOfSupply){
		this.valueOfSupply=valueOfSupply;
}
	public double getVAT(){
		return valueOfSupply * vatRate;
}
	public double getTotal(){
		return valueOfSupply + getVAT();
}	
}