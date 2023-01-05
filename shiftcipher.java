import java.util.*;
public class shiftcipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key");
		int key=sc.nextInt();
		System.out.println("enter plain text");
		String p=sc.next();
		String cipher="";
		for(int i=0;i<p.length();i++)
		{
			char v=p.charAt(i);
			int x=0+v+key;
			char c=(char)(x);
			cipher+=c;
			}
		System.out.println(cipher);
		

		
		

	}

}
