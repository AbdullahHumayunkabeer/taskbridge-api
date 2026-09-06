package projects;

import ProjectDTO;
public interface ProjectRepository {


    void save(ProjectDTO project);


    ProjectDTO findById(Long id);

}