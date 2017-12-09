// larisakreismanis
package edu.luc.cs271.lab10;

import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {

  public static void main(final String[] args) {

    final Graph<String, DefaultEdge> GeoGraph = new SimpleGraph<>(DefaultEdge.class);

    final String IL = stateCodes.IL;
    final String IN = stateCodes.IN;
    final String IA = stateCodes.IA;
    final String WI = stateCodes.WI;
    final String MO = stateCodes.MO;
    final String KY = stateCodes.KY;

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
    while (BF.hasNext()) {
      final String state = BF.next();
      System.out.println(state);
    }
    final Iterator<String> BF2 = new BreadthFirstIterator<>(GeoGraph, IN);
    while (BF2.hasNext()) {
      final String state = BF2.next();
      System.out.println(state);
    }
    final Iterator<String> CS = new ClosestFirstIterator<>(GeoGraph, IL);
    while (CS.hasNext()) {
      final String state = CS.next();
      System.out.println(state);
    }
    final Iterator<String> CS2 = new ClosestFirstIterator<>(GeoGraph, IN);
    while (CS2.hasNext()) {
      final String state = CS2.next();
      System.out.println(state);
    }
    final Iterator<String> DF = new DepthFirstIterator<>(GeoGraph, IL);
    while (DF.hasNext()) {
      final String state = DF.next();
      System.out.println(state);
    }
    final Iterator<String> DF2 = new DepthFirstIterator<>(GeoGraph, IN);
    while (DF2.hasNext()) {
      final String state = DF2.next();
      System.out.println(state);
    }
    final Iterator<String> RW = new RandomWalkIterator<>(GeoGraph, IL, false, 9);
    while (RW.hasNext()) {
      final String state = RW.next();
      System.out.println(state);
    }
    final Iterator<String> RW2 = new RandomWalkIterator<>(GeoGraph, IN, false, 9);
    while (RW2.hasNext()) {
      final String state = RW2.next();
      System.out.println(state);
    }

    GreedyColoring colorGraph = new GreedyColoring(GeoGraph);

    System.out.println(colorGraph.getColoring());
  }
}
