package Bank_Framework;

public class MMSavingAcc extends SavingAcc{

	private static final float MiniBal =12000;
		
	
	public MMSavingAcc(int accNo,String accName,float accBal,boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
		this.isSalaried=isSalaried;
	}
	
	
	@Override
	public void withdraw(float amount) {
		if(getAccBal()-amount>=MiniBal) {
			setAccBal(getAccBal()-amount);
		}
		else {
			System.out.println("Inssufficent");
		}
		
	}

	@Override
	public void deposite(float amount) {
		// TODO Auto-generated method stub
		
	}

}
