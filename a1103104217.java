shit
alanx

package a1103104217;

import java.util.Scanner; 

public class a1103104217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("½Ð¿é¤J©Ò±o²bÃB: ");
		Scanner sc=new Scanner(System.in);
		int income=sc.nextInt();
		int taxes;
		if(income<=370000)
		{	taxes=(int) (income*0.06);
			System.out.println("¦©µ|ª÷ÃB: "+taxes);
		}
		else if(income>370000&income<=990000)
		{	taxes=(int) ((income-370000)*0.13+370000*0.06);
			System.out.println("¦©µ|ª÷ÃB: "+taxes);
		}
		else if(income>990000&income<=1980000)
		{	taxes=(int) ((income-990000)*0.21+(990000-370000)*0.13+370000*0.06);
			System.out.println("¦©µ|ª÷ÃB: "+taxes);
		}
		else if(income>1980000&income<=3720000)
		{	taxes=(int) ((income-1980000)*0.3+(1980000-990000)*0.21+(990000-370000)*0.13+370000*0.06);
			System.out.println("¦©µ|ª÷ÃB: "+taxes);
		}
		else if(income>3720000&income<=5000000)
		{	taxes=(int) ((income-3720000)*0.4+(3720000-1980000)*0.3+(1980000-990000)*0.21+(990000-370000)*0.13+370000*0.06);
			System.out.println("¦©µ|ª÷ÃB: "+taxes);
		}
	}

}
