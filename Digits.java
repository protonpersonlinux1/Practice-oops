import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;

	public Digits(int num) {
		digitList = new ArrayList<Integer>();

if (num == 0)

{



digitList.add(Integer.valueOf(0));

}



	while (num > 0)

{



digitList.add(0, Integer.valueOf(num % 10));

num /= 10;
	}
}

public static void main (String[]args){
	System.out.print("hi");
}
}

