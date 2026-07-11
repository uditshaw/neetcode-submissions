class Solution {
    public boolean isValid(String s) {
        
        int n = s.length();

        if ( n == 1 ) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for ( int i = 0; i < n; i++ ) {

            char ch = s.charAt(i);

            if ( ch == '{' || ch == '[' || ch == '(' )
                stack.push(ch);
            else if (!stack.isEmpty()) {
                if ( (ch == '}' && stack.peek() == '{') || (ch == ']' && stack.peek() == '[') || (ch == ')' && stack.peek() == '(') )
                    stack.pop();
                else 
                    return false;

            } else {
                return false;
            }
        }

        if ( stack.isEmpty() )
            return true;
        return false;
    }
}
