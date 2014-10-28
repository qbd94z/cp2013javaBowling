package bowlingJava;

import java.util.ArrayList;

public class loadGame {
	public void load(String gameName){
		
		dbConnect connect = new dbConnect();
		
		connect.download(gameName);
	}
	

}
