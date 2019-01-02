package org.wecancodeit.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wecancodeit.ppmtool.domain.Project;
import org.wecancodeit.ppmtool.exceptions.ProjectIdException;
import org.wecancodeit.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepo;

	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepo.save(project);
		} catch (Exception e) {
			throw new ProjectIdException(
					"Project ID" + project.getProjectIdentifier().toUpperCase() + " already exists");
		}

	}

}
