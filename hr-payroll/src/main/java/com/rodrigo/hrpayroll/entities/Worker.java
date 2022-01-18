package com.rodrigo.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;

public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double DAILY_INCOME;

	public Worker() {
	}

	public Worker(Long id, String name, Double dAILY_INCOME) {
		super();
		this.id = id;
		this.name = name;
		DAILY_INCOME = dAILY_INCOME;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDAILY_INCOME() {
		return DAILY_INCOME;
	}

	public void setDAILY_INCOME(Double dAILY_INCOME) {
		DAILY_INCOME = dAILY_INCOME;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}

}
