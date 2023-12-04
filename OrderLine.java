import java.sql.*;
import java.util.ArrayList;

public class OrderLine {
    /**
     * Attributes: a Product, and a quantity (int)
     */
    //TODO


    /**
     * Initializes the object with the product and quantity
     * @param product
     * @param quantity
     */
    public OrderLine(Product product, int quantity){
        //TODO
    }

    /**
     * Getters and Setters
     */
    //TODO

    /**
     * @return the subtotal of the line (item price x qty)
     */
    public double subTotal(){
        //TODO
    }

    /**
     * @return the string representation of the order line.
     */
    public String toString(){
        return String.format("Line:{%5d x %s = $%10.2f}",this.getQuantity(),this.getProduct(), this.subTotal());
    }

    /**
     * Loads all the OrderLine objects for a specific Order
     * @param db the database connection
     * @param order the order to search the lines for. (can be shallowed loaded)
     * @return an arraylist of order lines.
     * HINT:
     *     Don't deep load the product, as it will be replaced at the Store object.
     */
    public static ArrayList<OrderLine> loadLinesForOrder(Connection db, Order order){
        //TODO
    }
}
