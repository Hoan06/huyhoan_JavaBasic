package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

//        System.out.println("Phần tử trên cùng là : " + stack.pop());

        // duyệt stack :top-down
        while(!stack.isEmpty()){
            // lấy và xử lí phần tử trên cùng
            Integer top = stack.pop();
            // Xử lý top
            System.out.println("Top " + top);
        }

        // đảo ngược câu trong tiếng việt:
        // Hello các bạn => bạn các hello
        String seq = "Hello các bạn cntt2";
        System.out.println(seq);

        String [] arr = seq.split(" ");

        Stack<String> str = new Stack<>();
        for (String i : arr){
            str.push(i);
        }

        while(!str.isEmpty()){
            System.out.printf("%s " , str.pop());
        }
    }
}
