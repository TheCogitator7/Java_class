public class Acc{
	//공급가액
	public static double valueOfSupply=10000.0;

	//부가가치세율
	public static double vatRate=0.1;

	public static double getVAT(){
		return valueOfSupply * vatRate;//1000.0
}
	public static double getTotal(){
		return valueOfSupply + getVAT();//11000.0
}

	public static void main(String[] args){
		System.out.println("Value of supply : "+valueOfSupply);//Value of supply : 10000.0
		System.out.println("VAT : "+getVAT());//VAT : 1000.0
		System.out.println("Total : "+getTotal());//Total : 11000.0
}
}