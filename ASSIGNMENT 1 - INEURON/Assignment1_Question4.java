
public class Assignment1_Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		for(int i = 0 ; i  <n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if((i >= n/2 - 1 && i-j >= n/2 -1) ||
				   (i >= n/2 - 1 && i+j >= (3*n/2) - 2)	
						) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
