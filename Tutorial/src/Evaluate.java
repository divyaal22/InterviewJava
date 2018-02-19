import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) { 
        Stack<String> ops  = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
         
        String[] exp = "4+5/1".split("");
       for(int i=0;i<exp.length;i++)
       {
            String s = exp[i];
            if      (s.equals("("))  ;
            else if (s.equals("+"))    ops.push(s);
            else if (s.equals("-"))    ops.push(s);
            else if (s.equals("*"))    ops.push(s);
            else if (s.equals("/"))    ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("*"))    v = vals.pop() * v;
                else if (op.equals("/"))    v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
       }
        System.out.println(vals.pop());
    }
}
