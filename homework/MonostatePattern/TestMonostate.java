import junit.framework.* ;
public class TestMonostate extends TestCase{
    public TestMonostate(String name){
        super(name);
    }
    public void testInstance(){
        Monosatate m = new Monostate();
        for(int x=0;x<10;x++){
            m.setX(x);
            assertEquals(x,m.getX());
        }
    }

    public void testInstanceBehaveAsOne(){
        Monostate m1=new Monosatate();
        Monosatate m2 =new Monosatate();
        for(int x=0;x<10;x++){
            m1.setX(x);
            assertEquals(x,m2.getX());
        }
    }
}