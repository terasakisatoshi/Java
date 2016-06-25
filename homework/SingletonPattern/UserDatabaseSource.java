public class UserDatabaseSource implements UserDatabase
{
    private static UserDatabase theInstance= new UserDatabaseSource();
    public static UserDatabase instance(){
        return theInstance;
    }
    public UserDatabaseSource(){}
    public User readUser(string userName)
    {
        //do something
        return null;//to enable compile
    }
    public void writeUser(User user){
        //do somethnig
    }
}