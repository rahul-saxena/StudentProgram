
public class Loan {
	/*	int tenure;
	double principal;
	float interestRate;
	String accountNo;
	
	public double calculateEMI()
	{
		double simpleInterest=(principal*tenure*interestRate)/100;
		double emi=(simpleInterest+principal)/tenure;
		return emi;
	}
	*/
	int loanNo;
	int accountNo;
	int customerNo;
	float loanAmount;
	int loanDuration;
	float interest;
	static int loanCounter;
	
	static
	{
		loanCounter=101;
	}
	
	Loan (int accountNo, int customerNo, float loanAmount, int loanDuration, float interest)
	{
		loanCounter++;
	}
	
	Loan ()
	{
		loanCounter++;
	}
	
	int getLoanNo ()
	{
		return loanNo;
	}
	
	void setLoanNo (int loanNo)
	{
		this.loanNo=loanNo;
	}
	
	int getAccountNo ()
	{
		return accountNo;
	}
	
	void setAccountNo (int accountNo)
	{
		this.accountNo=accountNo;
	}
	
	int getCustomerNo ()
	{
		return customerNo;
	}
	
	void setCustomerNo (int customerNo)
	{
		this.customerNo=customerNo;
	}
	
	
	float getloanAmount ()
	{
		return loanAmount;
	}
	
	void setloanAmount (float loanAmount)
	{
		this.loanAmount=loanAmount;
	}
	
	int getloanDuration ()
	{
		return loanDuration;
	}
	
	void setloanDurationo (int loanDuration)
	{
		this.loanDuration=loanDuration;
	}
	
	float getinterest ()
	{
		return interest;
	}
	
	void setinterest (float interest)
	{
		this.interest=interest;
	}
	
	
} 
