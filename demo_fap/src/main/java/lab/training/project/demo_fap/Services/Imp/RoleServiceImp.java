package lab.training.project.demo_fap.Services.Imp;

import lab.training.project.demo_fap.Entities.Role;
import lab.training.project.demo_fap.Repositories.RoleRepository;
import lab.training.project.demo_fap.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Iterable<Role> findAllRole() {
        return roleRepository.findAll();
    }
}
