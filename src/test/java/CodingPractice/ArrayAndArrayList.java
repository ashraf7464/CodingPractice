package CodingPractice;

import org.junit.Test;

import java.util.*;

public class ArrayAndArrayList {

    @Test
    public void array() {

        String[] name = {"ashraf", "tashrif", "bushra", "abid"};

        System.out.println(name[1]);    //Print array object by index
        System.out.println(Arrays.toString(name));  //Print the array

        System.out.println(name.length);    //Length of array

        for (int i = 0; i < name.length; i++) {   //Print all array elements using Loop
            System.out.println(name[i]);
        }

        for (String name1 : name) {        //Print all array elements using Loop
            System.out.println(name1);
        }

    }

    @Test
    public void arrayToArrayList() {
        String[] name = {"ashraf", "tashrif", "bushra", "abid"};
        //name.add("Mishu"); //Doesn't work, array is fixed
        System.out.println(Arrays.toString(name));  //How to print array

        ArrayList<String> name1 = new ArrayList<>();
        System.out.println(name1);

        for (int i = 0; i < name.length; i++) {
            name1.add(name[i]);
        }
        name1.add("Mishu");
        System.out.println(name1);  //How to print ArrayList, .toString() method automatically invoked for ArrayList
        System.out.println(name1.get(0));

    }

    @Test
    public void evenAndOddNumber() {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //array
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i] + " is an even number");
            } else {
                System.out.println(number[i] + " is an odd number");
            }
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); //ArrayList
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i) + " is a even number");
            } else {
                System.out.println(list.get(i) + " is an odd number");
            }
        }
    }

    @Test
    public void sumAndAvg() {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 12}; //array
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Total sum of array is: " + sum);

        double avg = (double) sum / number.length;
        System.out.println("Array avg is: " + avg);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 12));

        int sum1 = 0;
        for (int i = 0; i < list.size(); i++) {
            sum1 = sum1 + list.get(i);
        }
        System.out.println("Total sum of ArrayList is: " + sum1);

        double avg1 = (double) sum1 / list.size();
        System.out.println("ArrayList avg is: " + avg1);

    }

    @Test
    public void addAndRemove() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(2, 600);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
    }

    @Test
    public void removeDuplicate() {
        int[] number = {1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 9, 13, 12};
        //HashSet<Integer> set = new HashSet<>(Arrays.asList(number));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 13, 12));
        HashSet<Integer> set1 = new HashSet<>(list);
        System.out.println("Before duplicate removed: " + list);
        System.out.println("After duplicate removed: " + set1);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);

    }

    @Test
    public void validateArrayListHasData() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 13, 12, 6));

        int value = 6;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element == value) {
                System.out.println("found value " + value);
                break;
            }
        }

        boolean number = list.contains(6);
        if (number == true) {
            System.out.println("found value " + value);
        }

    }

    @Test
    public void maxAndMin() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 13, 12));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);


    }

    @Test
    public void emptyList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 13, 12));
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("list is not empty");
        }
    }

}
