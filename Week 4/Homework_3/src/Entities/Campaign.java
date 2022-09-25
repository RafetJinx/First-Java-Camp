package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String category;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private int ratio;
	
	public Campaign(int id, String category, String name, LocalDate startDate, LocalDate endDate, int ratio) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ratio = ratio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
	}
	
	
	
	
}
