class Solution {
    public boolean isValid(String s) {
        if(s== null || s.length()==0) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='{' || c=='[' || c =='(') stack.push(c);
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char d= stack.pop();
                if(c==')' && d!='(' || c=='}' && d!='{' || c==']' && d!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}
