package org.acme.graph.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vividsolutions.jts.geom.Coordinate;

/**
 * 
 * Un sommet dans un graphe
 * 
 * @author MBorne
 *
 */
public class Vertex {

	/**
	 * Identifiant du sommet
	 */
	private String id;

	/**
	 * Position du sommet
	 */
	private Coordinate coordinate;


	
	@JsonIgnore
	private List<Edge> inEdges;
	@JsonIgnore
	private List<Edge> outEdges;

	public Vertex() {
		this.inEdges = new ArrayList<Edge>();
		this.outEdges = new ArrayList<Edge>();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	
	
	public Collection<Edge> getOutEdge() {
		return outEdges;
	}
	
	public Collection<Edge> getInEdge() {
		return inEdges;
	}
	
	

	@Override
	public String toString() {
		return id;
	}

}
