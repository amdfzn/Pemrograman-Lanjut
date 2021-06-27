package UAS;

public class Factorial {
    public long num;
    public long getNum() {
        return num;
    }
    public void setNum(long num) {
        this.num = num;
    }
    public long rekursif(long num) {//proses rekursif
        if(num == 0 || num == 1){
            return 1;
        }else{
            return num * rekursif(num-1);
        }
    }
}

