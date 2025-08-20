package cars;

public class Showroom {

	public static void main(String[] args) {
		Cars c1 = new Cars("Lamborgini", "aventedor", 1000000, 1.5);
        Cars c2 = new Cars("pagani", "Zonda r", 2000000, 1.0, "chirag");
        Cars c3 = new Cars("macleran", "p20", 12000000, 2.0);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();

        c1.setownerName("Alice");  // using setter
        c1.updatePrice(16000000);

        System.out.println("After Updates:");
        c1.displayDetails();

        Cars.showShowroomName();
        Cars.showtotalCars();
		
		    }
	}

	


