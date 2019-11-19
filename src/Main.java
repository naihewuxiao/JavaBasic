import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x;
        int l=0,c=0;
        double max=0,count=0;
        ArrayList<Integer> line = new ArrayList<>();
        ArrayList<Integer> cloumn = new ArrayList<>();
        double[][] arr = new double[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                x=sc.nextDouble();
                if(x>max){
                    max=x;
                    l=i;
                    c=j;
                }
                arr[i][j]=x;
            }
        }
        count=max;
        line.add(l);
        cloumn.add(c);
        max=0;
        for (int k=0;k<n-1;k++) {
            for (int i = 0; i < n; i++) {
                if (line.contains(i)) continue;
                for (int j = 0; j < n; j++) {
                    if (cloumn.contains(j)) continue;
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        l = i;
                        c = j;
                    }

                }
            }
            count+=max;
            line.add(l);
            cloumn.add(c);
            max=0;
        }
        float a= (float)count;
        String str = String.format("%.2f",a);
        System.out.println(str);
        for(int i=0;i<cloumn.size();i++){
            int index = line.indexOf(i);
            System.out.println((line.get(index)+1)+" "+(cloumn.get(index)+1));
        }
    }
    public static int largestDay(ArrayList<Integer> array ,int depth, int days){
        if(depth==0) {
            return 30;
        }
        int size = array.size();
        int res = 0;
        int j=0,temp=0;
        int i = 1;
        while(i<=30){
            if(i==array.get(j)){
                res++;
                j++;
                i=i+depth+1;
                continue;
            }
            if(j>=array.size()){
                temp=(30-i)/(depth+1);
                res=res+temp+1;
                i=31;
                continue;
            }
            if((array.get(j)-i-1)<depth){
                i=array.get(j);
                continue;
            }
            if((array.get(j)-i-1)>=depth){
                temp = (array.get(j)-i)/(depth+1);
                res=res+temp;
                i=array.get(j);
                continue;
            }

        }
        return res;
    }
    }


    /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int depth,days;
        int res=0;
        for(int i = 0; i < n; i++){
            int x;
            depth = sc.nextInt();
            days = sc.nextInt();
            if(days==0) {
                System.out.println(30/(depth+1));
                continue;
            }

            ArrayList<Integer> array = new ArrayList<Integer>();
            for(int j=0;j<days;j++){
                x = sc.nextInt();
                array.add(x);
            }
            res = largestDay(array,depth,days);
            System.out.println(res);


        }*/
/*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int depth;
        int val,left,right;
        for(int i = 0; i < n; i++){
            depth = sc.nextInt();
            ArrayList<TreeNode> tree = new ArrayList<>();
            int size = tree.size();
            for(int j = 0; j < depth; j++){
                val = sc.nextInt();
                left = sc.nextInt();
                right = sc.nextInt();
                TreeNode treeNode =new TreeNode();
                treeNode.value = val;
                treeNode.leftKey = left;
                treeNode.rightKey = right;
                tree.add(treeNode);
            }
            boolean res = isInc(tree);
            if(res==true){
                System.out.println("YES");
            }else{System.out.println("NO");}
*/
     /* static class TreeNode{
        int value;
        int leftKey;
        int rightKey;

    }

    public static boolean isInc(ArrayList<TreeNode> tree){
        int size = tree.size();
        int left,right,val;

        for (int i=0;i<size;i++){
            TreeNode temp = tree.get(i);
            if (temp.leftKey>size-1) return false;
            if (temp.leftKey==-1) left=0;
            else left=tree.get(temp.leftKey).value;

            if (temp.rightKey>size-1) return false;
            if (temp.rightKey==-1) right=0;
            else right=tree.get(temp.rightKey).value;
            if (left==0&&right==0)continue;
            val = temp.value;
            if (val>(left+right)) return false;
        }
        return true;
    }*/

/*
* public static void main(String[] args) {

        int num=200;
        String str= Integer.toBinaryString(num);
        System.out.println(str);
        boolean res = isHuiwen(str);
        System.out.println(res);
    }

    public static boolean isHuiwen(String str){
        int i = 0;
        int j = str.length()-1;
        int len = str.length();
        for (i=0;i<len/2;i++){
            if (str.charAt(i)!=str.charAt(j)) return false;
            j--;
        }
        return true;
    }*/


    /*
    Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        int n = sc.nextInt();
        int index=0, x;
        if (n<=0){
            System.out.println(0);
            return;
        }
        String str = sc.next();
        String[] nums = str.split(",") ;
        for(int i = 0; i < nums.length; i++){
             int num = Integer.parseInt(nums[i]);
             arrayList.add(num);


        }
        if (n==1) {
            System.out.println(Math.abs(arrayList.get(0)));
            return;
        }
        if (n==2) {
            System.out.println(Math.abs(arrayList.get(0))+Math.abs(arrayList.get(1)-arrayList.get(0)));
            return;
        }
        int max = Math.abs(arrayList.get(0));
        for (int i = 1;i<arrayList.size()-1;i++){
            int prev = Math.abs(arrayList.get(i-1)-arrayList.get(i));
            int next = Math.abs(arrayList.get(i)-arrayList.get(i+1));
            int res = prev + next;
            if (res>max){
                max = res;
                index = i;
            }
        }
        arrayList.remove(index);
        int result = Math.abs(arrayList.get(0));
        for (int i = 1;i<arrayList.size();i++){
            result += Math.abs(arrayList.get(i-1)-arrayList.get(i));
        }
        System.out.println(result);*/
/* Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str = in.next();
            for(int i=0;i<str.length();i++){
                char num = str.charAt(i);


                    String str1 = String.valueOf(num);
                    switch (num){
                    case '0' :arrayList.add(0);break;
                    case '1' :arrayList.add(1);break;
                    case '2' :arrayList.add(2);break;
                    case '3' :arrayList.add(3);break;
                    case '4' :arrayList.add(4);break;
                    case '5' :arrayList.add(5);break;
                    case '6' :arrayList.add(6);break;
                    case '7' :arrayList.add(7);break;
                    case '8' :arrayList.add(8);break;
                    case '9' :arrayList.add(9);break;
                }
                if(num>=48&&num<=57) {
                        char ch = str.charAt(i);
                        String str1 = String.valueOf(ch);
                        int num1 = Integer.parseInt(str1);
                        if(!arrayList.contains(num1)){
                        arrayList.add(num1);
                        }
                        }

                        }
                        if (arrayList.isEmpty()){
                        System.out.println(-1);
                        }
                        else{
                        Collections.sort(arrayList);
                        String str2 ="";
                        for (int i=0;i<arrayList.size();i++){
        str2+=arrayList.get(i);
        }
        System.out.println(str2);
        arrayList.clear();
        }
        }*/
    /*ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int opn = sc.nextInt();

        int x;
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            arrayList.add(x);
        }
        Collections.sort(arrayList);
        for(int i = 0; i < opn; i++){
            x = sc.nextInt();
            if (!arrayList.contains(x)){
                System.out.println(0);
                continue;
            }
            int k = arrayList.indexOf(x);
            System.out.println(arrayList.size()-k);
            for (int j = k; j<arrayList.size(); j++){
                arrayList.set(j,arrayList.get(j)-1);
            }
            Collections.sort(arrayList);*/
    /*public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> prevList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            arrayList.add(x);
            prevList.add(x);
        }
        Collections.sort(arrayList);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            x = sc.nextInt()-1;
            int no = prevList.get(x);
            int res = arrayList.indexOf(no);
            float a = (float)res;
            float b = (float)n;

            if (res==0){
                System.out.println("0.0");
            }
            String str = String.format("%.6f",((a/b)*100));
            System.out.println(str);
        }
    }*/

