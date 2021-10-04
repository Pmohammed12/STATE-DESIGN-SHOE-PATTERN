package shoe;

public class Shoe 
{
	UseState useState;
	WashState washState;
	BuyState buyState;
	DestroyState destroyState;
	State state;
	
	Shoe()
	{
		useState = new UseState(this);
		washState= new WashState(this);
		buyState=new BuyState(this);
		destroyState = new DestroyState(this);
		state = buyState;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public UseState getUseState() {
		return useState;
	}

	public WashState getWashState() {
		return washState;
	}

	public BuyState getBuyState() {
		return buyState;
	}

	public DestroyState getDestroyState() {
		return destroyState;
	}
	
	public void buyShoe()	{
		state.buyShoe();
	}
	
	public void useShoe()	{
		state.useShoe();
	}
	
	public void washShoe() {
		state.washShoe();
	}
	public void destroyShoe() {
		state.destroyShoe();
	}
	
	public String toString() {
		StringBuffer sbuffer=new StringBuffer();
		
		sbuffer.append("\nShoe State  \nShoe "+state);
		
		return sbuffer.toString();
	}
}
