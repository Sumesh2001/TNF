package Bank_Framework;

public abstract class CurrentAcc extends Bank_acc {
	float creditLimit;

	public CurrentAcc(int accNo,String accName,float accBal,float creditLimit) {
		super(accNo,accName,accBal);
		this.creditLimit=creditLimit;
	}
	
	public float getCreditLimit() {
		if(creditLimit == 1200) {
			creditLimit=1000;
		}
		
		return creditLimit;
	}
	
	
	public abstract void withdraw(float amount);
}
