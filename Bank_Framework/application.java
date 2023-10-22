package Bank_Framework;

public class application {
	public static void main(String arg[]) {
		BankFactory b=new MMBankFactory();
		SavingAcc sa=b.getNewSavingAcc(21, "Sumesh", 20000, true);
		CurrentAcc ca=b.getNewCurrentAcc(23, "Unni", 220, 700);
		
		System.out.println("Total Balance of Saving account before withdraw is : " +sa.getAccBal());
		System.out.println("Total Balance of Current account  before withdraw is : " +ca.getAccBal());
		
		sa.withdraw(200);
		ca.withdraw(200);
		
		System.out.println("Total Balance of Saving  account after withdraw is : " +sa.getAccBal());
		System.out.println("Total Balance of Current  account after withdraw is : " +ca.getAccBal());
	}
}
