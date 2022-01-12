package com.educavalieri.dsmovie.repositories;

import com.educavalieri.dsmovie.entities.Score;
import com.educavalieri.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
