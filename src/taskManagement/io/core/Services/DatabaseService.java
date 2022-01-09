package taskManagement.io.core.Services;

import taskManagement.io.util.DatabaseUtil;

public class DatabaseService {

    public DatabaseService(){

    }

    public static void connectToDatabase(String hostname,String databaseName) throws Exception{
        DatabaseUtil.databaseName = databaseName;
        DatabaseUtil.host = hostname;

        DatabaseUtil.getConnection();
    }
    public static void disconnectFromDatabase() throws Exception{
        DatabaseUtil.disconnect();
    }
}
