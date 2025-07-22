class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        ArrayList <Integer> police  = new ArrayList<>();
        ArrayList <Integer> thief  = new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='P')
            {
                police.add(i);
            }
            else
            {
                thief.add(i);
            }
        }
        int i=0;
        int j=0;
        while(i<police.size() && j<thief.size())
        {
            if(Math.abs(police.get(i)-thief.get(j))<=k)
            {
                count++;
                i++;
                j++;
            }
            else if(police.get(i)<thief.get(j))
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return count;
    }
}