package com.ardatoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ardatoa.entites.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long>{

}
