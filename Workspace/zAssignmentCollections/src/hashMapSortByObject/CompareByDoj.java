package hashMapSortByObject;

import java.util.Comparator;
import java.util.Map;



public class CompareByDoj implements Comparator<Map.Entry<String,CampusMind>> {
	public int compare(Map.Entry<String,CampusMind>c1,Map.Entry<String,CampusMind>c2) {
		return c1.getValue().getDoj().compareTo(c2.getValue().getDoj());
	}

}
