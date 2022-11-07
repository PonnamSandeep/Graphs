package graphsList;

import java.util.ArrayList;

public class GraphNodelist {
	public String name;
	public int index;
	
	public ArrayList<GraphNodelist> neighbours = new ArrayList<GraphNodelist>();
	
	public GraphNodelist(String name, int index) {
		this.name=name;
		this.index=index;
	}

}
