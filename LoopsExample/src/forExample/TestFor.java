package forExample;

public class TestFor {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		 System.out.print(n1+","+n2);
		 for(int i=2;i<15;i++)
		 {
			 n3=n1+n2;
			 System.out.print(","+n3);
			 n1=n2;
			 n2=n3;
		 }
		
		
//		 for(int i = 0; i < 10; i++) {
//	            if(i == 2) {
//	                continue;
//	            }
//	            if(i == 7) {
//	                break;
//	            }
//	            System.out.println(i);
//	        }

	}

}
//0,1,1,2,3,5,8,13,21