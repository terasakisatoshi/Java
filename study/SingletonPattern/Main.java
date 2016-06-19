
public class Main{
    public static void main(String[] args){
        System.out.println("Start");
        System.out.println("gen obj1");
        Singleton obj1 = Singleton.getInstance();
        System.out.println("obj2");
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("obj1とobj2は同じインスタンスです");
        }else{
            System.out.println("obj1とobj2は違うインスタンスです");
        }
        System.out.println("End");
    }
}