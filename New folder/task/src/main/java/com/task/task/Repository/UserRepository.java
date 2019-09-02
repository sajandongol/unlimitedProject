package com.task.task.Repository;

import com.task.task.Entity.User;
import com.task.task.Service.ExpertUserService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{


}
