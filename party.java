package fresh;
import java.util.*;
public class party {
	
	public static void main(String[] args) {
		int bottlenum=99;
		String word="bottles";
		System.out.println("enter the no. of bottles you want");
		
		
		while(bottlenum>0) {
		
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			bottlenum=bottlenum-a;
			System.out.println(a+" "+word+" of beer to the customer");
			System.out.println("pass it around");
			if(bottlenum==1) {
				word="bottle";
			}
			System.out.println(bottlenum+" "+word+" of beer left");
			System.out.println("take "+a+" "+word+" down");
			
			
			s.close();
		} if (bottlenum==0) {
			System.out.println("no bottles lft ");
		}
			
		
	}
}