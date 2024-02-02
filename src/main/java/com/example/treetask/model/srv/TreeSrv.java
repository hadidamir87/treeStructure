package com.example.treetask.model.srv;

import com.example.treetask.model.entity.Tree;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TreeSrv {
    private String name;
    private List<Tree> children;

}
