package baek;

import java.util.*;

public class Q_25556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nArr1 = new Integer[n];
        List<Integer> nArrList = Arrays.asList(nArr1);
        for(int i=1; i <= n; i++){
            nArr1[i-1] = i;
        }
        Collections.shuffle(nArrList);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        int idx4 = 0;
        int stackCount = 1;
        int[] sequence = new int[4];

        for (int i = 0; i < n; i++) {
            if ((i == n-3) && stack2.empty()){ // 순서가 잘 맞은경우 - 다른 스택 3개가 다 비어 있는 경우
                stack2.push(nArrList.get(i));
                stack3.push(nArrList.get(i+1));
                stack4.push(nArrList.get(i+2));
                idx2++;
                idx3++;
                idx4++;
                i = n;
                break;
            } else if ((i == n-2) && stack3.empty()) { // 스택3,4 가 빈 경우
                stack3.push(nArrList.get(i));
                stack4.push(nArrList.get(i+1));
                idx3++;
                idx4++;
                i = n;
                break;
            } else if ((i == n-1) && stack4.empty()) { // 4 가 빈 경우
                stack4.push(nArrList.get(i));
                idx4++;
                i = n;
                break;
            }
//            static void stackPush(Stack<Integer> stack,int[] nArr1,int idx,int i,int stackCount){
//
//            }
            switch (stackCount) {
                case 1:
                    if(stack1.empty()){ // stack1 이 비어있으면 그냥 넣기
                        stack1.push(nArrList.get(i));
                        idx1++;
                        break;
                    }else if (nArrList.get(i) > stack1.get(idx1-1)){ // 현재 들어온 i 가 스택의 가장 위의 값보다 큰 경우
                        idx1++; // 확인용 idx 를 ++
                        stack1.push(nArrList.get(i)); // 스택에 꺼내온 값 넣기
                        break;
                    }else if (nArrList.get(i) < stack1.get(idx1-1)){ // i 가 더 작은 경우 스택 위치만 변경
                        stackCount++;
                    }
                case 2:
                    if(stack2.empty()){
                        stack2.push(nArrList.get(i));
                        idx2++;
                        break;
                    } else if (nArrList.get(i) > stack2.get(idx2-1)){
                        idx2++;
                        stack2.push(nArrList.get(i));
                        break;
                    }else if (nArrList.get(i) < stack2.get(idx2-1)){
                        stackCount++;
                    }
                case 3:
                    if(stack3.empty()){
                        stack3.push(nArrList.get(i));
                        idx3++;
                        break;
                    } else if (nArrList.get(i) > stack3.get(idx3-1)){
                        idx3++;
                        stack3.push(nArrList.get(i));
                        break;
                    }else if (nArrList.get(i) < stack3.get(idx3-1)){
                        stackCount++;
                    }
                case 4:
                    if(stack4.empty()){
                        stack4.push(nArrList.get(i));
                        idx4++;
                        break;
                    } else if (nArrList.get(i) > stack4.get(idx4-1)){
                        idx4++;
                        stack4.push(nArrList.get(i));
                        break;
                    }else if (nArrList.get(i) < stack4.get(idx4-1)){
                        sequence[0] = stack1.get(idx1-1);
                        sequence[1] = stack2.get(idx2-1);
                        sequence[2] = stack3.get(idx3-1);
                        sequence[3] = stack4.get(idx4-1);
                        Arrays.sort(sequence);
                        if (sequence[1] == stack1.get(idx1-1)){
                            stack1.push(nArrList.get(i));
                            idx1++;
                            stackCount = 1;
                        } else if (sequence[1] == stack2.get(idx2-1)) {
                            stack2.push(nArrList.get(i));
                            idx2++;
                            stackCount = 1;
                        } else if (sequence[1] == stack3.get(idx3-1)) {
                            stack3.push(nArrList.get(i));
                            idx3++;
                            stackCount = 1;
                        } else if (sequence[1] == stack4.get(idx4-1)) {
                            stack4.push(nArrList.get(i));
                            idx4++;
                            stackCount = 1;
                        }
                    }
            }
        }
        int max = Math.max(Math.max(stack1.get(idx1-1),stack2.get(idx2-1)),Math.max(stack3.get(idx3-1),stack4.get(idx4-1)));
        int[] nArr2 = new int[n];
        String Y_N = "YES";
        n--;
        for (int i = 0; i <= n; i++){
            if (stack1.peek() == max){
                stackPop(n-i,stack1,nArr2);
//                nArr2[n-i] = stack1.peek();
//                stack1.pop();
//                if (stack1.empty()) stack1.push(0);
            }else if (stack2.peek() == max) {
                stackPop(n-i,stack2,nArr2);
            }else if (stack3.peek() == max) {
                stackPop(n-i,stack3,nArr2);
            }else if (stack4.peek() == max) {
                stackPop(n-i,stack4,nArr2);
            }else {
                Y_N = "NO";
                break;
            }
            max--;
        }
        System.out.println(Y_N);
    }
    static void stackPop(int idx, Stack<Integer> stack, int[] arr){
             arr[idx] = stack.peek();
             stack.pop();
             if (stack.empty()) stack.push(0);
    }
}
