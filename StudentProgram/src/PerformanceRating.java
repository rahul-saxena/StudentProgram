
public class PerformanceRating {
	final int outstanding=5;
	final int good=4;
	final int average=3;
	final int poor=2;
	
	static int calculatePerformance (Employee employee)
	{
		int rating=0;
		if (employee.point >= 80)
		{
			rating=5;
		}
		if (employee.point >= 60 && employee.point <=79)
		{
			rating=4;
		}
		if (employee.point >= 50 && employee.point<=59)
		{
			rating=3;
		}
		if (employee.point < 59)
		{
			rating=2;
		}
		return rating;
	}
}
