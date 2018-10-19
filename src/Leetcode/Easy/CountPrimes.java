package Leetcode.Easy;

public class CountPrimes {
    public static void main(String[] args) {
            CountPrimes countPrimes=new CountPrimes();
            System.out.println(countPrimes.countPrimes(7));
    }
    public int countPrimes(int n) {
        if (n<3) return 0;
        boolean pos[] =new boolean[n];
        for (int i = 0; i <n; i++) {
            pos[i]=true;
        }
        int ans=0;
        pos[0]=false;
        pos[1]=false;
        pos[2]=true;
        for (int i = 2; i <n; i++) {
            if (pos[i]==true){
                for (int j = i*2,cnt=2; j <n; ) {
                    pos[j]=false;
                    cnt++;
                    j=i*cnt;
                }

            }
        }
        for (int i = 0; i <n ; i++) {
            if (pos[i]==true){
                ans++;
            }
        }
        return ans;
    }
}
