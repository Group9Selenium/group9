package DataSource;


import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation extends ConnectToSqlDB {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        //connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"ItemList","items");
    }
    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("iPhone");
        itemsList.add("laptop");
        itemsList.add("TV");
        return itemsList;
    }
    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }
    public static void main(String[] args) throws Exception {
        //insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        insertDataIntoDB();
        List<String> list = connectToSqlDB.readDataBase("ItemList","items");
        for(String st:list){
            System.out.println(st);
        }
    }
}
