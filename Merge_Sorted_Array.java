/* class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = Arrays.copyOfRange(nums1,0,m);
        int k=0;
        for(int i=0, j=0;i!=m || j!=n;)
        {
            if(i!=m && j!=n)
            {
                if(temp[i] < nums2[j])
                {
                    nums1[k] = temp[i];
                    k++;
                    i++;
                }
                else if(nums2[j] < temp[i])
                {
                    nums1[k] = nums2[j];
                    k++;
                    j++;
                }
                else if(temp[i] == nums2[j])
                {
                    nums1[k] = temp[i];
                    k++;
                    nums1[k] = temp[i];
                    k++;
                    i++;
                    j++;
                }
            }
            else if(i==m && j!=n)
            {
                for(int z=j;z<n;z++)
                {
                    nums1[k] = nums2[z];
                    k++;
                }
            }
            else if(i!=m && j==n)
            {
                for(int z=i;z<m;z++)
                {
                    nums1[k] = temp[z];
                    k++;
                }
            }
        }

        for(int a=0;a<nums1.length;a++)
        {
            System.out.print(nums1[a] + " ");
        }
        
    }
}*/