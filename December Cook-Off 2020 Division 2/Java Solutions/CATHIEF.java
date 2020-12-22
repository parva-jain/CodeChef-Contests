//package cookoffdecember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CATHIEF {


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
		int t;
		t=sc.nextInt();
		while(t--!=0){
		    long x,y,k,n;
		    x=sc.nextLong();
		    y=sc.nextLong();
		    k=sc.nextLong();
		    n=sc.nextLong();
		    if(x!=y){
		        if(x>y){
		            long temp=x;
		            x=y;
		            y=temp;
		        }
		        long dist=y-x;
		        if(dist%k!=0){
		           System.out.println("No"); 
		        }else{
		            if((dist/k)%2==0){
		                System.out.println("Yes");
		            }else{
		                System.out.println("No");
		            }
		        }
		    }else{
		        System.out.println("Yes");
		    }
		}
	}
	 static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}
