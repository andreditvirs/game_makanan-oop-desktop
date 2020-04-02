
import java.util.Scanner;
public class FormInput {
    String title;
	FormInput(String title){
		this.title = title;
	}

	public int[] inputInt(){
                System.out.println("");
                System.out.println(this.title);
                
                int[] result = new int[2];
		Scanner scanResult = new Scanner(System.in);		
		System.out.print("Element 1 : ");
		result[0] = scanResult.nextInt();
                
                scanResult = new Scanner(System.in);		
		System.out.print("Element 2 : ");
		result[1] = scanResult.nextInt();
		return result;
	}
}