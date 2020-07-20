package com.thulani.conferenceapp.repositories;

import com.thulani.conferenceapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

//Speaker class is our data type and Long is the primary key
public interface SpeakerRepository extends JpaRepository <Speaker, Long> {
}
