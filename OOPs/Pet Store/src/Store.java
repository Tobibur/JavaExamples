package src;

public class Store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnimalList ALO = new AnimalList();
		Dogs d = new Dogs();
		Cats c = new Cats();
		
		ALO.add(d);
		ALO.add(c);
		
		//Polymorphism Example
		Animals[] list = new Animals[2];
		list[0]=d;
		list[1]=c;
		
		for(Animals x: list){
			x.noise();
		}
	}

}
