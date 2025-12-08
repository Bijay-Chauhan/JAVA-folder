public class OopsToFindMax {
    public static void main (String args[]) {
        int a[] = {1,5,2,33,6};
        FindMax arr = new FindMax(a);

        int largest = arr.max;
        System.out.println(largest);
    }
    static class FindMax {
        int max;
        FindMax(int a[]) {
            max = a[0];
            for(int i=1; i<a.length; i++){
                if(a[i] > max){
                    max = a[i];
                }
            }
        }
    }
}