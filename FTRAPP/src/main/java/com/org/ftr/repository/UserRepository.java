package com.org.ftr.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.ftr.entities.FtrUser;

@Repository
public interface UserRepository extends JpaRepository<FtrUser, Integer> {

}
