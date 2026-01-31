package gueesesbirthday;

import java.util.Scanner;

public class GueesesBirthDay {

    public static void main(String[] args) {

//            birthday set
        String set1 = """
                    1  3  5  7
                     9 11 13 15
                    17 19 21 23
                    25 27 29 31
                    
                    """;

        String set2 = """
                    25 27 29 31
                    10 11 14 15
                    18 19 22 23
                    26 27 30 31
                    """;

        String set3 = """
                    4  5  6  7
                    12 13 14 15
                    20 21 22 23
                    28 29 30 31
                    
                   """;

        String set4 = """
                     8  9 10 11
                    12 13 14 15
                    24 25 26 27
                    28 29 30 31
                    """;

        String set5 = """
                    16 17 18 19
                    20 21 22 23
                    24 25 26 27
                    28 29 30 31
                    """;
        int day = 0;

//        prompt the user to answer question
        Scanner input = new Scanner(System.in);

//                Set 1
        System.out.println("Is your birthday in set 1?");
        System.out.println(set1);
        System.out.println("Enter 0 for no and 1 for yes");
        int answer = input.nextInt();

        if (answer == 1) {
            day += 1;
        }
//                    Set 2
        System.out.println("Is your birthday in set 2 ?");
        System.out.println(set2);
        System.out.println("Enter 0 for no and 1 for yes");
        answer = input.nextInt();
        if (answer == 1) {
            day += 2;
        }

//                SET 3
        System.out.println("Is your birthday in set 3?");
        System.out.println(set3);
        System.out.println("Enter 0 for no and 1 for yes");
        answer = input.nextInt();
        if (answer == 1) {

            day += 4;
        }

//                SET 4
        System.out.println("Is your birthday in set 4?");
        System.out.println(set4);
        System.out.println("Enter 0 for no and 1 for yes");
        answer = input.nextInt();
        if (answer == 1) {

            day += 8;
        }

//                SET 5
        System.out.println("Is your birthday in set 5?");
        System.out.println(set5);
        System.out.println("Enter 0 for no and 1 for yes");
        answer = input.nextInt();
        if (answer == 1) {

            day += 16;
        }

//        Result
        System.out.println("Your birthday is " + day);

    }

}
