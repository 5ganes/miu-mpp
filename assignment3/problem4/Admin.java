package MPP.assignment3.problem4;

public class Admin {

	public static double computeTotalRent(Properties[] properties) {
		double totalRent = 0;
		for (Properties o : properties){
			totalRent += o.computeRent();
		}
		return totalRent;
	}

	public static void listPropertiesOfACity(Properties[] properties, String city){
		System.out.println("List of Properties with city as " + city + " : ");
		for (Properties p : properties){
			if(p.getAddress().getCity() == city)
				System.out.println("Property Type : " + p.getClass().getSimpleName() + " --> " + p.getAddress());
		}
	}

}
