import java.util.*;
public class Subarray1 {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();

        HashMap<Integer , Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;
        map.put(0,1);

        for(int i =0;i<n;i++){
            sum = sum + arr[i];
            int complement = sum - target;

            if(map.containsKey(complement)){
                count = count + map.get(complement);

            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(count);
    }
}
