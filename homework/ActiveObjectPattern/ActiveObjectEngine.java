import java.util.LinkedList;
import java.util.Iterator;

public class ActiveObjectEngine{
    LinkedList itsCommands = new LinkedList();
    public void addCommand(Command c){
        itsCommands.add(c);
    }
    public void run(){
        while(!itsCommands.isEmpty()){
            Command c = (Command) itsCommands.getFirst();
            itsCommands.removeFirst();
            c.execute();
        }
    }
}