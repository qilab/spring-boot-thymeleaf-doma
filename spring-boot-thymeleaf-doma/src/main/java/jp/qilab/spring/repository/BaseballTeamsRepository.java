package jp.qilab.spring.repository;

import jp.qilab.spring.domain.BaseballTeam;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseballTeamsRepository extends JpaRepository<BaseballTeam, Integer> {

}
