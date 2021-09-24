
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int A=99;
		  int res=1;
		  int mod=1000000007;
		  while(A>0){
		  res%=mod;
		  res=(res*3)%mod;
		  A--;
		  }
		  System.out.println((int)(Math.pow(3, 99)%mod));
		  System.out.println(res);
	    //	System.out.println(Long.toBinaryString(rev)); 
		
		
	}

}
