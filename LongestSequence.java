import java.util.*;
public class LongestSequence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int longest = 0;

        for (int num : set) {
 
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                if (length > longest) {
                    longest = length;
                }
            }
        }

        System.out.println(longest);
    }
}
    
    

