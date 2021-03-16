package com.app.dreamcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dreamcars.pojo.Allcarstable;

public interface DreamcarsRepository extends JpaRepository<Allcarstable, Long>{

}
