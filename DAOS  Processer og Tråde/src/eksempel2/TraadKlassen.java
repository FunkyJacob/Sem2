package eksempel2;

public class TraadKlassen extends Thread{

	private int max = Integer.MIN_VALUE;
	private  int [] traadArray;
	//Att
	//TODO	
	
	public TraadKlassen(int [] traadArray) {
		super();
		this.traadArray = traadArray;
	}
	
	public void run() {
		for (int i = 0; i < traadArray.length; i++){
			max= Math.max(max,traadArray[i]);
		}
	}
	public int getMax() {
		return max;
	}
}
