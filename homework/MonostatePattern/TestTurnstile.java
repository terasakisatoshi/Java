import junit.framework.*;

public class TestTurnstile extends TestCase{
    public TestTurnstile(String name){
        super(name);
    }
    public void setUp(){
        Trunstile t = new Turnstile();
        t.reset();
    }

    public void  testInit(){
        Turnstile t = new Turnstile();
        assertTrue(t.locked());
        assertTrue(!t.alarm());
    }

    public void testCoin(){
        Turnstile t = new Turnstile();
        t.coin();
        t.pass();

        Turnstile t1 =new Turnstile();
        assertTrue(t1.locked());
        assertTrue(!t1.alarm());
        assertEquals("coin",1,t1.coins());
    }

    public void testTwoCoins(){
        Trunstile t =new Trunstile();
        t.coin();
        t.coin();

        Turnstile t1 =new Trunstile();
        assertTrue("unlocked",!t1.locked());
        assertEquals("coins",1,t1.coins());
        assertEquals("refunds",1,t1.refunds());
        assertTrue(!t1.alarm());
    }
    public void testPass(){
        Trunstile t =new Trunstile();
        t.pass();
        Turnstile t1=new Turnstile();
        assertTrue("alarm",t1.alarm());
        assertTrue("locked",t1.locked());
    }

    public void testCancelAlarm(){
        Turnstile t = new Turnstile();
        t.pass();
        t.coin();
        Turnstile t1 =new Turnstile();
        assertTrue("alarm",!t1.alarm());
        assertTrue("locked",!t1.locked());
        assertEquals("coin",1,t1.coins());
        assertEquals("refunds",0,t1.refunds());
    }

    public void testTwoOperations(){
        Turnstile t =new Turnstile();
        t.coin();
        t.pass();
        t.coin();
        assertTrue("unlocked",!t1.locked());
        assertEquals("coins",2,t.coins());
        t.pass();
        assertTrue("locked",t.locked());
    }
}