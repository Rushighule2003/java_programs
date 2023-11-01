package RECURSION;
//check if an array is sorted(strictly  increasing);

public class Question7 {

    public static int counter = 0;

    public static void isSorted(int arr[],int index){
        if(index==arr.length-1){
        if(counter==arr.length-1){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
        return;
    }

        if(arr[index]<arr[index+1]){
            counter ++;
        }

        isSorted(arr, index+1);
    }
    
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,8,9};

        isSorted(arr, 0);

        //using loops

        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]<arr[i+1]){
        //         counter++;
        //     }else{
        //         break;
        //     }
        //  }

        //  if(counter==arr.length-1){
        //     System.out.println("array is sorted");
        //  }else{
        //     System.out.println("array is not sorted");
        //  }
    }

    
}
