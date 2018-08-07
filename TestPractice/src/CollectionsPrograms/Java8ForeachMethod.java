package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class Java8ForeachMethod {

	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        
        gamesList.forEach(games -> System.out.println(games));
        
        
	}

}
