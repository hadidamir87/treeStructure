package com.example.treetask.service;

import com.example.treetask.convertor.TreeConvertor;
import com.example.treetask.model.dto.TreeDto;
import com.example.treetask.model.srv.TreeSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TreeService<Tree, TreeRepository extends JpaRepository> {
    @Autowired

    private TreeRepository treeRepository;
    @Autowired
    private TreeConvertor treeConvertor;

    public TreeSrv createTree(TreeDto treeDto) {
        Tree tree = new Tree();
                treeConvertor.dtoConvertToEntity(treeDto);
        tree = treeRepository.save(tree);
        return treeConvertor.entityConvertToSrv(tree);
    }

    public List<TreeSrv> getAllTrees() {
        List<Tree> trees = treeRepository.findAll();
        return treeConvertor.entityListConvertToSrv(trees);
    }


    public Tree updateTree(Long id, Tree updatedTree) {
        Tree existingTree = getTreeById(id);
        /*existingTree.
                setName(updatedTree.getName());*/
        return treeRepository.save(existingTree);
    }

    public void deleteTree(Long id) {
        Tree tree = getTreeById(id);
        treeRepository.delete(tree);
    }
}
