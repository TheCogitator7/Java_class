public class AccountingsApp{
	public static void main(String[] args){
	Accountings a1=new Accountings(10000.0);
	System.out.println("Value of supply : "+a1.valueOfSupply);
	System.out.println("VAT : "+a1.getVAT());
	System.out.println("Total : "+a1.getTotal());
}
}