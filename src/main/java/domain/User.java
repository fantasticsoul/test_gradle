package domain;


public class User{
	private static int count = 0;

	public static void incCount(){
		count++;
	}

	public static int getCount(){
		return count;
	}
}



