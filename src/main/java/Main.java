
import domain.User;

public class Main{
	public static void main(String[] args){
        	System.out.println("this is main method");
	
		for(int i = 1 ; i < 11 ; i++ ){
			User.incCount();
		}

		System.out.println("------>>>>>>:"+User.getCount());
	}
}



