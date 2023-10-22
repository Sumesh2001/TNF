package Bank_Framework;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
		
	}

	@Override
	public void withdraw(float amount) {
		
		if(getAccBal()>getCreditLimit()) 
		{
			setAccBal(getAccBal()-amount);
			
		}
		else System.out.println("INsufficent balance");
		
		
	}

	@Override
	public void deposite(float amount) {
		// TODO Auto-generated method stub
		
	}

}
