package sub6;

public class CustomerSQL {
    public final static String custInsertSQL="INSERT INTO `Customer` VALUES('?,?,?,?,?');";
    public final static String custSelectSQL="Select * from `Customer` where `custId`=?";
    public final static String custSelectsSQL="select * from `Customer`";
    public final static String custDeleteSQL="Delete from `Customer` where `custId`=?";
    public final static String custUpdateSQL="Update";
}
