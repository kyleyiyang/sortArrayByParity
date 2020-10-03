class Solution {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int j=0;
        for (int i=0;i<len;i++) {
            int key = A[j];
            if (key%2==0) {
                j++;
            }
            if (key%2==1 && A[i]%2==0) {
                A[j] = A[i];
                A[i] = key;
                j++;
            }
        }
        return A;
    }
}
