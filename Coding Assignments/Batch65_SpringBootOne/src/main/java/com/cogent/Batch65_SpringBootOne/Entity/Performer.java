package com.cogent.Batch65_SpringBootOne.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "performer")
public class Performer {

	@Id
	int id;
	String name;
	String project;
	String description;
	public Performer(int id, String name, String project, String description) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.description = description;
	}
	public Performer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
