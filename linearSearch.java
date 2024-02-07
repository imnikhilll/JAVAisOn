public class linearSearch{

    public static int LinearS(int a[],int k)
    {
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                return i;

        }
        return -1;

    }
    public static void main(String[] args){


        int arr[]={34,54,65,69};
        int key=65;

        int index = LinearS(arr, key);
        if (index==-1){
            System.out.println("Element not fount");
        }else{
            System.out.println("Key is at index ; "+index);
        }
    }
}