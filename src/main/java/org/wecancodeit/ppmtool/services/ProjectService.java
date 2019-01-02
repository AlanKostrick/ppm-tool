package org.wecancodeit.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wecancodeit.ppmtool.domain.Project;
import org.wecancodeit.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepo;

	public Project saveOrUpdateProject(Project project) {
		return projectRepo.save(project);
	}

}
