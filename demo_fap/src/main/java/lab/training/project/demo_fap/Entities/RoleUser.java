/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.training.project.demo_fap.Entities;

import java.util.List;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author phamminhgiang
 */
@Entity
@Table(name = "role")
@Data
public class RoleUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @OneToMany(mappedBy = "roleId", cascade = CascadeType.ALL)
    private List<User> users;
    
}
