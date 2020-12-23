/*
 * SA7
 * @author Tooryanand Seetohul
 * adapted from relationship test from class
 * 
 */
import java.util.List;

public class GraphLibTest extends GraphLib{
	
	public static void main(String [] args) {
		Graph<String, String> CharacterMap = new AdjacencyMapGraph<String, String>();
		
		CharacterMap.insertVertex("A");
		CharacterMap.insertVertex("B");
		CharacterMap.insertVertex("C");
		CharacterMap.insertVertex("D");
		CharacterMap.insertVertex("E");
		
		CharacterMap.insertDirected("A", "B", "follower");
		CharacterMap.insertDirected("A", "C", "follower");
		CharacterMap.insertDirected("A", "D", "follower");
		CharacterMap.insertDirected("A", "E", "follower");
		CharacterMap.insertDirected("B", "A", "follower");
		CharacterMap.insertDirected("B", "C", "follower");
		CharacterMap.insertDirected("C", "A", "follower");
		CharacterMap.insertDirected("C", "B", "follower");
		CharacterMap.insertDirected("C", "D", "follower");
		CharacterMap.insertDirected("E", "B", "follower");
		CharacterMap.insertDirected("E", "C", "follower");
		
		List<String> path = randomWalk(CharacterMap, "A", 5);
		System.out.println(path);
		
		List<String> path1 = randomWalk(CharacterMap, "A", 7);
		System.out.println(path1);
		
		List<String> path11 = randomWalk(CharacterMap, "E", 4);
		System.out.println(path11);
		
		List<String> Order = verticesByInDegree(CharacterMap);
		System.out.println(Order);
	}
}
