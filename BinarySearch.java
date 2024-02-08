import java.util.*;

public class BinarySearch {

    public static int algo(int arr[],int key){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;


            if(arr[mid]==key){
                return mid;

            }

            if(arr[mid]>key){//left
                end=mid-1;
            }

            if(arr[mid]<key){//left
                start=mid+1;
            }
        }

        return -1;

    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println(algo(arr,key));

    }
    
}
