package com.fbayhan.manageownlibrary.repositories;

import com.fbayhan.manageownlibrary.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
