package com.prodapt.learningspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.prodapt.learningspring.entity.FavAuthor;

 
import java.util.List;

public interface FavouriteAuthorRepository extends JpaRepository<FavAuthor, Integer> {

	@Query(value = "select fav_user_id from fav_author where user_id = ?1", nativeQuery = true)
	List<FavAuthor> findAllByPostId(Integer user_id);
}
