package projects;
import ProjectRepository;
import ProjectDTO;
import Project;

public class ProjectServiceV2 {


    private ProjectRepository repository;


    public void createProject(ProjectDTO dto) {


        repository.save(dto);


        System.out.println("Project Created");

    }


    public void updateStatus(Long id, String status) {


        System.out.println("Project Updated");

    }


    public ProjectDTO getProject(Long id) {

        return repository.findById(id);

    }


    public void deleteProject(Long id) {


        System.out.println("Project Deleted");

    }

}
