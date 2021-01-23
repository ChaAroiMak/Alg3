package StackExc03.G1;

import java.util.Scanner;

public class Console {

   static final Scanner in = new Scanner(System.in);

   static Stack stack = new Stack();

    static public int readIntegerFromStdIn(String text) {
        boolean test = true;
        while (test) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(text + " ");
                int num = in.nextInt();
                test = false;
                return num;
            } catch (Exception ex) {
                System.out.println("Wrong Input. Please enter a number from 0 to 7.");
            }
        }
        return -1;
    }

    static public String readStringFromStdIn(String text) {
        boolean test = true;

        while (test) {
            try {
                System.out.print(text + " ");
                // TODO: Read text from Stdin
                Scanner scan = new Scanner(System.in);
                // System.out.println(text);
                String text1 = scan.nextLine();
                test = false;
                return text1;
            } catch (Exception ex) {
                System.out.println("Wrong Input. Please enter text.");
            }
        }

        return " ";
    }


    public static String neueAusgabe() {
      /*  String vorname = " ";
        String nachname = " ";
        String matrikelnummer = " ";
        int matrikelnummer1 = 0;

        System.out.println("Bitte Vorname eingeben:");
        String vorname1 = readStringFromStdIn(vorname);

        System.out.println("Bitte Nachname eingeben:");
        String nachname1 = readStringFromStdIn(nachname);

        System.out.println("Bitte Matrikelnummer eingeben:");
        matrikelnummer1 = Integer.parseInt(readStringFromStdIn(matrikelnummer));

       */

      //  System.out.println(System.lineSeparator() + "Console-Application: Exercise-3 " + "<" + "Vorname"/*vorname1*/ + "> " + " <" + "Nachname" /*nachname1*/ + "> " + " <" + "Matrikelnummer"/*matrikelnummer1*/ + ">\n" +

        System.out.println("Console-Application: Exercise-3 " + "<" + "Vorname"/*vorname1*/ + "> " + " <" + "Nachname" /*nachname1*/ + "> " + " <" + "Matrikelnummer"/*matrikelnummer1*/ + ">\n" +
                "1. Push student to stack.\n" +
                "2. Pop student from stack.\n" +
                "3. Peek student.\n" +
                "4. Check if students are on the stack.\n" +
                "5. Clear stack.\n" +
                "6. Print all students from stack.\n" +
                "7. Get size of stack.\n" +
                "0. Exit.\n" +
                "\n"+
                "Please enter a number for an option:");


        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        do {
            switch (num) {
                case 0:
                    CreateExitCommand exit = new CreateExitCommand();
                    exit.Exit();
                    break;
                case 1:
                    //  stack.push(1);

                    String vorname = " ";
                    String nachname = " ";
                    String matrikelnummer = " ";
                    String coursenumber = " ";
                    int matrikelnummer1 = 0;

                    System.out.println("Please enter prename:");
                    String vorname1 = Console.readStringFromStdIn(vorname);

                    System.out.println("Please enter surname:");
                    String nachname1 = Console.readStringFromStdIn(nachname);

                    System.out.println("Please enter course number:");
                    String coursenumber1 = Console.readStringFromStdIn(coursenumber);

                    System.out.println("Please enter matriculation number:");
                    matrikelnummer1 = Integer.parseInt(Console.readStringFromStdIn(matrikelnummer));

              /*
              //uncomment for individual separate object
              stack.push(vorname1);
               stack.push(nachname1);
               stack.push(coursenumber1);
               stack.push(matrikelnummer1);*/

                    stack.push(vorname1 + " " + nachname1 + " " + coursenumber1 + " " + matrikelnummer1);


                    neueAusgabe();
                case 2:
                    System.out.println("Stack Pop: " + stack.pop());
                    neueAusgabe();
                case 3:
                    System.out.println("Stack Peek: " + stack.peek());
                    neueAusgabe();
                    break;
                case 4:
                    System.out.println("Empty: " + stack.isEmpty());
                    neueAusgabe();
                    break;
                case 5:
                    stack.clear();
                    System.out.println("Stack Cleared:");
                    neueAusgabe();
                    break;
                case 6:
                    stack.print();
                    neueAusgabe();
                    break;
                case 7:
                    System.out.println("Stack Size: " + stack.size());
                    neueAusgabe();
                    break;
                default:
                    System.out.println("Enter number from 0-7");
                    neueAusgabe();
                    break;
            }
        } while (num != 0);

        return " ";
    }
}
