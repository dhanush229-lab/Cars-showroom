package cars;

public class Cars {
	private String brand; 
    private String model;   
    private double price;   
    private double mileage;   
    private String ownerName;
    
    private static int totalCars;
    private static String showroomName="Shetty carspoint";
    
    public Cars(String b, String m, double p, double mil){
    brand=b;
    model=m;
    price=p;
    mileage=mil;
    ownerName="Dhanush y shetty";
    totalCars++;
    }
    public Cars(String b, String m, double p, double mil, String owner) {
    	 brand=b;
    	 model=m;
    	 price=p;
    	 mileage=mil;
    	 this.ownerName=owner;
    	 totalCars++;
    }
    public String getownerName() {
        return ownerName;
    }
    public void setownerName(String owner) {
        ownerName = owner;
    }
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Owner: " + this.ownerName);
    }
    public void updatePrice(double newPrice) {
        price = newPrice;
    }
    public static void showtotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }
    public static void showShowroomName() {
        System.out.println("Showroom name is : " +showroomName);
    }
}
    
    	 
    	
    	
