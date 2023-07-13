package com.shop.db;

public class SQL {

    public final static String INSERT_CUSTOMER="INSERT INTO `Customer` VALUES(?,?,?,?,NOW());";
    public final static String SELECT_CUSTOMER="Select * from `Customer` where `custId`=?";
    public final static String SELECT_PRODUCT="select * from `product`";
    public final static String custDeleteSQL="Delete from `Customer` where `custId`=?";
    public final static String custUpdateSQL="update `Customer` set `year` = `year`;";
}
