package jp.qilab.spring.repository;

import java.util.List;

import jp.qilab.spring.domain.Hotel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelsRepository extends JpaRepository<Hotel, Integer> {

	List<Hotel> findByPriceLessThanEqual(Integer upperPrice);
}
