package packages;

public abstract class AccountState
{
	protected Account acc;
	protected double balance=0;

    public abstract void stateCheck(double amount);
	
    public void deposit(double amount)
    {
    	System.out.println(acc.getName() + "���" + amount + "Ԫ��");
		this.balance+=amount;
		stateCheck(amount);
		System.out.println("ʣ����Ϊ��" + this.balance);
    }
    
	public void withdraw(double amount)
	{
		System.out.println(acc.getName() + "ȡ��" + amount + "Ԫ��");
		this.balance-=amount;
		stateCheck(amount);
		System.out.println("ʣ����Ϊ��" + this.balance);
	}
	
	public void setBalance(double balance) {
		this.balance = balance; 
	}

	public double getBalance() {
		return (this.balance); 
	}
}