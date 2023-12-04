import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Product {
    /**
     * Attributes code and description (both strings) and the product price (double)
     */
    //TODO


    /**
     * Initializes the object with only the code (for later load)
     * @param code
     */
    public Product(String code){
        //TODO
    }

    /**
     * Initializes the objects with all code, description and price.
     * Price should be a non-negative number.
     * @param code
     * @param description
     * @param price
     */
    public Product(String code, String description, double price){
       //TODO
    }

    /**
     * Getters and Setters.
     * price must be non-negative. IllegalArgumentException if the price is negative.
     */
    //TODO: getters and setters

    /**
     * @return Product price representation.
     */
    public String toString(){
        return String.format("Product:[%-20s|%-30s|%10.2f]",this.getCode(),this.getDescription(),this.getPrice());
    }

    /**
     * Loads the current product object using the code.
     * @param db the database connection
     */
    public void load(Connection db){
        //TODO
    }

    /**
     * Loads all the products in the DB
     * @param db the database connection
     * @return an arraylist of products
     * HINT:
     *      don't use the object load.
     */
    public static ArrayList<Product> loadAll(Connection db){
        //TODO
    }
}
