package bowlingJava;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import java.util.Date;

public class dbConnect {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			//connect to the local database server
			String dbURI = "mongodb://ben:test1234@kahana.mongohq.com:10098/cp2013Bowling";
			MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
			System.out.println("Connection Success");
			
			DB db = mongoClient.getDB("cp2013Bowling");
			System.out.println(db);
			
			Set<String> collection = db.getCollectionNames();
			System.out.println(collection);
			
			DBCollection coll = db.getCollection("test");
			System.out.println(coll);
			
			BasicDBObject doc =  new BasicDBObject("name", "MongoDB")
			.append("type", "database");
			
			coll.insert(doc);
			
			DBObject mydoc = coll.findOne();
			
			System.out.println(mydoc);
			
			System.out.println(coll.getCount());
			
			
			
//			List<String> databases = mongoClient.getDatabaseNames();
//			for (String dbName : databases){
//				System.out.println("Database: " + dbName);
//				
//				DB db = mongoClient.getDB(dbName);
//				
//				Set<String> collections = db.getCollectionNames();
//				for (String colName : collections){
//					System.out.println("\t + Collection: " + colName);
//				}
//				
//				
//			}
			mongoClient.close();
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
		
	
		
	}
	
	
	
	

}
