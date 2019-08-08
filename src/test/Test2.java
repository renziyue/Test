package test;

public class Test2 {
    public static void main(String[] args) {
        Testt1 t1=new Testt2();
        System.out.println(t1.xx);
        System.out.println(t1.getXx());

    }
}


class  Testt1{
    public int xx=5;
    public Testt1(){

    }
    public int getXx(){
        return xx;
    }
}


class  Testt2 extends  Testt1{
    public int xx=7;

    @Override
    public int getXx() {
        return xx;
    }
}
