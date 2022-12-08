package Fifth;

import java.util.HashMap;
import java.util.Scanner;

public class Key {


        static Scanner sc=new Scanner(System.in);

        static String input;

        public static void main(String[] args)
        {
            HashMap<String, String> map= new HashMap<String, String>();
            System.out.println("Please Enter the Word You need To Search");
            map.put("Bread","Butter");
            map.put("Pen","Pencil");
            map.put("Tall","Short");
            map.put("Big","Small");
            String input=sc.nextLine();



            try {

                int a = Integer.parseInt(input);
                System.out.println("Wrong Input");


            }
            catch(Exception e){
                System.out.println("Search String :"+input);
                if(map.containsValue(input))
                {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("no");
                }
//                System.out.println("Output: Wrong input");
            }

        }
    }

