package lab.training.project.demo_fap.Controller;

import lab.training.project.demo_fap.Entities.Role;
import lab.training.project.demo_fap.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/role")
    public Map<String, Object> getRoles(){
        Map<String, Object> status = new HashMap<>();

        Iterable<Role> roles;
        roles = roleService.findAllRole();

        status.put("roles", roles);

        return status;
    }
}
