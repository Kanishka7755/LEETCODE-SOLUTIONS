class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> str1=new Stack<>();
        Stack<Character> str2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!str1.isEmpty()){
                    str1.pop();
                }
            }else{
                str1.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!str2.isEmpty()){
                    str2.pop();
                }
            }else{
                str2.push(ch);
            }
        }
    return str1.equals(str2);
    }
}