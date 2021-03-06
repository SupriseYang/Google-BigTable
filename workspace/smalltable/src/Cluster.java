import java.util.TreeMap;

public class Cluster {
	public static String tabletPrefix = "node3/";
	static TreeMap<String, String> nodes = new TreeMap<String, String>();
	static TreeMap<String, String> activeNodes = new TreeMap<String, String>();
	public static void setup() {
		nodes.put("node1", "localhost:5051");
		nodes.put("node2", "localhost:5051");
		nodes.put("node3", "localhost:5051");
		nodes.put("node4", "localhost:5051");
	}
	
	/*
	 * getTabletMap(); using activeNodes();
	 * If node is up/down only update tableMaps - updateMaps()
	 * 
	 */
	
	public static TreeMap<String, String> getTabletMap() {
		setup();
		 TreeMap<String, String> tabletMap = new TreeMap<String, String>();
		 tabletMap.put("A,G",  nodes.get("node1"));
		 tabletMap.put("G,Z",  nodes.get("node2"));
		 tabletMap.put("a,g",  nodes.get("node3"));
		 tabletMap.put("g,z",  nodes.get("node4")); 
		 return tabletMap;
	} 
}
