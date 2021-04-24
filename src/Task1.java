/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author it
 */
public class Task1 {
    public static int WordsCounter(String A)
    {
        int a=1;
        for(int i=0;i<A.length();i++)
    {
        if(A.charAt(i)==' ')
        {
            a=a+1;
        }
    }
        if(A.length() == 0)
        {
            a = 0;
        }
    return a;
}
    public static int VowelCounter(String A){
        int a=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u')
            {
                a=a+1;
            }
            else if(A.charAt(i)=='A'||A.charAt(i)=='E'||A.charAt(i)=='I'||A.charAt(i)=='O'||A.charAt(i)=='U')
            {
                a=a+1;
            }
        }
        return a;
    }
    public static int PunctuationCount(String A)
    {
        int a=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)==';'||A.charAt(i)==','||A.charAt(i)=='.'||A.charAt(i)=='"'||A.charAt(i)==':')
            {
                a=a+1;
            }
        }
        return a;
    }
    public static boolean FindSubString(String A,String Sub)
    {
        for(int i=0;i<=A.length()-Sub.length();i++)
        {
          for(int j=0;j<Sub.length();j++)
          {
            if(A.charAt(i+j)==Sub.charAt(j))
        {
            return true;
        }
            else{
                
                break;
            }
            
          }
    }
        return false;
    }
}
