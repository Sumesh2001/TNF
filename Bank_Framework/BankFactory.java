package Bank_Framework;

public abstract class BankFactory {
	public SavingAcc getNewSavingAcc(int AccNo,String accName,float accBal,boolean isSalaried){
		return new SavingAcc(AccNo,accName,accBal,isSalaried);
		
	}

	public CurrentAcc getNewCurrentAcc(int AccNo,String accName,float accBal,float creditLimit) {
		//return CurrentAcc;
		return new CurrentAcc(AccNo,accName,accBal,creditLimit);
	} 
}
