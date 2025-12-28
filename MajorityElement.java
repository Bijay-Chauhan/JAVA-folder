// Qn.1-> program of find the majority element using moore's algorithm.

// arr[] = {3,1, 3, 3, 1, 4, 3, 6, 3};
// the majority element is: 3

public class MajorityElement {
    public static int majorityNum(int arr[], int n){
        int freq = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(freq == 0){
                ans = arr[i];
            }
            if(arr[i] == ans) {
                freq++;
            }else {
                freq--;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {3,1, 3, 3, 1, 4, 3, 6, 3};
        int ans = majorityNum(arr, arr.length);
        System.out.println("the majority element is: "+ ans);
    }
}