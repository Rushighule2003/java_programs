public class sorting {

    static void printArray(int arr[])
        {
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
        }
    
    public static void main(String[] args) {

        // Sorting Techniques
        //       1) Bubble Sort
        //       2) Selection Sort
        //       3) Insertion Sort

        int arr[] = {7,8,9,1,2};

        // 1) Bubble Sort 

            //time complexity = O(n^2)

            // 7 8 3 1 2
            // 1st iteration
            // 7 3 1 2 8
            // 2nd iteration
            // 3 1 2 7 8
            // 3rd iteration
            // 1 2 3 7 8
        
            // for (int i=0; i<arr.length;i++){
            //     for(int j=0;j<arr.length-i-1;j++){
            //         if(arr[j]>arr[j+1]){
            //             int temp =arr[j];
            //             arr[j]= arr[j+1];
            //             arr[j+1]= temp;
            //         }
            //     }
            // }



        // 2) Selection Sort
                
                // given array 7 8 3 1 2
                // small value is replaced at first position
                // 1st iteration 
                // 1 8 3 7 2
                // 2nd iteration
                // 1 2 3 7 8
                //   ^     ^
                // small   repace 2nd position
                // value

                // for(int i=0;i<arr.length-1;i++){
                //     int smallest = i;
                //     for(int j=i+1;j<arr.length;j++){
                        
                //         if(arr[smallest] > arr[j]){
                //             smallest = j;
                //         }
                //     }
                //     int temp =arr[smallest];
                //     arr[smallest] = arr[i];
                //     arr[i] = temp;

                // }

        // 3) Insertion Sort
                    
                // In insertion sort there are to parts of array one 
                // is sorted part and another is unsortd part
                // ex:  initially
                //           7 | 8 3 1 2
                //           ^        ^
                //       sorted   unsorted
                //         part     part

                // we have to push values in sorted part 
                // like    1>  7 8 | 3 1 2
                //         2>  3 7 8 | 1 2
                //         3>  1 3 7 8 | 2
                //         4>  1 2 3 7 8 |

                //unsorte part
                
                // for(int i=1;i<arr.length;i++){
                //     int current = arr[i];
                      //sorted part
                //     int j = i-1;
                //     while(j>=0 && current < arr[j]){
                //         arr[j+1]=arr[j];
                //         j--;
                //     }

                //     arr[j+1] = current;
                // }

                for(int i=1;i<arr.length;i++){
                    int current = arr[i];
                    int j = i-1;
                    while(j >=0 && current < arr[j]){
                        arr[j+1] = arr[j];
                        j--;
                    }
                    arr[j+1] = current;
                }




        printArray(arr);

        System.out.println(arr.length);

    }
}
