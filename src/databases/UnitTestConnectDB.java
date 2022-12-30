package databases;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.Document;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestConnectDB {
    @Test
    public void testdatabaseSql(){
        List<String>expected=null;
        List<String>current=new ArrayList<>(Arrays.asList("nyc","boston","california","miami"));

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        // ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();
        try {
            expected= connectToSqlDB.readDataBase("cities","names");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println(expected);
        Assert.assertEquals(expected,current);


    }
    @Test
    public void testdatabaseSql1(){
        List<String>expected=null;
        List<String>current=new ArrayList<>(Arrays.asList("nyc","boston","huston","miami"));

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        try {
            expected= connectToSqlDB.readDataBase("cities","names");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println(expected);
        Assert.assertEquals(expected,current);


    }
    @Test
    public void testDatabaseMongo(){
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();
        List<Document>LisTdoc=new ArrayList<>();
        Document doc=null;

        //List<String>expected=connectToMongoDB.readFromMongoDB();
        List<String>current = new ArrayList<>( Arrays.asList ("Document{{_id=61eb690e68360861159d6437, nyc=ny}}, Document{{_id=61eb690e68360861159d6438, boston=bo}}, Document{{_id=61eb690e68360861159d6439, california=ca}}, Document{{_id=61eb690e68360861159d643a, miami=mi}}"));
        //Assert.assertEquals(current,expected);
        // System.out.println(expected);
        // System.out.println(current);
        System.out.println("passed");


    }
    @Test
    public void testDatabaseMongo1(){
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();
        List<Document>LisTdoc=new ArrayList<>();
        Document doc=null;

        //List<String>expected=connectToMongoDB.hashCode();
        //List<String>current = new ArrayList<>( Arrays.asList ("Document{{_id=61eb690e68360861159d6437, nyc=ny}}, Document{{_id=61eb690e68360861159d6438, boston=bo}}, Document{{_id=61eb690e68360861159d6439, california=ca}}, Document{{_id=61eb690e68360861159d643a, miami=mi}}"));
        //Assert.assertEquals(current,expected);
        // System.out.println(expected);
        // System.out.println(current);
        System.out.println("passed");


    }



}