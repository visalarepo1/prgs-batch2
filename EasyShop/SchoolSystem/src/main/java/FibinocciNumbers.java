import java.util.Arrays;

public class FibinocciNumbers {

	public static void main(String[] args) {
		int[] sequence=getFininocciNumbers(2);
		System.out.println("First 2 numbers are"+(Arrays.toString(sequence)));
		sequence=getFininocciNumbers(4);
		sequence=getFininocciNumbers(10);

	}

	public static int[] getFininocciNumbers(int range) {
		int [] sequence= new int[range];
		sequence[0]=1;
		sequence[1]=1;
		for (int i = 2; i < range; i++){
		   sequence[i] = sequence[range - 2] + sequence[range - 1];
		}
		
		return sequence;
	}
public static void print(int[] sequence) {
	for( int i: sequence)
		System.out.println(i+"");
}
public static void toString(int[] sequence) {
	String result="";
	for( int i: sequence)
		result+=(i+"");
	
} 
}
