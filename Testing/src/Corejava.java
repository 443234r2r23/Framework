
public class Corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String a = "hello";
	String b ="";
	//System.out.println(a.substring(0, 2));
//	System.out.println(a.substring(1));
	//System.out.println(a.charAt(3));
	
	for(int i=a.length()-1;i>=0;i--)
	{
		//System.out.println(a.charAt(i));
	b=b+a.charAt(i);
	
	}System.out.println(b);
	
	}

}
