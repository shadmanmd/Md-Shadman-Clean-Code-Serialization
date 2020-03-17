import java.util.Scanner;

class ConstructionCost {

	public double construction(double area,int i)
	{		
		double cost;
		double array[]= {area*1200,area*1500,area*1800,area*2500};
		cost=array[i];
		return cost;
	}
}
class Client{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ConstructionCost cs=new ConstructionCost();
		//Didn't used "println"
		 System.out.printf("Enter 1:Standard Material 2:Above Standard Material 3:High Standard Material 4:High Standard Material and Fully Ay=utomated");
		 int i=sc.nextInt();
		 double area=20;
		 double cost;
		cost=cs.construction(area,i);
	}

}