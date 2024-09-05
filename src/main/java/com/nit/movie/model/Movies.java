package com.nit.movie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movies {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String year;
	private String runtime;
	private String poster;
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(String title, String year, String runtime, String poster) {
		super();
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.poster = poster;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getPoster() {
		System.out.println("getting poster....");
		return poster;
		
	}
	public void setPoster(String poster) {
		this.poster = poster;
		System.out.println("setting poster");
	}

}
