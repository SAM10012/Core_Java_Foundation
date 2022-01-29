public class Tester2{
    public static void main(String args[])
    {
        int[] tempList = {1,-1,-2};
        int[] numList = {-2,-1,1};
        int length = numList.length;
        for(int value:tempList)
        {
            int tempValue = value;
            if(value<0)
            {
                tempValue = length-Math.abs(value);
            
            if(value == tempList[tempValue])
            {
                if(value<0)
                {
                    numList[length-tempValue]= value;
                }
                else{
                    numList[tempValue] = value;
                }
            }
            else{
                numList[tempValue] = value;
            }
        }
        else{
            numList[0] = value;
        }
    }
}
}
