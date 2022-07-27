
public class AgeValidateing {

	
	public static void validateing(int age) {
		if(age<18) {
			System.out.println("person is not eligible for vote");
		}else {
			System.out.println("preson is eligible for vote");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   validateing(19);
   System.out.println("Rest of the code");
	}

}
