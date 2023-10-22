package Bank_Framework;

public abstract class Bank_acc {
	private int accNo;
	private String accName;
	private float accBal;
	
	
	public Bank_acc(int accNo,String accName,float accBal) {
		this.accNo=accNo;
		this.accName=accName;
		this.accBal=accBal;
		
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public float getAccBal() {
		return accBal;
	}
	
	
	
	public abstract void withdraw(float amount);
	public abstract void deposite(float amount);
	
	@Override
	public String toString() {
		return "Bank_acc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	

}
