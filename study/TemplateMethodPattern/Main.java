public class Main{
    public static void main(String[] args){
        AbstractDisplay d1 =new CharDisplay('H');
        AbstractDisplay d2 =new StringDisplay("Hello");
        AbstractDisplay d3 =new StringDisplay("こんにちは");
        //呼び出す関数は d1,d2,d3 ともに同名のものであるが，子クラスの実装内容によって
        //振る舞いは異なる．いわゆるポリーモーフィズム．
        d1.display();
        System.out.println('\n');
        d2.display();
        d3.display();
    }
}