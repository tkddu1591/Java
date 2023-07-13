package sub5;

public class SQL {


    public final static String INSERT_SQL = "Insert Into `User3` Values(?,?,?,?);";
    public final static String UPDATE_SQL = "UPDATE `User3` SET ? = ? WHERE `uid` = ?;";
    public final static String UPDATEALL_SQL = "UPDATE `User3` SET `name`=?, `hp`=?, `age`=? WHERE `uid` = ?;";

    public final static String SELECT_SQL = "Select * from `User3` where `uid`=?;";
    public final static String SELECT_SQLs = "Select * from `User3`;";
    public final static String DELETE_SQL = "DELETE FROM `User3` WHERE `uid` = ?;";


}
