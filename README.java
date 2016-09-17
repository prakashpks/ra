import java.io.*;
 class prakash
{

     public static void main(String []args)throws IOException
	 {
         String s1,s2;
		 BufferedReader g=new BufferedReader(new InputStreamReader(System.in));
		 s1=new String(g.readLine());
		 s2=new String(g.readLine());
		 int c=s2.length();
		 
		  if(s2.equals(s1))
		  { }
        else{		
		for(int j=0;j<c;j++)
         {     
              if(s2.equals(s1))
		       { }	
		  else
           {  		 
           char a = s2.charAt(j);
           char b = s1.charAt(j);
           s1= s1.replace(b,a); }
         }}
	 if(s2.equals(s1))
		  {
		  System.out.print("True");
		 }
	 else
	 {
	 System.out.println("False");
	 }
	 }
}
