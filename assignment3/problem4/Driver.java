package MPP.assignment3.problem4;

public class Driver {

	public static void main(String[] args) {

		Properties[] properties = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);

		House p1 = new House(5000);
		p1.setAddress(new Address("4th Street", "Fairfield", "Iowa", "52557"));

		House p2 = new House(4000);
		p2.setAddress(new Address("7th Street", "Dallas", "Dallas", "52650"));

		Condo p3 = new Condo(4);
		p3.setAddress(new Address("3th Street", "Fairfield", "Iowa", "52557"));

		Trailer p4 = new Trailer();
		p4.setAddress(new Address("2th Street", "Fairfield", "Iowa", "52557"));

		Properties[] propertiesWithCities = { p1, p2, p3, p4 };
		Admin.listPropertiesOfACity(propertiesWithCities, "Fairfield");

	}
}
