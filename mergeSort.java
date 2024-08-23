//i have to sort the array 
//i know if i have given two sorted arrray and then asked to give a combined sorted array then it will be an very easy problem 
//i will keep pointer at start of each array and just go on putting the element which is smaller and increasing the pointer of the array from where element was taken
//if any of the array gets exhasted i will copy all the element from the another array 
//pretty easy task right then copy that array into origin array and then task done 


//and what i know is that if an array has only one element then it is always sorted 
//so i will use recurrsion and backtracking to do this 

class Solution{
    public void mergeSortArray(int[] nums,int low,int high){
        int mid=(high+low)/2;
        if(low>=high) return;  //when array has only one element it is already sorted and ready to get merged
        
        //if not sorted then call the function to sort it
        mergeSortArray(nums, low, mid);  
        mergeSortArray(nums, mid+1, high);

        //when returned from both the function both parts are sorted and ready to get merged 
        //merging the array 
        //first creating a temp array
        int[] temp=new int[high+1-low];
        //now i will give pointer to start of each part of the array and increase the pointer of the array from where element is inserted in temp array

        int left=low;
        int right =mid+1;
        int tempArrayPointer=0;

        //copying till both parts of array has at least one element 
        
        while(left<=mid&&right<=high){
            if(nums[left]<nums[right]){
                temp[tempArrayPointer]=nums[left];
                left++;
            }
            else{
                temp[tempArrayPointer]=nums[right];
                right++;
            }
            tempArrayPointer++;
        }
        //if left part has remaining elements add them
        while(left<=mid){
            temp[tempArrayPointer]=nums[left];
            left++;
            tempArrayPointer++;

        }
        //if right part has remaining elements add them
        while(right<=high){
            temp[tempArrayPointer]=nums[right];
            right++;
            tempArrayPointer++;
            
        }

        //copy the elements of the temp array to the original array
        for(int i=0;i<=high-low;i++){
            nums[i+low]=temp[i];
        }
        return;


    }
}
public class mergeSort {
    public static void main(String[] args) {
        int []nums={3,1,2,4,5,9,8,7,13,11,20,16,15};
        Solution sol=new Solution();
        sol.mergeSortArray(nums, 0, nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    
}
