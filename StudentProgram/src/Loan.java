
public class Loan {
	int tenure;
	double principal;
	float interestRate;
	String accountNo;
	
	public double calculateEMI()
	{
		double simpleInterest=(principal*tenure*interestRate)/100;
		double emi=(simpleInterest+principal)/tenure;
		return emi;
	}
}
