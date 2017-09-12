package packages;

public class YellowState extends AccountState
{
	public YellowState(AccountState state)
	{
		this.acc=state.acc;
		this.balance=state.getBalance();
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