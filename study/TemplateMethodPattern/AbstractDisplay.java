public abstract class AbstractDisplay{
    //open print close はサブクラスに実装を任せるが，
    //これらの活用方法は display method でコントロールする．
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for(int i=0;i<5;++i){
            print();
        }
        close();
    }
}