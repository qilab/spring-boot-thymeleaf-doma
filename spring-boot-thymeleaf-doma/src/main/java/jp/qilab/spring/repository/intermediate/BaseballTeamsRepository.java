package jp.qilab.spring.repository.intermediate;

import jp.qilab.spring.domain.intermediate.BaseballTeam;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseballTeamsRepository extends JpaRepository<BaseballTeam, Integer> {

}
