
 public class Start{


	public boolean isEven(int input){
		if (input%2 == 0) return true;
		else return false;
	}

	public boolean isTenaryEven(int input){
		return input%2==0 ? true : false;
	}
	

	public static void main(String args[]){

		var instance = new Start();
		
		System.out.println(instance.isEven(10));
		System.out.println(instance.isEven(13));

		System.out.println(instance.isTenaryEven(10));
		System.out.println(instance.isTenaryEven(13));

	}

}
