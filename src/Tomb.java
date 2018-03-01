import java.util.Random;
public class Tomb {
	public static void main(String[] args){
		
		Random rand = new Random(); 
		
		int [] tomb = new int[10];
			int i;
			for(i=0;i<tomb.length;i++){
				tomb[i]= rand.nextInt(50)+1;
				System.out.println(tomb[i]);
			}
	}

		
}
