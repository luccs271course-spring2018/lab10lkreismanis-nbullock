//larisakreismanis

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;


public class GeoGraphMain{
    final Graph<String, DefaultEdge> GeoGraph = new SimpleGraph<>(DefaultEdge.class);
    
    final String IL = "Illinois";
    final String IN = "Indiana";
    final String IA = "Iowa";
    final String WI = "Wisconsin";
    final String MO = "Montana";
    final String KY = "Kentucky";
    
    GeoGraph.addVertex(IL);
    GeoGraph.addVertex(IN);
    GeoGraph.addVertex(IA);
    GeoGraph.addVertex(WI);
    GeoGraph.addVertex(MO);
    GeoGraph.addVertex(KY);
    
    GeoGraph.addEdge(IL, IN);
    GeoGraph.addEdge(IL, KY);
    GeoGraph.addEdge(IL, MO);
    GeoGraph.addEdge(IL, WI);
    GeoGraph.addEdge(IL, IA);
    GeoGraph.addEdge(IN, KY);
    GeoGraph.addEdge(KY, MO);
    GeoGraph.addEdge(MO, IA);
    GeoGraph.addEdge(IA, WI);
    
    
    public static void main(final String[] args){
        
    }
}