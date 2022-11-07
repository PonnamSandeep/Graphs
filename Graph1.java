package graphsList;

import java.util.ArrayList;

public class Graph1 {
	
	ArrayList<GraphNodelist> nodeList=new ArrayList<GraphNodelist>();
	
	public Graph1(ArrayList<GraphNodelist> nodeList) {
		this.nodeList=nodeList;
	}
	
	public void addUndirectedEdge(int i, int j) {
		GraphNodelist first= nodeList.get(i);
		GraphNodelist second= nodeList.get(j);
		first.neighbours.add(second);
		second.neighbours.add(first);
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i=0;i<nodeList.size();i++) {
			s.append(nodeList.get(i).name+": ");
			for(int j=0;j<nodeList.get(i).neighbours.size();j++) {
				if(j == nodeList.get(i).neighbours.size()-1) {
					s.append(nodeList.get(i).neighbours.get(j).name);
				} else {
					s.append((nodeList.get(i).neighbours.get(j).name)+" -> ");
				}
			}
			s.append("\n");
		}
		return s.toString();
	}

}
