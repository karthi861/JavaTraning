package Fourth;

import java.util.*;



public class array {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();



        System.out.println("Enter the number of strings");
        int a = sc.nextInt();
        System.out.println("Enter a string");
        for (int i = 0; i < a; i++) {



            String str = sc.next();



            students.add(str);

            students.add("*");

        }



        System.out.println(students);



        System.out.println("Enter the string to search");

        String search = sc.next();



        System.out.println("The given string is at the index: " + Index(students, search));



        sc.close();

    }
    public static int Index(ArrayList<String> s, String search) {

        Object[] str = s.toArray();

        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(search)) {

                return i;

            }

        }

        return 0;

    }



}