package io.ipldashboard.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.ipldashboard.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team,Long> {
    
    Team findByTeamName(String teamName);
}
