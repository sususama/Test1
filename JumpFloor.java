package edu;
public class JumpFloor {
    public static int  jumpFloor(int taijie){
        if (taijie<=0)return -1;
        else if (taijie==1) return 1;
        else if (taijie==2)return 2;
        else {
            return jumpFloor(taijie-1)+jumpFloor(taijie-2);
        }
    }
    public static void main(String[] args) {
        int taijie=3;
        taijie=jumpFloor(taijie);
        System.out.println(taijie);
    }
}
