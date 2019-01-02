package org.wecancodeit.ppmtool.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String projectName;
	private String projectIdentifier;
	private String description;
	private Date start_date;
	private Date end_date;

	private Date created_At;
	private Date updated_At;

	public Long getId() {
		return id;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public Project() {
	}

	@PrePersist
	protected void onCreate() {
		this.created_At = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updated_At = new Date();
	}

}
