package merge.sort;

public class MergeSort {
    public void sort(int []arr){
        int n=arr.length;
        if(n>1) {
            int[] leftArr = new int[n / 2];
            int[] rightArr = new int[arr.length - n / 2];
//            System.out.println("left");
            for (int i = 0; i < n / 2; i++) {
                leftArr[i] = arr[i];
//                System.out.println(leftArr[i]);
            }
            for (int j = 0; j < arr.length - n / 2; j++) {
                rightArr[j] = arr[n / 2 + j];
//                System.out.println(rightArr[j]);
            }
            sort(leftArr);
            sort(rightArr);

            merge(leftArr,rightArr,arr);
        }
    }
    public void merge(int leftArr[],int rightArr[], int arr[]){
        int i=0;
        int j=0;
        int k=0;
//            System.out.println("array");
        while (i<leftArr.length&&j<rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
//                    System.out.println(arr[k]);
            } else {
                arr[k] = rightArr[j];
                j++;
//                    System.out.println(arr[k]);
            }
            k++;
        }
        if(i == leftArr.length){
            for(int n=k; n<arr.length; n++,j++) {
                arr[n] = rightArr[j];
            }
        }else{
            for(int n=k; n<arr.length; n++,i++) {
                arr[n] = leftArr[i];
            }
        }

    }

}

