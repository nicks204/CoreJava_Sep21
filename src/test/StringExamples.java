package test;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FName = "Raj";
		String Lname = "Mathur";
		
		String FullName = FName + " " + Lname;
		
		
		System.out.println("Full name is " + FullName);
		
		System.out.println("Length of Full name is " + FullName.length());
		System.out.println("Name in upper case " + FullName.toUpperCase());
		
		String NewName = FullName.replace(" " , ",");
		
		System.out.println("New name is " + NewName);
	

	}

}
