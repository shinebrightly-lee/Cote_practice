package baek.fail;

import java.util.*;

public class Q_25556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nArr1 = new Integer[n];
        Integer[] nArr2 = new Integer[n];
        List<Integer> nArrList = Arrays.asList(nArr1);

        for(int i=1; i <= n; i++){
            nArr1[i-1] = i;
        }
        Collections.shuffle(nArrList);
        System.out.println(nArrList);
        System.out.println("--------");

        int[] stack1 = new int[n];
        int[] stack2 = new int[n];
        int[] stack3 = new int[n];
        int[] stack4 = new int[n];
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        int idx4 = 0;
        int stackCount = 1;
        n--;
        for (int i = 0; i <= n; i++) {
            if ((i == n) && idx4 == 0){
                stack4[idx4] = nArrList.get(i);
                idx4++;
                i = n+1;
                break;
            }
            if ((i == n-1) && idx3 == 0) {
                stack3[idx3] = nArrList.get(i);
                idx3++;
                stack4[idx4] = nArrList.get(i+1);
                idx4++;
                i = n+1;
                break;
            }
            if ( (i == n-2) && idx2 == 0 ){
                stack2[idx2] = nArrList.get(i);
                idx2++;
                stack3[idx3] = nArrList.get(i+1);
                idx3++;
                stack4[idx4] = nArrList.get(i+2);
                idx4++;
                i = n+1;
                break;
            }
            switch (stackCount){
                    case 1 :
                        if(idx1 == 0){
                            stack1[idx1] = nArrList.get(i);
                            idx1++;
                            break;
                        } else if (nArrList.get(i) > stack1[idx1-1]){
                            stack1[idx1] = nArrList.get(i);
                            idx1++;
                            break;
                        }else if (nArrList.get(i) < stack1[idx1-1]){
                            stackCount++;
                        }
                    case 2 :
                        if(idx2 == 0){
                            stack2[idx2] = nArrList.get(i);
                            idx2++;
                            break;
                        } else if(nArrList.get(i) > stack2[idx2-1]){
                            stack2[idx2] = nArrList.get(i);
                            idx2++;
                            break;
                        }else if (nArrList.get(i) < stack2[idx2-1]){
                            stackCount++;
                        }
                    case 3 :
                        if(idx3 == 0){
                            stack3[idx3] = nArrList.get(i);
                            idx3++;
                            break;
                        } else if (nArrList.get(i) > stack3[idx3-1]){
                            stack3[idx3] = nArrList.get(i);
                            idx3++;
                            break;
                        }else if (nArrList.get(i) < stack3[idx3-1]){
                            stackCount++;
                        }
                    case 4 :
                        if(idx4 == 0){
                            stack4[idx4] = nArrList.get(i);
                            idx4++;
                            break;
                        } else if (nArrList.get(i) > stack4[idx4-1]){
                            stack4[idx4] = nArrList.get(i);
                            idx4++;
                            break;
                        }else if (nArrList.get(i) < stack4[idx4-1]){
                            stackCount = 1;
                            if(nArrList.get(i) < stack1[idx1-1]
                                    && nArrList.get(i) < stack2[idx2-1]
                                    && nArrList.get(i) < stack3[idx3-1]){
                                if(Math.max(stack1[idx1-1],stack2[idx2-1]) == stack1[idx1-1]){
                                   stack2[idx2] = nArrList.get(i);
                                    idx2++;
                                }else {
                                    stack1[idx1] = nArrList.get(i);
                                    idx1++;
                                }
                                break;
                            }
                        }
                }
        }

        idx1--;
        idx2--;
        idx3--;
        idx4--;

        int max = Math.max(Math.max(stack1[idx1],stack2[idx2]),Math.max(stack3[idx3],stack4[idx4]));
        String Y_N = "YES";
            for (int i = 0; i <= n; i++){
                    if (stack1[idx1] == max){
                        nArr2[n-i] = max;
                        if (idx1 > 0){ idx1--; }
                        else { stack1[0] = 0; }
                    } else if (stack2[idx2] == max) {
                        nArr2[n-i] = max;
                        if (idx2 > 0){ idx2--; }
                        else { stack2[0] = 0; }
                    } else if (stack3[idx3] == max) {
                        nArr2[n-i] = max;
                        if (idx3 > 0){ idx3--; }
                        else { stack3[0] = 0; }
                    } else if (stack4[idx4] == max) {
                        nArr2[n-i] = max;
                        if (idx4 > 0){ idx4--; }
                        else { stack4[0] = 0; }
                    }else{
                        Y_N = "NO";
                        break;
                    }
                    max--;
        System.out.println(Arrays.toString(nArr2));
            }
        System.out.println(Arrays.toString(stack1));
        System.out.println(Arrays.toString(stack2));
        System.out.println(Arrays.toString(stack3));
        System.out.println(Arrays.toString(stack4));
    }
}
