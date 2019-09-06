
package algorthods;

import java.util.HashSet;
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());

        String[][] group = new String[num][];
        HashSet<String> person = new HashSet<>();
        person.add(first);
        for (int i = 0; i < num; i++) {
            group[i] = sc.nextLine().split(",");
            for (String name : group[i]) {
                if (person.contains(name)) {
                    for (String recp : group[i]) {
                        person.add(recp);
                    }
                    break;
                }

            }
        }
        for (int i = 0; i < num; i++) {
            for (String name : group[i]) {
                if (person.contains(name)) {
                    for (String recp : group[i]) {
                        person.add(recp);
                    }
                    break;
                }

            }
        }


        System.out.println(person.size());
    }
}
