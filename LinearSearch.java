import java.util.*;


public class LinearSearch {


    public static int LS(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        n =sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter the Elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key ");
        int key;
        key = sc.nextInt();

        int index =LS(arr,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("KEY IS AT "+index);
        }


        


    }
    
}
