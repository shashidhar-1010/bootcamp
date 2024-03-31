package org.example;

import com.mongodb.*;
import org.example.model.user;

import java.net.UnknownHostException;

public class mongodb {
    public static void main(String[] args) throws UnknownHostException {
        user user = new user(101,"rohan","mgr",true);


        DBObject doc = createDbObject(user);

        MongoClient mongo = new MongoClient("localhost",27017);
        DB db = mongo.getDB("testdb");

        ///DBCollection coll = db.createCollection("users",doc);
        DBCollection coll = db.getCollection("posts");

        //create user
        //WriteResult result = coll.insert(doc);
        //System.out.println(result.getUpsertedId());
        //System.out.println(result.getN());

        //readuser


        DBObject obj = BasicDBObjectBuilder.start().add("_id", user.getName()).get();
        DBCursor cursor = coll.find(obj);
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }

        //update the username

        user.setName("rohan sharma");
        doc = createDbObject(user);
        coll.update(obj,doc);

        System.out.println("after update::::::");

        DBObject query = BasicDBObjectBuilder.start().add("_id", user.getName()).get();
        DBCursor cursor1 = coll.find(query);
        while (cursor1.hasNext()){
            System.out.println(cursor.next());
        }






    }

    private static DBObject createDbObject(user user){
        BasicDBObjectBuilder docBuilder= BasicDBObjectBuilder.start();
        docBuilder.append("_id",user.getId());
        docBuilder.append("name",user.getName());
        docBuilder.append("role",user.getRole());
        docBuilder.append("isEmployee",user.isEmployee());

        return docBuilder.get();

    }
}
