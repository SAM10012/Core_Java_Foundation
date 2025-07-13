
    import java.util.*;

     class Word_Pattern
    {
        String pattern,s;
        Word_Pattern(String pattern, String s)
        {
            this.pattern = pattern;
            this.s = s;
        }
        static boolean wordPattern(String pattern, String s) {

            String[] p_arr = pattern.split("");// No spaces in between the characters of pattern.
            String[] s_arr = s.split(" ");// Spaces between words.
            StringBuilder new_s = new StringBuilder("");
            HashMap<String,String> dict = new HashMap<String,String>();
            if(p_arr.length == s_arr.length)
            {
            for(int i=0;i<s_arr.length;i++)
            {
                dict.put(p_arr[i],s_arr[i]);
            }
            }
            else
            {
            return false;
            }
            Set<String> keys = dict.keySet();
            
            /*int flag = 0;
            for(int i=0;i<pattern.length()-1;i++)
            {
                if((p_arr[i].equals(p_arr[i+1])==false) &&(dict.get(p_arr[i]).equals(dict.get(p_arr[i+1]))))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            return false;*/
            ArrayList<String> values = new ArrayList<String>();
            for(String i: keys)
            {
                values.add(dict.get(i));
            }
            
            LinkedHashSet<String> val = new LinkedHashSet<String>();
            val.addAll(values);
            if(keys.size() != val.size())
            {
                return false;
            }
            else
            {
            for(int i=0;i<pattern.length();i++)
            {
                //System.out.println(p_arr[i] + "  " + s_arr[i] + "  " + dict.get("a"));
                new_s.append(dict.get(p_arr[i]));
                new_s.append(" ");
            }
            
            if(s.equals((String.valueOf(new_s)).trim()))
            return true;
            else
            return false;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the pattern: ");
            String pattern = sc.nextLine();
            System.out.print("\nEnter the string: ");
            String s = sc.nextLine();
            boolean result = Word_Pattern.wordPattern(pattern,s);
            if(result == true)
            System.out.print("\nThe input string matches the pattern");
            else
            System.out.print("\nThe input string does not match the pattern");
        }
    }