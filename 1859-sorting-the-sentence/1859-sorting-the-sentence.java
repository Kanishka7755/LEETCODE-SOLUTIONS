class Solution {
    public String sortSentence(String s) {
        
        String[] arr = s.split(" ");
        
        String[] ans = new String[arr.length];

        for (String word : arr) {
            int pos = word.charAt(word.length() - 1) - '0';

            String newWord = word.substring(0, word.length() - 1);
            
            ans[pos - 1] = newWord;


        }

        return String.join(" ", ans);
    }
}
        
  