import java.util.*;
public class Group_Anagrams {

    public String Sorted_String(String s)
       { 
           char[] s_arr = s.toCharArray();
           Arrays.sort(s_arr); 
           StringBuilder res = new StringBuilder("");
           for(int i=0;i<s.length();i++)
           {
               res.append(String.valueOf(s_arr[i]));
           }
           return String.valueOf(res);
       }

   public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,ArrayList<String>> dict = new
       HashMap<String,ArrayList<String>>();

       
       
       ArrayList<String> keys = new ArrayList<>();
       for(int i=0;i<strs.length;i++)
       {
           if(keys.contains(Sorted_String(strs[i])) == false)
           {
               String s1 = Sorted_String(strs[i]);
               keys.add(s1);
           }
       }

       ArrayList<String> values = new ArrayList<String>();
       for(String i:keys)
       {
           values.clear();
           for(int j=0;j<strs.length;j++)
           {
               if(i.equals(Sorted_String(strs[j])))
               {
                   values.add(strs[j]);
               }
           }
           dict.put(i,values);
       }

       List<List<String>> output = new ArrayList<>();
       for(String i:keys)
       {
           output.add((dict.get(i)));
           //System.out.print((dict.get(i)).toString());
       }

       return output;
   }

   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of strings: ");
    int n = sc.nextInt();
    String[] arr = new String[n];
    System.out.print("\nEnter the strings: ");
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextLine();
    }

    Group_Anagrams ga = new Group_Anagrams();
    List<List<String>> result = ga.groupAnagrams(arr);
    System.out.print(result.toString());
   }
}