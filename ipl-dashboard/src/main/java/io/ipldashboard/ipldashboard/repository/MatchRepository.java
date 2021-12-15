package io.ipldashboard.ipldashboard.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import io.ipldashboard.ipldashboard.model.Match;

public interface MatchRepository extends CrudRepository<Match,Long> {

    List<Match> getByTeam1OrTeam2OrderByDate(String teamName1,String teamName2,Pageable pageable);

    default List<Match> findLatestMatchesByTeam(String teamName,int count) {
        return getByTeam1OrTeam2OrderByDate(teamName, teamName, PageRequest.of(0,count));
    }
}
