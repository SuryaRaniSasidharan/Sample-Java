package encapsulationassignment;
import java.util.*;

public class Bank {
	private int validpin;
	private int validpin1;
	private int validpin2;
	private int pin;
	public void setPin(int pin)
	{
	this.pin=pin;
	}
	public int getPin()
	{
		return pin;
	}
	
	
	public int getValidpin() {
		return validpin;
	}
	public void setValidpin(int validpin) {
		this.validpin = validpin;
	}
	public int getValidpin1() {
		return validpin1;
	}
	public void setValidpin1(int validpin1) {
		this.validpin1 = validpin1;
	}
	public int getValidpin2() {
		return validpin2;
	}
	public void setValidpin2(int validpin2) {
		this.validpin2 = validpin2;
	}
	public boolean checkPin(int pin)
	{
		if(pin==validpin || pin==validpin1 ||pin==validpin2)
		{
			return true;
		}
		
		return false;	
	}
}
			
	
	


