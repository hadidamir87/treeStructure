package com.example.treetask.model.dto;

import com.example.treetask.model.entity.Tree;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TreeDto {
    private String name;
    private Tree parent;

}
