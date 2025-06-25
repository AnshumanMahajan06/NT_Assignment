package String;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        //"listen" and "silent" are anagrams.
        boolean anagram=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1=sc.nextLine();
        System.out.println("Enter the second String");
        String s2=sc.nextLine();

        if(s1.length()!=s2.length()){
            anagram=false;
        }else
        {
         char c1[]=s1.toCharArray();
         char c2[]=s2.toCharArray();
         Arrays.sort(c1);
         Arrays.sort(c2);
        for(int i=0;i<s1.length();i++){
            if(c1[i]!=c2[i]){
                anagram=false;
                break;
                        }
        }
    }
        if(anagram){
                System.out.println("Two Strings are anagram");
        }else{
            System.out.println("two Strings are not anagram");
        }
    }
    
}
