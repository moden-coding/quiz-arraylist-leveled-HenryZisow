
/**
 * You are going to write code that is designed to store student ID numbers.
 * You will create an ArrayList for Integers, then accept user input to add values 
 * to that ArrayList. There will be additional modifications you can make:
 * 
 * B level:
 * Accept input from users, add values to an ArrayList
 * 
 * B+ level:
 * B level plus stop accepting input when the user enters -1. After this, the full
 * list of student numbers should be printed, one student ID per line.
 * 
 * A- level: 
 * Complete B and B+. Also do not allow duplicates. When the user enters a student ID 
 * that already exists, tell them they cannot add duplicates then continue accepting input 
 * as per B+ level.
 * 
 * A+ level:
 * Complete B and B+. Modify A- so that when a duplicate value is entered, the user is asked 
 * whether they want to delete the existing value. If they enter "yes", the value is removed
 * from the ArrayList. Ignore any other input and do not add the value to the ArrayList.
 * 
 * An A will be awarded for an attempt at A+ that is close but not complete.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Give your student ID numbers, one per line:");
        while (true) {
            int id = Integer.valueOf(scanner.nextLine());
            if (id == -1) {
                break;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == id) {
                    System.out.println("Duplicates are not allowed.");
                    System.out.println("Do you want to delete the existing value? ('yes' or 'no')");
                    String response = String.valueOf(scanner.nextLine());
                    if (response.equals("yes")) {
                        for (int index = 0; index < list.size(); index++) {
                            if (list.contains(list.get(index))) {
                                list.remove(Integer.valueOf(id));

                            }
                        }
                    } else {
                        continue;
                    }

                }
            }

            list.add(id);
        }
        for (int ids : list) {
            System.out.println(ids);
        }
    }

}
