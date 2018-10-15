package 剑指offer;

public class 数值的整数次方 {
    public double Power(double base, int exponent) {
        int flag=0;
        if (exponent<0){
            exponent= -exponent;
            flag=1;
        }
        double ans;
        ans = eff(base,exponent);
        if (flag==1) ans = 1.0/ans;
        return ans;
    }
    public double eff(double base,int exponent){
        double ans=1.0;
        if (exponent==0) return ans;
        if (exponent==1) return base;
        ans = eff(base,exponent/2);
        ans = ans*ans;
        if (exponent%2==1) ans=ans*base;
        return ans;
    }
}
