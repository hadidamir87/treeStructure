package com.example.treetask.controller;

import com.example.treetask.model.dto.TreeDto;
import com.example.treetask.model.entity.Tree;
import com.example.treetask.model.srv.TreeSrv;
import com.example.treetask.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trees")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @GetMapping
    public List<TreeSrv> getAllTrees() {
        return treeService.getAllTrees();
    }

    @GetMapping("/{id}")
    public TreeSrv getTreeById(@PathVariable Long id) {
        return treeService.getTreeById(id);
    }

    @PostMapping
    public TreeSrv createTree(@RequestBody Tree tree) {
        return treeService.createTree(tree);
    }


    public TreeResponseDto createTree(@RequestBody TreeRequestDto requestDto) {
        return treeService.createTree(requestDto);
    }


    @PutMapping("/{id}")
    public Tree updateTree(@PathVariable Long id, @RequestBody Tree updatedTree) {
        return treeService.updateTree(id, updatedTree);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTree(@PathVariable Long id) {
        treeService.deleteTree(id);
        return ResponseEntity.ok().build();
    }

    /*@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }*/
}


