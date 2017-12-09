//larisakreismanis
package edu.luc.cs271.lab10;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.alg.interfaces.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;


public class Main {
    
    
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
        final Iterator<String> CS = new ClosestFirstIterator<>(GeoGraph, IL);
        while(CS.hasNext()){
            final String state = CS.next();
            System.out.println(state);
        }
        final Iterator<String> CS2 = new ClosestFirstIterator<>(GeoGraph, IN);
        while(CS2.hasNext()){
            final String state = CS2.next();
            System.out.println(state);
        }
        final Iterator<String> DF = new DepthFirstIterator<>(GeoGraph, IL);
        while(DF.hasNext()){
            final String state = DF.next();
            System.out.println(state);
        }
        final Iterator<String> DF2 = new DepthFirstIterator<>(GeoGraph, IN);
        while(DF2.hasNext()){
            final String state = DF2.next();
            System.out.println(state);
        }
        final Iterator<String> RW = new RandomWalkIterator<>(GeoGraph, IL, false, 9);
        while(RW.hasNext()){
            final String state = RW.next();
            System.out.println(state);
        }
        final Iterator<String> RW2 = new RandomWalkIterator<>(GeoGraph, IN, false, 9);
        while(RW2.hasNext()){
            final String state = RW2.next();
            System.out.println(state);
        }
        
        GreedyColoring greedy = new GreedyColoring(GeoGraph);
        VertexColoringAlgorithm.Coloring coloring = greedy.getColoring();
        int numColors = coloring.getNumberColors();
        System.out.println(numColors);
    }
}