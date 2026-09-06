package projects;

public interface ProjectRepository {


    void save(ProjectDTO project);


    ProjectDTO findById(Long id);

}