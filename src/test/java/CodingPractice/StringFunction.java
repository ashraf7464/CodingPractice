package CodingPractice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class StringFunction {


    @Test
    public void lengthOfString(){
        String name = "Md Ashraf Siddique";
        int length = name.length();
        System.out.println(length);
        System.out.println(name.charAt(6));
    }

    @Test
    public void numberOfChar(){
        String name = "Md Ashraf Siddique";
        String newName =name.replace(" ", "");
        System.out.println(newName.length());
    }

    @Test
    public void charOccurrences(){
        String name = "Md Ashraf Siddique";
        String name1 = name.replace(" ","").toLowerCase();
        for (char c : name1.toCharArray()) {
            int count = 0;
            for (char ch : name1.toCharArray()) {
                if (ch == c) {
                    count++;
                }
            }
            System.out.println("Characters "+c+" appears "+count+" times.");
        }

    }

    @Test
    public void upperCaseAndLowerCase() {
        String name = "Md Ashraf Siddique";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
    @Test
    public void splitString(){
        String name = "Md Ashraf Siddique";
        String [] words = name.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words[1]);
    }

    @Test
    public void StringToInteger(){
        String number = "100";
        int number1 = Integer.parseInt(number);

        System.out.println(100+number);
        System.out.println(100+number1);
    }

    @Test
    public void IntegerToString(){
        int number = 100;
        String number1 = String.valueOf(number);
        System.out.println(100+number);
        System.out.println(100+number1);
    }

    @Test
    public void getIntegerValueFromString(){
        String str = "MD87ASH56RAF123";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }

    @Test
    public void reverseString(){
        String name = "Md Ashraf Siddique";
        for(int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
    }

    @Test
    public void reverseAtWords(){
        String myName ="My Name Is Ashraf";
        String [] words=myName.split(" ");
        String reverseWords="";
        for(int i=words.length-1; i>=0; i--){
            reverseWords = reverseWords+words[i];
            if(i!=0){
                reverseWords=reverseWords+" ";
            }
        }
        System.out.println(reverseWords);
    }

    @Test
    public void subString(){
        String name="Md Ashraf Siddique";
        String newName=name.substring(0,9);
        System.out.println(newName);
    }
    @Test
    public void concatenation(){
        String str1 ="Md Ashraf";
        String str2=" Siddique";
        System.out.println(str1.concat(str2));
    }
    @Test
    public void replace(){
        String email="ashraf#gmail.com";
        String email1=email.replace("#","@");
        System.out.println(email1);

        String email2 = email1.replace("gmail","mail");
        System.out.println(email2);
    }
    @Test
    public void stringContainsChar(){
        String str = "MD8@7ASH56RAF123";
        if(str.contains("@")){
            System.out.println("String has @");
        }
        else{
            System.out.println("String has no @");
        }
    }
    @Test
    public void startsAndEndsWith(){
        String str="Today is Friday, Jan 15, 2024";
        if(str.startsWith("Today")){
            System.out.println("Str starts with Today");
        }
        else{
            System.out.println("Wrong");
        }
        System.out.println("*************");
        if(str.endsWith("2024")){
            System.out.println("Str ends with 2024");
        }
        else{
            System.out.println("Wrong");
        }
    }
    @Test
    public void hasVowels(){
        String country = "Bangladesh";
        String str = country.toUpperCase();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='A' || c=='E' || c=='I' ||c=='O'||c=='U'){
                System.out.println(c+" is a vowels");
            }
            else{
                System.out.println(c+" is not a vowels");
            }

        }
    }



}
