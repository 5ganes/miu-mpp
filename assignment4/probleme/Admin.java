package MPP.assignment4.probleme;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double totalBalanceSum = 0;
		for (Employee e : list){
			totalBalanceSum += e.computeUpdatedBalanceSum();
		}
		return totalBalanceSum;
	}
}
