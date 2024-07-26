//1.compare two strings to check and say equal or not:

import java.util.*;
class Java_exercise{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    if(str1.equals(str2))
    {
      System.out.print("Equal");
    }
    else
    {
      System.out.print("Not Equal");
    }
  }
}


//2. implementation string upper function:

import java.util.Scanner;
class Java_exercise{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String input=s.nextLine();
    String result=input.toUpperCase();
    System.out.println(result);
   
  }
}

//3.convert the digits in the string into a single number:

import java.util.*;
class Java_exercise{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String n=s.nextLine();
    String digit="";
    
    for(int i=0;i<n.length();i++){
      char ch=n.charAt(i);
      if(Character.isDigit(ch)){
    digit +=ch;
      }
  }
  if(digit.isEmpty()){
    System.out.println("0");
  }
  else{
    System.out.println(digit);
  }
}}
