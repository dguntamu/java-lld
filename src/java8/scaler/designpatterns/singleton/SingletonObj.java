package java8.scaler.designpatterns.singleton;

public class SingletonObj {
    public static void main(String[] args) {
        DBConnection db1 = new DBConnection();
        try{
            db1.clone();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
class DBConnection implements Cloneable{
    private static DBConnection dbConnection = null;
    public static DBConnection getDbConnection(){
        if(dbConnection == null){
            synchronized (DBConnection.class){
                if(dbConnection == null){
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}