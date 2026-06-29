/*
Accept 8 names.

If duplicate names are entered,

they should automatically disappear.

Print the final LinkedHashSet.
 */

package collection.Set.LinkedHashSet;

import java.util.*;

public class LinkedHashSetNames {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> lh = new LinkedHashSet<>();

        System.out.println("Enter 8 names : ");
        for(int i=1; i<=8; i++) {
            lh.add(sc.next());
        }

        System.out.println(lh);
    }
}
