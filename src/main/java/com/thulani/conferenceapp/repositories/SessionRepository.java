package com.thulani.conferenceapp.repositories;

import com.thulani.conferenceapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

//Session class is our data type and Long is the primary key
public interface SessionRepository extends JpaRepository <Session, Long>{
}
