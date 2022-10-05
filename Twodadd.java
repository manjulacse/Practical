

public class Twodadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int a[][]= {{4,56,6,8},
				            {4,5,6,7}
				
			            	};
				int b[][]={ {7,4,6,9},
				          {5,6,7,8}
			           	};
				int c[][]=new int[4][4];
				int i; int j;
				for(i=0; i<a.length; i++) {
					for(j=0; j<a.length; j++) {
						c[i][j]=a[i][j]+b[i][j];
					}
				}
				for(i=0; i<a.length; i++) {				
					for(j=0; j<a.length; j++) {
						System.out.print(c[i][j]+"  ");
				}
					System.out.println();
				}

					

		
	
			}
			

		}

