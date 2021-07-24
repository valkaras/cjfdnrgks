package inheritance;

public class VIPCustomer extends Customer {

	 int agentID;
	 double saleRatio;
	
	public VIPCustomer(int customerID, String customerName)
	{
		super(customerID, customerName);
		customerGrade = "VIP";
	    bonusRatio = 0.05;
	    saleRatio = 0.1;
	    
	    System.out.println("VIPCustomer(int, String) ȣ��");
	    
	}
	public int getAgentID() {
		return agentID;
	}
}
