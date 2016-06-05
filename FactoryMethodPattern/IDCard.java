package idcard;
import framework.*;

public class idcard extends Product{
    private String owner;
    IDCard(String owner){
        System.out.println(owner + "のカードを作ります．");
        this.owner=owner;
    }
    public void use(){
        System.out.println(owner+"のカードを使います．");
    }
    public String getOwner(){
        return owner;
    }
}