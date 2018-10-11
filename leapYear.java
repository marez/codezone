public class leapYear{
	public static boolean isLeapYear(int year){
			if(year%400 == 0)
				return true;
			else
				return false;
	}

	public static void main(String Args[ ] ){
		System.out.println("Calculating...");
		int x = 2001;
		System.out.println(isLeapYear(x));
	}
}
