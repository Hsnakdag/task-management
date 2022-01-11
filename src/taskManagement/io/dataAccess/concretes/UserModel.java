package taskManagement.io.dataAccess.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import taskManagement.io.entity.concretes.Task;
import taskManagement.io.entity.concretes.User;
import taskManagement.io.entity.concretes.dto.RegisterFormInfo;
import taskManagement.io.util.DatabaseUtil;

public class UserModel {
    public boolean checkUser(String username,String password){


        // Database codes
        //Check username and passwords is okey
        return true;
    }
    public boolean insertUser(RegisterFormInfo formInfo,String fieldNames) throws SQLException {

        //Construct a sql statement
        Date now = Calendar.getInstance().getTime();
//       LocalDateTime now = LocalDateTime.now();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        StringBuilder sql = new StringBuilder();
        sql.append(" INSERT INTO Users (" + fieldNames + ") ");
        sql.append(" VALUES (?,?,?,?,?,?,?,?,?)");
        String[] fieldList = fieldNames.split(",");
//        sql.append(formInfo.getName());
//        sql.append(",");
//        sql.append(formInfo.getLastName());
//        sql.append(",");
//        sql.append(formInfo.getUsername());
//        sql.append(",");
//        sql.append(formInfo.getBirthdate());
//        sql.append(",");
//        sql.append(now);
//        sql.append(",");
//        sql.append("2000");
//        sql.append(",");
//        sql.append(formInfo.getNationalID());
//        sql.append(",");
//        sql.append("8");
//        sql.append(",");
//        sql.append(formInfo.getPassword());
//        sql.append(")");


        //Execute constructedSQL stament
        Connection            connection        = DatabaseUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());
        preparedStatement.setString(1,formInfo.getName());
        preparedStatement.setString(2,formInfo.getLastName());
        preparedStatement.setString(3,formInfo.getUsername());
        preparedStatement.setString(4,dateFormat.format(formInfo.getBirthdate()));
        preparedStatement.setString(5,dateFormat.format(now));
        preparedStatement.setString(6,"2000");
        preparedStatement.setString(7,formInfo.getNationalID());
        preparedStatement.setString(8,"8");
        preparedStatement.setString(9,formInfo.getPassword());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        return true;
    }
    public void updateUser(User user){
        //Update user
        //return bool valur
    }
    public void deleteUser(int userId){
        //Delete the user by his ıd
    }
    public User getUser(int id){
        return null;
    }
    public void loginAsGuest(){
        //Guest page info from the database and return
    }
    public Task getUsersTasks(int id){
        //Id ile ilişkilendirilmiş tasklari döndür
        return null;
    }
    public void logout(String username){
        //User token == null
    }
}
