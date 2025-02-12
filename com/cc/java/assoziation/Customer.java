package com.cc.java.assoziation;

import com.cc.java.tools.Helper;


public class Customer {
   
    private int id; 
    private String name;
    private String city;

    private Order order;

    public Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        Helper.output(this);
    }

    /** Assoziation */
    public void initOrder() {
        // Referenz auf erzeugtes Objekt im Heap
        Helper.output(this);
        order = new Order(1, "repair", this);
    }

    public void removeOrder() {
        // Referenz wird mit null überschrieben
        // --> Objekt wird durch Garbage Collector 
        // aus dem Heap entfernt 
        order = null;
    }

    public void checkOrder() {
        if (order == null ) { // gibt es das Objekt ???
            Helper.output("Kein Auftrag vorhanden!");
        } else {
           Helper.output(getOrderDetails("#type")); 
           Helper.output(getOrderDetails("#date"));
           Helper.output(getOrderDetails("#status"));
           Helper.output("-----------------------");
        }
    }

    private String getOrderDetails(String flag) {
        switch (flag) {
            case "#type": // ordertype 
                return order.getOrderType();
             case "#date":
                return String.valueOf(order.getOrderDate()); 
            case "#status":
                return checkOrderStatus();
            default:
                return "Irgendwas ging schief!";
        }
    }

     private String checkOrderStatus() {
        if (order.isFinished()) {
            return "Auftrag fertig." ;
        } else {
            return "Auftrag in Bearbeitung." ; 
        }
    }

    public void actOnOrderFinished() {
        checkOrder();
        removeOrder();
        checkOrder();
    }


    /** Getter */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Order getOrder() {
        return order;
    }

   

   
    

    

    
   
    
    






}
