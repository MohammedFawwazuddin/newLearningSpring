package com.prodapt.learningspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.prodapt.learningspring.entity.MutedAuthor;

 
import java.util.List;

public interface MutedAuthorRepository extends JpaRepository<MutedAuthor, Integer> {

	@Query(value = "select fav_user_id from fav_author where user_id = ?1", nativeQuery = true)
	List<MutedAuthor> findAllByPostId(Integer user_id);
}
