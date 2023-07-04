package com.exercices.exercice1.domain;

public class ObjectB {

	
	private String nameB;
	private int idB;
	private String labelB;
	
	
	public ObjectB(String nameB, int idB, String labelB) {
		super();
		this.nameB = nameB;
		this.idB = idB;
		this.labelB = labelB;
	}
	public ObjectB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNameB() {
		return nameB;
	}
	public void setNameB(String nameB) {
		this.nameB = nameB;
	}
	public int getIdB() {
		return idB;
	}
	public void setIdB(int idB) {
		this.idB = idB;
	}
	public String getLabelB() {
		return labelB;
	}
	public void setLabelB(String labelB) {
		this.labelB = labelB;
	}
	@Override
	public String toString() {
		return "ObjectB [nameB=" + nameB + ", idB=" + idB + ", labelB=" + labelB + "]";
	}
	
	
	
	
}
