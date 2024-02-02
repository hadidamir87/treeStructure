package com.example.treetask.repository;

import com.example.treetask.model.entity.Tree;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TreeRepository extends JpaRepository<Tree, Long> {
    /*List<Tree> findAll();

    Optional<Tree> findById(Long id);*/
}
