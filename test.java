package base;
import java.util.Scanner;
public class CityName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s=sc.nextInt();
		String city[]=new String[s];
		for(int i=0;i<s;i++) {
			city[i]=sc.next();
		}
		int max=0;
		int x=0;
		for(int i=0;i<s;i++) {
			if(city[i].length()>max) {
				max=city[i].length();
				x=i;
			}
		}
		System.out.println("Length of largest city name: "+max);
		System.out.println("Name of the city: "+city[x]);

	}

}

