package bowlingJava;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.util.ArrayList;
import java.util.Set;





public class dbConnect {
	
 private DBCollection coll;
 private BasicDBObject doc;
	
//	public static void main(String[] args) {
//		System.out.println("start");
//		try {
//			//connect to the local database server
//			String dbURI = "mongodb://ben:test1234@kahana.mongohq.com:10098/cp2013Bowling";
//			MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
//			System.out.println("Connection: Successful");
//			
//			DB db = mongoClient.getDB("cp2013Bowling");
//			System.out.println("Database: " + db);
//			
//			Set<String> collection = db.getCollectionNames();
//			System.out.println("Collections: " + collection);
//			
//			DBCollection coll = db.getCollection("test");
//			System.out.println("Test Collection");
//			System.out.println(coll);
//			
//			BasicDBObject doc =  new BasicDBObject("name", "MongoDB")
//			.append("type", "database");
//			
//			coll.insert(doc);
//			
//			DBObject mydoc = coll.findOne();
//			
//			System.out.println(mydoc);
//			
//			//System.out.println(coll.getCount());
//			
//			String[][] players = {
//					{"ben", "2", "2", "4", "5", "6", "6" }
//			};
			
			//System.out.println(players.toString());
			
	
			
			
			
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
//			mongoClient.close();
//		} catch (Exception e) {
//			System.out.println("Fail");
//		}
//		
		
	
		
//	}
	
	@SuppressWarnings("rawtypes")
	public void upload(ArrayList player, String gameName){
		
		try {
			String dbURI = "mongodb://ben:test1234@kahana.mongohq.com:10098/cp2013Bowling";
			MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
			System.out.println("Connection: Successful");
			
			DB db = mongoClient.getDB("cp2013Bowling");
			System.out.println("Database: " + db);
			
			coll = db.getCollection(gameName);
			System.out.println("Test Collection");
			System.out.println(coll);
			
			this.doc =  new BasicDBObject();
			this.doc.append("Name", player.get(0))
			.append("F1B1", player.get(1))
			.append("F1B2", player.get(2))
			.append("F1S",  player.get(3))
			.append("F2B1", player.get(4))
			.append("F2B2", player.get(5))
			.append("F2S",  player.get(6))
			.append("F3B1", player.get(7))
			.append("F3B2", player.get(8))
			.append("F3S",  player.get(9))
			.append("F4B1", player.get(10))
			.append("F4B2", player.get(11))
			.append("F4S",  player.get(12))
			.append("F5B1", player.get(13))
			.append("F5B2", player.get(14))
			.append("F5S",  player.get(15))
			.append("F16B1", player.get(16))
			.append("F6B2", player.get(17))
			.append("F6S",  player.get(18))
			.append("F7B1", player.get(19))
			.append("F7B2", player.get(20))
			.append("F7S",  player.get(21))
			.append("F8B1", player.get(22))
			.append("F8B2", player.get(23))
			.append("F8S",  player.get(24))
			.append("F9B1", player.get(25))
			.append("F9B2", player.get(26))
			.append("F9S",  player.get(27))
			.append("F10B1", player.get(28))
			.append("F10B2", player.get(29))
			.append("F10B3", player.get(30))
			.append("F10S",  player.get(31));
			
			System.out.println("Coll: " + this.coll);
			
			this.coll.insert(this.doc);
			
			
			mongoClient.close();
		
		} catch (Exception e) {
			System.out.println("Fail: " + e);
		
		
	}
		
	

	}
	public void download(String gameName){

		try {
			String dbURI = "mongodb://ben:test1234@kahana.mongohq.com:10098/cp2013Bowling";
			MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
			System.out.println("Connection: Successful");
			
			DB db = mongoClient.getDB("cp2013Bowling");
			System.out.println("Database: " + db);
			
			System.out.println("Collection: " + gameName);
			coll = db.getCollection(gameName);
			System.out.println("Test Collection");
			System.out.println(coll);
			
			ArrayList<frames> playerList = new ArrayList<frames>();
			
			frames player1 = new frames();
			frames player2 = new frames(); 
			playerList.add(player1);
			playerList.add(player2);
			
			for (frames string : playerList) {
				System.out.println("a: " + string);
				
			}
			
			//DBObject obj = coll.findOne();
			
			DBCursor cursor = coll.find();
			int counter = 0;
				while(cursor.hasNext()){
					BasicDBObject obj = (BasicDBObject) cursor.next();
					frames player = playerList.get(counter);
			
						System.out.println("Player: " + player);
						
						
						String name = (String) obj.get("Name");
						
						String f1b1 = (String) obj.get("F1B1");
						String f1b2 = (String) obj.get("F1B2");
						String f1s = (String) obj.get("F1S");
						
						String f2b1 = (String) obj.get("F2B1");
						String f2b2 = (String) obj.get("F2B2");
						String f2s = (String) obj.get("F2S");
						
						String f3b1 = (String) obj.get("F3B1");
						String f3b2 = (String) obj.get("F3B2");
						String f3s = (String) obj.get("F3S");
						
						String f4b1 = (String) obj.get("F4B1");
						String f4b2 = (String) obj.get("F4B2");
						String f4s = (String) obj.get("F4S");
						
						String f5b1 = (String) obj.get("F5B1");
						String f5b2 = (String) obj.get("F5B2");
						String f5s = (String) obj.get("F5S");
						
						String f6b1 = (String) obj.get("F6B1");
						String f6b2 = (String) obj.get("F6B2");
						String f6s = (String) obj.get("F6S");
						
						String f7b1 = (String) obj.get("F7B1");
						String f7b2 = (String) obj.get("F7B2");
						String f7s = (String) obj.get("F7S");
						
						String f8b1 = (String) obj.get("F8B1");
						String f8b2 = (String) obj.get("F8B2");
						String f8s = (String) obj.get("F8S");
						
						String f9b1 = (String) obj.get("F9B1");
						String f9b2 = (String) obj.get("F9B2");
						String f9s = (String) obj.get("F9S");
						
						String f10b1 = (String) obj.get("F10B1");
						String f10b2 = (String) obj.get("F10B2");
						String f10b3 = (String) obj.get("F10B3");
						String f10s = (String) obj.get("F1S");
						
						player.setName(name);
						
						player.setf1B1(f1b1);
						player.setf1B2(f1b2);
						player.setf1S(f1s);
						
						player.setf2B1(f2b1);
						player.setf2B2(f2b2);
						player.setf2S(f2s);
						
						player.setf3B1(f3b1);
						player.setf3B2(f3b2);
						player.setf3S(f3s);
						
						player.setf4B1(f4b1);
						player.setf4B2(f4b2);
						player.setf4S(f4s);
						
						player.setf5B1(f5b1);
						player.setf5B2(f5b2);
						player.setf5S(f5s);
						
						player.setf6B1(f6b1);
						player.setf6B2(f6b2);
						player.setf6S(f6s);
						
						player.setf7B1(f7b1);
						player.setf7B2(f7b2);
						player.setf7S(f7s);
						
						player.setf8B1(f8b1);
						player.setf8B2(f8b2);
						player.setf8S(f8s);
						
						player.setf9B1(f9b1);
						player.setf9B2(f9b2);
						player.setf9S(f9s);
						
						player.setf10B1(f10b1);
						player.setf10B2(f10b2);
						player.setf10B3(f10b3);
						player.setf10S(f10s);
						
						//break;
						counter += 1;
						
					
//					System.out.println("A");
//					System.out.println("Name " + obj.get("Name"));
//					System.out.println("B");
					
					
					
					//playerList.addAll(player);
					
					
					System.out.println("Player List: " + playerList);
					
				}
				
//				for (String a : playerList) {
//					System.out.println("Players: " + a);
//					
//				}
					
				
		
		
			
			
			
			mongoClient.close();
			
			loadedGameGUI.setup(playerList, gameName);
	}catch (Exception e) {
		System.out.println("Fail: " + e);
		
		
	}
	}
	
	public ArrayList getGames(){
		try {
			String dbURI = "mongodb://ben:test1234@kahana.mongohq.com:10098/cp2013Bowling";
			MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
			System.out.println("Connection: Successful");
			
			DB db = mongoClient.getDB("cp2013Bowling");
			System.out.println("Database: " + db);
			
			Set<String> colls = db.getCollectionNames();
			
			ArrayList games = new ArrayList();
			
			for (String game : colls) {
				System.out.println("Game Name: " + game);
				games.add(game);
				
			}
			
			return games;
			
			}catch (Exception e) {
				System.out.println("Fail: " + e);
				
				
			}
		return null;
		
		
	}
}

	


