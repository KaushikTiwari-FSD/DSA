class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];

        for(int i = 0;i<n;i++){
            if(k == 0){
                continue;
            }

            for(int j =1;j<=Math.abs(k);j++){
                if(k>0){
                    ans[i] += code[(i+j)%n];
                }
                else{
                    ans[i] += code[(i-j+n)%n];
                }
            }
        }
      return ans;
    }
}