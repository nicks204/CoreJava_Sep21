package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=50;i++) {
			
			
			if(i%2!=0) {
				
				System.out.println("Odd Number " + i);
			}else {
				System.out.println("Even Number " + i);
			}
			
		}
		
		//=================================================
		
		
		int age = 17;  // eligible for voting
		//age = 17; // sorry , you will be eligible for voting by next year
		//age = 16; // sorry you are not eligible for voting
		
		
		if(age>=18) {
			System.out.println("eligible for voting");
		}else if(age==17) {
			System.out.println("sorry , you will be eligible for voting by next year");
		}else {	
			System.out.println("sorry you are not eligible for voting");
		}

	}

}
