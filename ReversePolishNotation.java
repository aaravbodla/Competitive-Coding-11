class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String token : tokens){
            if(token.matches("-?\\d+")){
                st.push(Integer.parseInt(token));
            }
            else{
                int n1 = st.pop();
                int n2 = st.pop();
                int result = 0;
                if(token.equals("+")){
                    result = n2 + n1;
                }else if(token.equals("-")){
                    result = n2 - n1;
                }else if(token.equals("*")){
                    result = n2 * n1;
                }else if(token.equals("/")){
                    result = n2 / n1;
                }
                st.push(result);
            }
        }
        return st.pop();
    }
}
