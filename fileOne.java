import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        TreeSet<Integer> n = new TreeSet<Integer>();
        n.add(10);
        n.add(20);
        n.add(30);
        n.add(40);
        n.add(50);
        System.out.println("TreeSet : " + n);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search : ");
        int s = sc.nextInt();
        if (n.contains(s)) {
            System.out.println(s + " is present in the TreeSet.");
        } else {
            System.out.println(s + " is not present in the TreeSet.");
        }
        System.out.print("Enter a number to remove : ");
        int r = sc.nextInt();
        if (n.remove(r)) {
            System.out.println(r + " removed from the TreeSet.");
            System.out.println("New TreeSet: " + n);
        } else {
            System.out.println(r + " is not present in the TreeSet.");
        }
        sc.close();
    }
}
