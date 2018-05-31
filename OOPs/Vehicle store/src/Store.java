package src;

public class Store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car v2 = new Car("Car","Ferrari","Red",2018,true,500);
		System.out.println(v2.getColor());
		System.out.println(v2.getHasNitros());
		
		Car v3 = new Car("Car","Lamborgini","yellow",2018,true,800);
		
		Bike b1 = new Bike("Bike","Pulsar","Blue",2018,220);
		System.out.println("The speed is "+b1.getSpeed());
		
		System.out.println(v2.servicing());
		System.out.println(b1.servicing());
		
		int count = Vehicle.getCount();
		System.out.println("The count is "+ count);
	}

}
