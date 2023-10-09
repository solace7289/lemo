/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab.training.project.demo_fap.Repositories;

import lab.training.project.demo_fap.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hoangson
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
