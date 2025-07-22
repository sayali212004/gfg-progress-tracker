// User function Template for Java
class Solution {
    class pair 
    {
        String name;
        int salary;
        
        pair(String name, int salary)
        {
            this.name=name;
            this.salary=salary;
        }
    }
    
    public List<String> sortRecords(List<String> employee, List<Integer> salary) {
        // Your code goes here
        int n= employee.size();
        
        ArrayList<pair> records=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            records.add(new pair(employee.get(i),salary.get(i)));    
        }
        
        Collections.sort(records,(a,b)->{
            if(a.salary != b.salary)
            {
                return a.salary-b.salary;
            }
            else
            {
                return a.name.compareTo(b.name);
            }
        });
        
        ArrayList <String> result = new ArrayList<>();
        for(pair p : records)
        {
            result.add(p.name);
        }
        return result;
    }
}
