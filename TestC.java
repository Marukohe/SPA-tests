public class TestC{
    public boolean containK(int[] arr, int k){
        int l = 0, r = arr.length;
        while(l < r){
            int mid = (l + r) / 2;
            if(k == arr[mid])
                return true;
            else if(k < arr[mid]){
                r = mid;
            }
            else
                l = mid;
        }
        return false;
    }
}