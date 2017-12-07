package dao;

import model.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import model.UserModel;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * <code>Set welcome message.</code>
 */
public class InventoryUser extends ActionSupport implements SessionAware {

    private String button;
    private Map<String, Object> sessionMap;
    private static SessionFactory sessionFactory;
    
    private List paint;
    private List brushes;
    private List canvas;
    
    public String execute() throws Exception {
        
        sessionFactory = new Configuration().configure().buildSessionFactory();
        
        String result = null;
        
        switch(button){
           case "shop":
               view("Paint");
               view("Brushes");
               view("Canvas");
               result = "Success";
               break;
        }
       
         return result;
    }
    
    private Connection connect(){
        Connection conn = null;
        
        try{
            String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(dbDriver);
            
            String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=ICS114Reference";
            conn = DriverManager.getConnection(dbUrl,"sa","123sql");
            
        }catch(Exception ex){
            System.out.print("Unable to connect to database");
        }
        
        return conn;
    }
    
    //view all items per category
    public String view(String category){
        /*Session session =  sessionFactory.openSession();
        Transaction tx = null;
        List list = new ArrayList();
        
        try {
            tx = session.beginTransaction();
            List a = session.createQuery("FROM InventoryModel WHERE category = '" + category + "'").list();
            
            for (Iterator iterator = a.iterator(); iterator.hasNext();){
                InventoryModel items = (InventoryModel) iterator.next(); 
                list.add(items.getFilename());
                list.add(items.getDescription());
                list.add(items.getPrice());
                list.add(items.getId());
            }
            
            tx.commit();
            
            if(category.equals("Paint")){
                setPaint(list);
            }else if(category.equals("Brushes")){
                setBrushes(list);
            }else{
                setCanvas(list);
            }
            
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        
        return "Success";
        */
        
        String sql = "SELECT filename,description,price,id FROM Inventory WHERE category = '" + category + "'";
        Connection con = connect();
        List list = new ArrayList();
        
        try{
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            while(rs.next()){
                list.add(rs.getString(1));
                list.add(rs.getString(2));
                list.add(rs.getString(3));
                list.add(rs.getString(4));
                //list.add(rs.getString(5));
                //list.add(rs.getString(6));
            }
            
            if(category.equals("Paint")){
                setPaint(list);
            }else if(category.equals("Brushes")){
                setBrushes(list);
            }else{
                setCanvas(list);
            }
            
            rs.close();
            state.close();
            
        }catch(Exception ex){
            System.out.println("\nEmpty Database");
        }
        
        return "Success";
    }
    
    
    
    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public List getPaint() {
        return paint;
    }

    public void setPaint(List paint) {
        this.paint = paint;
    }

    public List getBrushes() {
        return brushes;
    }

    public void setBrushes(List brushes) {
        this.brushes = brushes;
    }

    public List getCanvas() {
        return canvas;
    }

    public void setCanvas(List canvas) {
        this.canvas = canvas;
    }
}