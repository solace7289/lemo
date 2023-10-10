package lab.training.project.demo_fap.Controller;

import lab.training.project.demo_fap.Entities.Role;
import lab.training.project.demo_fap.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/role")
    public ModelAndView getRoles(){
//        Map<String, Object> status = new HashMap<>();

        Iterable<Role> roles;
        roles = roleService.findAllRole();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/role_list.jsp");
        mv.addObject("rolesList", roles);


        return mv;
    }
}
