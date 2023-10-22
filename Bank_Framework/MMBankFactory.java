package Bank_Framework;

public class MMBankFactory extends BankFactory{
	//SavingAcc getNewSavingAcc
	@Override
	public MMSavingAcc getNewSavingAcc(int AccNo,String accName,float accBal,boolean isSalaried){
		return new MMSavingAcc(AccNo,accName,accBal,isSalaried);
	}
	
	@Override
	public MMCurrentAcc getNewCurrentAcc(int AccNo,String accName,float accBal,float creditLimit) {
		//return CurrentAcc;
		return new MMCurrentAcc(AccNo,accName,accBal,creditLimit);
	}
}
