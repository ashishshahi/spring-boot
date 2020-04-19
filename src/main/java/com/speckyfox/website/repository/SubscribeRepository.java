package com.speckyfox.website.repository;

import com.speckyfox.website.model.Subscribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Integer> {
}
