class Solution {
    public String makeSmallestPalindrome(String s) {
    char[] arr = s.toCharArray();
    
    int i = 0;
    int j = arr.length - 1;
    
    while (i < j) {
        
        if (arr[i] != arr[j]) {
            char small = (char)Math.min(arr[i], arr[j]);
            
            arr[i] = small;
            arr[j] = small;
        }
        
        
        j--;
        i++;
    }
    
    return new String(arr);
}

}

   