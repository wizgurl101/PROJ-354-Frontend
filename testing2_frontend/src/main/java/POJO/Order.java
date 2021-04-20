/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;


/**
 *
 * @author 612600
 */
public class Order  {
    
    int orderNum;
    String name;
    String address;
    String deliveryTime;
    String product;
    //String orderDate;
    String community;
    String note;

    public Order(int orderNum, String name, String address, String deliveryTime, String product, String community, String note) {
        this.orderNum = orderNum;
        this.name = name;
        this.address = address;
        this.deliveryTime = deliveryTime;
        this.product = product;
        this.community = community;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    

//    public Order(String orderDate, String product, String note, int orderNum) {
//        this.orderDate = orderDate;
//        this.product = product;
//        this.note = note;
//        this.orderNum = orderNum;
//    }

//    public String getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(String orderDate) {
//        this.orderDate = orderDate;
//    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    
    
    
}
