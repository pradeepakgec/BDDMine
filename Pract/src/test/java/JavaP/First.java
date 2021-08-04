package JavaP;

import org.testng.annotations.Test;

public class First {
	
@Test
public void one()
{
	String str = "ABCDEFGH";
	String st = "";
	int leng = str.length();
	for(int i=leng-1;i>=0;i--) {
				st=st+str.charAt(i);
	}
	System.out.println("\nReversed String is : "+st);
}
}
