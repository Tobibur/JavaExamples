package src;

public class AnimalList {

	private Animals[] theList = new Animals[5];
	private int i =0;
	
	public void add(Animals a){
		if(i<theList.length){
			theList[i] = a;
			System.out.println("Animal added at index "+i);
			i++;
		}
	}
	
}
