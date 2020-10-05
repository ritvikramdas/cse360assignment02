package cse360assignment02;


// AddingMachine public class
public class AddingMachine {
	
  // private int variable "total"
  // total stores the result of operations
  private int total;
  
  // private String variable "MyHistory"
  // myHistory stores the history of all operations
  private String myHistory = "0";
  
  // Constructor for AddingMachine
  // sets total variable to 0
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  // public method getTotal
  // returns total
  // @return	int
  public int getTotal () {
    return total;
  }
  
  // public method add
  // @param		value (int)
  // adds total to value and updates myHistory
  // @return	void
  public void add (int value) {
	  total += value;
	  myHistory += " + " + value; 
  }

  // public method subtract
  // @param		value (int)
  // subtracts total from value and updates myHistory
  // @return	void
  public void subtract (int value) {
	  total -= value;
	  myHistory += " - " + value; 
  }

  // public method toString
  // returns myHistory
  // @return	String
  public String toString () {
    return myHistory;
  }

  // public method clear
  // clears myHistory
  // @return	void
  public void clear() {
	  myHistory = "0";
  }
}