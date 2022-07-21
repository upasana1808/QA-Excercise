package example2;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		InputAndOutput obj=new InputAndOutput();
		try {
			obj.bufferedCopy();
			System.out.println("operation done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
