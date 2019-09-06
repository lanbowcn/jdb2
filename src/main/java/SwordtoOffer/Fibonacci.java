package SwordtoOffer;

/**
 * @Author：lanbow
 * @Date:2019/8/27 14:02
 * @Version 1.0
 */
public class Fibonacci {
    public int Fibonacci(int n ){
        int a = 0;int b=1;
        for (int i = 0; i < n-1; i++) {
            b = b+a;
            a = b-a;
        }
        return a;
    }

    //一次1或2
    public int JumpFloor2(int target) {
        if(target==2)
            return 2;
        if(target==1)
            return 1;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
    public int JumpFloor(int target) {
        int a =1;int b=2;
        for(int i = 1;i < target;i++){
            b+=a;
            a=b-a;
        }
        return a;
    }

//yici n台阶
    public int JumpFloorII(int target) {
        return (int)Math.pow(2,target-1);
    }
    //矩形覆盖
    public int RectCover(int target) {
        if(target<=0)
            return 0;
        int a = 1;int b=2;
        for (int i = 1; i < target; i++) {
            b = b+a;
            a = b-a;
        }
        return a;
    }
}
