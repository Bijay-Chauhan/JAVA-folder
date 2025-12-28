// Question1:
// ApplyMergesorttosortanarrayofStrings.
// (Assumethatallthecharactersinall the Strings are in lowercase)

// arr[] = {"sun", "earth", "marsh", "mercury", "aman", "ram", "shyam"}
// newArr[] = {aman,earth, marsh, mercury, ram, sun, shyam}



public class SortString {
    public static String[] mergeSort(String arr[], int st, int end) {
        if(st == end){
            String A[] = { arr[st] };
            return A;
        }
        int mid = st + (end-st)/2;
        String arr1[] = mergeSort(arr, st, mid);
        String arr2[] = mergeSort(arr, mid+1, end);
        String arr3[] = merge(arr1, arr2);
        return arr3;
    }
    public static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(checkAlphabetSmall(arr1[i], arr2[j])){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < m){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static boolean checkAlphabetSmall(String arr1, String arr2) {
        if(arr1.compareTo(arr2) < 0) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        String arr[] = {"sun", "earth", "marsh", "mercury", "aman", "ram", "syam"};
        String a[] = mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}