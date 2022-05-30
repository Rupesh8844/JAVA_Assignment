package question3;

public class OLA {

	private String obj2;
	private String obj;
	public  Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			Car c= new Car();
			c.setNumberOfPassenger(numberOfPassenger);
			c.setNumberOfKms(numberOfKMs);
			HatchBack h = new HatchBack();
			return h;
			
		}
		else {
			Car c= new Car();
			c.setNumberOfPassenger(numberOfPassenger);
			c.setNumberOfKms(numberOfKMs);
			Sedan s = new Sedan();
			return s;
		}
	}
	public int calculateBill(Car car) {
        
		int value= 0;
		
		
		if(car.equals("Sedan")) {
			Car c= new Car();
			Sedan s = new Sedan();
			int total=c.getNumberOfKms()*s.farePerKm;
			value=total;
		}
		else {

                
				if(car.equals("HatchBack")) {
					Car c= new Car();
				HatchBack h = new HatchBack();
				int total=c.getNumberOfKms()*h.farePerKm;
				value=total;
		       }
			
		   }
		
		return value;
		}
}
