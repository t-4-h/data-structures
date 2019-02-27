import java.util.*;

public class Sorting {
    public static void main(String[] args){
        //Create disordered arrays.
        int[] myArray1 = {5,3,8,1,9};
        int[] myArray2 = {5,3,8,1,9};
        int[] myArray3 = {5,3,8,1,9};
        Integer[] myArray4 = {5,3,8,1,9};
        int[] myArray5 = {5,3,8,1,9};
        int[] myArray6 = {5,3,8,1,9};
        
        //Sort.
        insertionSort(myArray1);
        selectionSort(myArray2);
        bubbleSort(myArray3);
        mergeSort(myArray4);
        quickSort(myArray5,0,myArray5.length-1);
        quickSort3(myArray6,0,myArray6.length-1);
        
        //Print.
        printArray(myArray1);
        printArray(myArray2);
        printArray(myArray3);
        printArray(myArray4);
        printArray(myArray5);
        printArray(myArray6);
    }
    

    private static void quickSort3(int[] x, int low, int high) { 
    	
    	if (high<=low) return;
    	
		int l=low;
		int h=high;
		int i=low+1; //moves through values not yet visited to sort
		
		//set pivot to middle
	    int pivot = x[low + (high-low)/2];
	    
	    //sort into 3 lists
		while (i<=h){  //loops through array until i reaches highest value
			if (x[i] < pivot){   	/*if current index is less than pivot value, 
									swap i++ and l--*/		
				swap(x, i++, l++); 
			}
			else if (pivot <= x[i]){ /*else, if pivot value is less than/equal to current index
			 						 swap i and h--*/
				swap(x, i, h--);
			}
			else{  					/*else, keep increasing i to move through array*/
				i++;
			}
		}
		//recursive call to sort from low to high
		quickSort3(x, low, l-1);
		quickSort3(x, h+1, high);
    }
    
    
    
    
    public static void quickSort(int[] x,int low, int high) {
        int i = low, j = high;
        //Get the pivot element from the middle of the list.
        int pivot = x[low + (high-low)/2];

        //Divide into two lists.
        while (i <= j) {
            //If the current value from the left list is smaller then the pivot,
            //Then get the next element from the left list.
            while (x[i] < pivot) {
                    i++;
            }
            //If the current value from the right list is larger then the pivot,
            //Then get the next element from the right list.
            while (x[j] > pivot) {
                    j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                    swap(x,i,j);
                    i++;
                    j--;
            }
        }
        // Recursion
        if (low < j)
                quickSort(x,low, j);
        if (i < high)
                quickSort(x,i, high);
    }
    
    public static void mergeSort(Object[] a){
        Object aux[] = (Object[])a.clone();
        mergeSort(aux,a,0,a.length);
    }
    
    public static void mergeSort(Object[] src, Object[] dest, int low, int high){
        int length = high-low;  //The length of the current array.
        
        //Use insertion sort if subarray is small enough.
        if(length<7){
            for(int i=low;i<high;i++){
                //Utilize the compareTo() method for comparing elements.  Some casting necessary.
                for(int j=i;j>low && ((Comparable)dest[j-1]).compareTo(dest[j])>0;j--){
                    swap(dest,j,j-1);
                }
            }
            return; //End the method at this point.
        }   //End length<7.
        
        //If we are not doing insertion sort, conduct a split.
        //Calculate midpoint of current array and call mergeSort for both halfs.
        int mid = (low+high)/2;
        mergeSort(dest,src,low,mid);
        mergeSort(dest,src,mid,high);
        
        //Afterwards, conduct a merge.
        //Then merge sorted subarrays in src into dest.
        for(int i=low,p=low,q=mid;i<high;i++){
            if(q>=high || (p<mid &&((Comparable)src[p]).compareTo(src[q])<=0)){
                dest[i]=src[p++];
            }
            else{
                dest[i]=src[q++];
            }
        }
    }
    
    
    
    public static void insertionSort(int[] x){
        //i represents the position of the first unsorted element.
        //i starts at 1 because the algorithm begins assuming element 0 is sorted.
        for(int i=1;i<x.length;i++){
            //Start at position i and work backwards, comparing that element to the element before it.
            //If the element before it is greater than the element we are looking at, swap the two elements.
            //If the element before it is not greater than the element, the loop ends because the element is now sorted.
            for(int j=i;j>0 && x[j-1]>x[j];j--){
                swap(x,j,j-1);
            }
        }
    }
    
    public static void selectionSort(int[] x){
        //Start at the first element and loop to the second to last element.
        //i represents the first unsorted element.
        for(int i=0;i<x.length-1;i++){
            
            //Assume the current unsorted element is the minimum unsorted element.
            int min=i;
            //For each unsorted element,start looking at the element after it til the end.
            for(int j=i+1;j<x.length;j++){
                //If the element in the inner loop is less than the element in the outer loop,
                if(x[j]<x[min]){
                    //Set the inner loop element as the new minimum.
                    min=j;
                }
            }   //end for j
            //Swap the unsorted element with the minimum unsorted element.
            swap(x,i,min);
        }   //end for i
    }
    
    public static void bubbleSort(int[] x){
        //Start finalSwap at the last position in the array.
        int finalSwap=x.length-1, swapPos;
        
        //So long as we are not down to the last unsorted element,
        while(finalSwap>0){
            //Initialize the current swap position to the beginning of the array.
            swapPos=0;
            //Move through the array until the beginning of the sorted elements.
            for(int i=0;i<finalSwap;i++){
                //If the current element is greater than the next element,
                if(x[i]>x[i+1]){
                    //Swap those elements.
                    swap(x,i,i+1);
                    //Update the current swap position.
                    swapPos=i;
                }
            }
            //Update the last swap position.
            finalSwap=swapPos;
        }
    }
    
    public static void swap(int[] x, int a, int b){
        int temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
    
    public static void swap(Object[] x, int a, int b){
        Object temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
    
    public static void printArray(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+", ");
        }
        System.out.println();
    }
    
    public static void printArray(Object[] x){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+", ");
        }
        System.out.println();
    }
}
