import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    /**
     * Attributes: LocalDate date, String orderNumber, arraylist of orderlines called lines
     */
    //TODO

    /**
     * Initialized the order with only the orderNumber.
     * @param orderNumber
     */
    public Order(String orderNumber){
        //TODO
    }

    /**
     * Initializes the Order with the order number and date
     * @param orderNumber
     * @param date
     */
    public Order(String orderNumber, LocalDate date){
        //TODO
    }

    /**
     * Getters and Setters
     */
    //TODO

    /**
     * @return the total amount of the order by using the line subtotal.
     */
    public double total(){
        //TODO
    }

    /**
     * @return a printout of the order.
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------------------------------------------------------------------------\n");
        sb.append(String.format("Order:[%-20s|%-10s]\n",this.getOrderNumber(),this.getDate()));
        for (OrderLine line: this.getLines()){
            sb.append(String.format("--->%-50s\n",line.toString()));
        }
        sb.append(String.format("---> Order Total: $%10.2f\n", this.total()));
        sb.append("============================================================================================================");
        return sb.toString();
    }

    /**
     * Loads the current object from the database.
     * @param db the database connection
     * Hint:
     *           once loaded the object's data, use the static method from OrderLine to load the lines of the order.
     */
    public void load(Connection db){
        //TODO
    }

    /**
     * Loads all the orders in the DB
     * @param db the database connection
     * @return an arraylist of orders.
     * HINT:
     *  Use the order Load method.
     */
    public static ArrayList<Order> loadAll(Connection db){
        //TODO
    }

    /**
     * Loads all the orders in the DB with the order date between a period of time.
     * @param db the database connection
     * @param start the period start (should be included)
     * @param end the period end (should be included)
     * @return an arraylist of orders
     * HINT:
     *  Use the order Load method.
     */
    public static ArrayList<Order> loadInPeriod(Connection db, LocalDate start, LocalDate end){
        //TODO
    }

    /**
     * Loads all the orders in the DB that contain a specific product
     * @param db the database connection
     * @param product the product. Can be shallow loaded.
     * @return an arraylist of orders.
     * HINT:
     *  Use the order Load method.
     */
    public static ArrayList<Order> loadOrdersWithProduct(Connection db, Product product){
        //TODO
    }
}
