package basics;

public class CheckEquality {

	public static void main(String[] args) {
		//**********Using string literal***********//
		String s = "Mahesh";
		String s1 = "Mahesh";
		System.out.println(s1.equals(s)); //true because content of both the objects are same or not...here content is same.
		System.out.println(s1==s); //true s1 checks in string constant pool if there is any 
		//object already exists if yes then it will  refers to that one . 
		//here answer is true because s object is already there in SCP
		
		//*********Using new Keywords***************//
		String s2 = new String("Mahesh");
		String s3 = new String("Mahesh");
		System.out.println(s2.equals(s3));//true because content of both the objects are same or not...here content is same. 
		System.out.println(s2==s3); //false  when you create string using new keyword it will create 2 objects one in SCP second in Heap.
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

	}

}
