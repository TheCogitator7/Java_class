public class AccountingSum{
	public static void main(String[] args){
		Accounting.valueOfSupply=10000.0;
		System.out.println("Value of supply : "+Accounting.valueOfSupply);
		System.out.println("VAT : "+Accounting.getVAT());
		System.out.println("Total : "+Accounting.getTotal());
}
}