
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		
		System.out.println("Company Name: " +car.getCompanyName());
		System.out.println("Model Name: " +car.getmodelName());
		System.out.println("Year: " +car.getYear());
		System.out.println("Mileage: " +car.getMileage());
		
		System.out.println("\nUpdate Car Details:");
		
		car.setCompanyName("Toyota");
        System.out.println("Company name: " + car.getcompanyName());
        car.setmodelName("Corolla");
        System.out.println("Model name: " + car.getModelName());
        car.setYear(2015);
        System.out.println("Year: " + car.getYear());
        car.setYear(1000);
        car.setCompanyName("");
        car.setmodelName("");


	}

}
