import java.util.*;
class Solution {
    public void mergeSort(int a[],int l, int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
    public void merge(int a[],int l, int mid, int r)
    {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for(int i=0; i<n1; i++)
        {
            left[i] = a[l+i];
        }
        for(int j=0; j<n2; j++)
        {
            right[j] = a[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];
            }
        }
        while(i<n1)
        {
            a[k++]=left[i++];
        }
        while(j<n2)
        {
            a[k++]=right[j++];
        }
    }
    public int[] sqrAr(int[] a)
    {
        int n =a.length;
        for(int i=0; i<n; i++)
        {
            a[i]=a[i]*a[i];
        }
        mergeSort(a,0,n-1);
        return a;
    }
    public int[] sortedSquares(int[] nums) {
        //return sqrAr(nums);
        int n = nums.length;

        int result[] = new int[n];

        int i=0,
            j= n-1;
        int k = n-1;
        
        while(i<=j)
        {
            if(Math.abs(nums[i])<Math.abs(nums[j]))
            {
                result[k] = nums[j]*nums[j];
                j--;
            }
            else
            {
                result[k] = nums[i]*nums[i];
                i++;
            }
            k--;
        }
        return result;

        
    }
}