import java.util.*;
public class KFrequent {
public static void main(String args[])
{
    //create hasmap function
HashMap<Integer,Integer> map=new HashMap<>();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int k=sc.nextInt();
for(int num:arr)
{
if(map.containsKey(num))
{
map.put(num,map.get(num)+1);
}
else{
map.put(num,1);
}
}
List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
Collections.sort(list,(a,b)->b.getValue()-a.getValue());
int ans[]=new int[k];
for(int i=0;i<k;i++)
{
ans[i]=list.get(i).getKey();
}
for(int i=0;i<k;i++)
{
System.out.print(ans[i]+" ");
}
}
}