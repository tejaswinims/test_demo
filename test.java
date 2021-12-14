package base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class Customer{
	int Custid;
	String Custname;
	float Custbill;
	public Customer(int Custid, String Custname, float Custbill) {
		this.Custid=Custid;
		this.Custname=Custname;
		this.Custbill=Custbill;
	}
	public int getCustid() {
		return Custid;
	}
	public String getCustname(){
		return Custname;
	}
	public float getCustbill() {
		return Custbill;
	}
	
	@Override
	public String toString() {
		return "Customer [Custid=" + Custid + ", Custname=" + Custname + ", Custbill=" + Custbill + "]";
	}
	
}
class CompareCustByBill implements Comparator<Customer>{
	public int compare(Customer u1,Customer u2) {
		if(u1.getCustbill()<u2.getCustbill())
			return 1;
		else if(u1.getCustbill()>u2.getCustbill())
			return -1;
		else
			return 0;
	}
}

public class CustomerCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer>c1=new ArrayList<>();
		c1.add(new Customer(111, "Raj", 200.5f));
		c1.add(new Customer(112, "Ram", 220.0f));
		c1.add(new Customer(111, "Ravi", 280.75f));
		c1.add(new Customer(111, "Sai", 400.5f));
		CompareCustByBill b1=new CompareCustByBill();
		Collections.sort(c1,b1);
		
		for(Customer i:c1) {
			System.out.println(i);
		}
	
		
		

	}

}
