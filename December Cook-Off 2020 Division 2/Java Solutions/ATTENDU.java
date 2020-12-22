//package cookoffdecember;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class ATTENDU {
		
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
		FastReader sc=new FastReader();
		int t;
		t=sc.nextInt();
		while(t--!=0){
		    int n;
		    n=sc.nextInt();
		    String s;
		    s=sc.nextLine();
		    int x=120-n;
		    int tp=90-x;
		    int i=0;
		    while(tp>0&&i<n){
		        if(s.charAt(i)=='1'){
		            tp--;
		        }
		        i++;
		    }
		    if(tp<=0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
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

}
