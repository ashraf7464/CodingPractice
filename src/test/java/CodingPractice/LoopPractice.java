package CodingPractice;

import org.junit.Test;

public class LoopPractice {

    @Test
    public void fibonacci() {
        //Print fibonacci sequence up to 10 numbers

        int n = 10;
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n; i++) {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(sum);
        }
    }

    @Test
    public void pyramid() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }

    @Test
    public void reversePyramid() {
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    @Test
    public void palindrome(){
        String str = "Madam";
        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr=reverseStr+str.charAt(i);
        }
        System.out.println(reverseStr);

        if(reverseStr.equalsIgnoreCase(str)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
