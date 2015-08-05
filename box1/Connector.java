public class Connector {
    public static void main(String[] args) {
        DbConnector dbConnector = DbConnector.getInstance("value!!");
        System.out.println(dbConnector.valueOf());
    }
}

class DbConnector {

    private static DbConnector dbConnector;
    private final String value;

    private DbConnector(String value){
        this.value = value;
    }
    public static DbConnector getInstance(String value) {
        if (dbConnector == null){
            dbConnector = new DbConnector(value);
        }
        return dbConnector;
    }
    public String valueOf(){
      return this.value;
    }
}
// 一般的なファクトリーメソッドの名前
// valueOf / of:
// getInstance
// newInstance
// getType
// newType