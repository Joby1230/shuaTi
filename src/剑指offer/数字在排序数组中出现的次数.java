package 剑指offer;

/**
 * 看到有序，首先想到用二分,基于二分查找的框架
 * 二分查找的递归和循环写法都要会写
 */
public class 数字在排序数组中出现的次数 {
    public static void main(String[] args) {
        int[] a=new int[]{1,2};
        System.out.println(数字在排序数组中出现的次数.GetNumberOfK(a,2));
    }
    public static int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        int mid = (0+len-1)/2;
        int start =0,end=len-1;
        int lastPos =-1;
        int firstPos =-1;
        while (start<=end){
            if (array[mid]>k){
                end = mid-1;
            }else if (array[mid]<k){
                start=mid+1;
            }else if (mid+1<len&&array[mid+1]==k){
                start=mid+1;
            } else {
                lastPos=mid;
                break;
            }
            mid=(start+end)>>1;
        }
        firstPos=getFirstPos(array,k,0,len-1);
        if (lastPos==-1&&firstPos==-1) return 0;
        return lastPos-firstPos+1;
    }
    private static int getFirstPos(int[] arr,int k,int start ,int end){
        if (start>end) return -1;
        int mid = (start+end)>>1;
        if (arr[mid]<k){
            return getFirstPos(arr,k,mid+1,end);
        }else if (arr[mid]>k){
            return getFirstPos(arr,k,start,mid-1);
        }else if (mid-1 >=0 && arr[mid-1] == k){
            return getFirstPos(arr,k,start,mid-1);
        }else {
            return mid;
        }
    }
}
