package com.danish.entity;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.utils.UUIDs;

@Table("student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8021147609254595625L;
	@PrimaryKeyColumn(name = "id", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	private UUID id = UUIDs.timeBased();
	@PrimaryKeyColumn(name = "student_name", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private String studentName;
	@Column("address")
	private String address;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(UUID id, String studentName, String address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.address = address;
	}

	public Student() {
		super();
	}

}
