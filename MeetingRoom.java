import java.util.*;
public class MeetingRoom{ 
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start[] = new int[n];
        int end[] = new int[n];

        for(int i=0;i<n;i++){
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i=0;
        int j=0;

        int rooms = 0;
        int maxR = 0;

        while(i<n){
            if(start[i] < end[j]) {
                rooms++;
                i++;
            }
            else{
                rooms--;
                j++;
            }

            if(rooms > maxR){
                maxR = rooms;
            }
        }
System.out.println(maxR);
    }
}