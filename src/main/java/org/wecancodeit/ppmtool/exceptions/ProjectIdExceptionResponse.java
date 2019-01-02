package org.wecancodeit.ppmtool.exceptions;

public class ProjectIdExceptionResponse {

	private String projectIdentifier;

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public ProjectIdExceptionResponse(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

}
