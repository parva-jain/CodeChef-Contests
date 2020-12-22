//package cookoffdecember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class SDSTRING {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
		int t;
		t=sc.nextInt();
		while(t--!=0){
		    String s;
		    s=sc.nextLine();
		    ArrayDeque<Character> a=new ArrayDeque<Character>();
		    int i=1;
		    a.addLast(s.charAt(0));
		    while(i<s.length()){
		    	if(a.isEmpty()) {
		    		a.addLast(s.charAt(i));
		    	}
		    	else if(a.getLast()!=s.charAt(i)){
		            a.removeLast();
		        }else{
		            a.addLast(s.charAt(i));
		        }
		        i++;
		    }
		    if(a.size()==s.length()||s.length()%2!=0){
		        System.out.println("-1");
		    }else{
		        System.out.println(a.size()/2);
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
