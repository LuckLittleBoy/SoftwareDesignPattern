package packages;

public class GreenState extends AccountState
{
	public GreenState(AccountState state)
	{
		this.acc=state.acc;
		this.balance=state.getBalance();
	}
	
	public GreenState(double balance, Account acc)
	{
		this.balance=balance;
		this.acc=acc;
	}

	@Override
	public void stateCheck(double amount) {
		// TODO �Զ����ɵķ������
		if(balance<-1000)
		{
			System.out.println("͸֧");
			this.balance+=amount;
		}
		else if(balance<0&&balance>=-1000)
		{
			acc.setState(new YellowState(this));
		}
		else if(balance>=0)
		{
			acc.setState(new GreenState(this));
		}
		else
		{}
	}
}