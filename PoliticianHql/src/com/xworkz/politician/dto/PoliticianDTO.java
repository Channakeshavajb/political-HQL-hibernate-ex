package com.xworkz.politician.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "politician")
@NamedQueries({ @NamedQuery(name = "selectAll", query = "select p from PoliticianDTO p"),
		@NamedQuery(name = "fetchAllLocation", query = "select p.constituency from PoliticianDTO p where p.name=:pname"),
		@NamedQuery(name = "fetchAllConstAndExpByName", query = "select p.constituency,p.exp from PoliticianDTO p where p.name=:pname")})

public class PoliticianDTO implements Serializable {

	@Id
	@GenericGenerator(name = "politics", strategy = "increment")
	@GeneratedValue(generator = "politics")
	@Column(name = "p_id")
	private int pid;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_constituency")
	private String constituency;
	@Column(name = "p_exp")
	private int exp;

	public PoliticianDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "PoliticianDTO [pid=" + pid + ", name=" + name + ", constituency=" + constituency + ", exp=" + exp + "]";
	}

}
