package srinath.srinath;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class demo {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("A"+"B"+"C");
		//throw new Exception("not found");
		//int i;
	    for (int i = 1; i <= 12; i += 2) {
	    	//
	      if (i == 8) {
	        System.out.println(i);
	        break;
	      }
		try {
			Demo2 s1 = new Demo2 (202, "SrinathDas");
			FileOutputStream fout = new FileOutputStream("D:\\a.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
		}catch(Exception e)
		{ System.out.println(e);
		}
		}

	}

} 
	

