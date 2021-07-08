package MPP.assignment4.probleme;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public String name;
	List<Account> accountList = new ArrayList<>();

	public Employee(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addAccount(Account a){
		this.accountList.add(a);
	}

	public double computeUpdatedBalanceSum() {
		double totalBalance = 0;
		for (Account a : accountList){
			totalBalance += a.computeUpdatedBalance();
		}
		return totalBalance;
	}
}
