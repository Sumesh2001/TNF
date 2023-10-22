package Bank_Framework;

public abstract class SavingAcc extends Bank_acc {
	boolean isSalaried;
	static final float MiniBal=10000;
	
	public SavingAcc(int accNo,String accName,float accBal,boolean isSalaried) {
		super(accNo,accName,accBal);
		this.isSalaried=isSalaried;
	}
	
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public float getMiniBal() {
		return MiniBal;
	}



	public abstract void withdraw(float amount);
	
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalaried + "]";
	}
	
}
