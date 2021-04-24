/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
public class Task4 {
    public static int NumberOfLowerCase(String A){
        int a=0;
    for(int i=0;i<A.length();i++)
    {
        if(A.charAt(i)>='a'||A.charAt(i)<='z')
        {
            a=a+1;
        }
    }
    return a;
} 
    public static int NumberOfUpperCase(String A){
        int a=0;
    for(int i=0;i<A.length();i++)
    {
        if(A.charAt(i)>='A'||A.charAt(i)<='Z')
        {
            a=a+1;
        }
    }
    return a;
} 
    
    public static int EndIndex(String A,String Sub){
        int f=0;
        int a=A.length();
        int b=Sub.length();
        
        for (int i=0;i <=a-b;i++) 
        {
         int j;
         for (j=0;j<b;j++) 
         {
            if (A.charAt(i+j)!= Sub.charAt(j))
               break;
         }
         if (j==b) 
         {
             f=i+(b-1);
             return f;
         }
           
         }
        return f;
    }
}
