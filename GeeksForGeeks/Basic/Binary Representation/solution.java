class Solution {
    public String getBinaryRep(int n) {
        
        StringBuilder res = new StringBuilder();    
        while(n > 0)
        {
            res.append(n % 2);
            n /= 2;
            
          
        }
        while(res.length()<32){
            res.append('0');
        }
    return res.reverse().toString();
    }
}