//larisakreismanis
package lab10;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;


public class GeoGraphMain{
    
    
    static final String IL = "Illinois";
    static final String IN = "Indiana";
    static final String IA = "Iowa";
    static final String WI = "Wisconsin";
    static final String MO = "Montana";
    static final String KY = "Kentucky";
    
    
    
    
    
    public static void main(final String[] args){
        
        final Graph<String, DefaultEdge> GeoGraph = new SimpleGraph<>(DefaultEdge.class);
    
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
        
        System.out.println(GeoGraph);
        
        final Iterator<String> BF = new BreadthFirstIterator<>(GeoGraph, IL);
        while(BF.hasNext()){
            final String state = BF.next();
            System.out.println(state);
        }
        final Iterator<String> BF2 = new BreadthFirstIterator<>(GeoGraph, IN);
        while(BF2.hasNext()){
            final String state = BF2.next();
            System.out.println(state);
        }
    }
}