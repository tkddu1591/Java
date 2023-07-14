package com.shop.db;

public class SQL {

    public final static String INSERT_CUSTOMER="INSERT INTO `Customer` VALUES(?,?,?,?,NOW());";
    public final static String SELECT_CUSTOMER="Select * from `Customer` where `custId`=?";
    public final static String SELECT_PRODUCTS ="select * from `product`";
    public final static String SELECT_PRODUCT ="select * from `product` where `prodNo` =?";

    public final static String SELECT_ORDERS ="select * from `order`";
    public final static String SELECT_ORDERS_CUSTOMER ="select a.orderNo,a.orderId,a.orderProduct,  a.orderCount, date_format(a.orderDate,'%y-%m-%d %h:%i'),b.name, c.prodName from `order` as a\n" +
            "         join  `customer` as b on a.orderId = b.custId\n" +
            "         join `product` as c on a.orderProduct = c.prodNo\n" +
            "where orderId = ?";
    public final static String UPDATE_PRODUCT_BYE="Update `Product` set `stock` = `stock`-? where `prodNo`=?";
    public final static String INSERT_ORDER_BYE= "Insert Into `Order`(orderId,orderProduct,orderCount,orderDate) values (?,?,?,NOW());";

}
