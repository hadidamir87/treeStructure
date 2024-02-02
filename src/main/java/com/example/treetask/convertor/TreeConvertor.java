package com.example.treetask.convertor;

import com.example.treetask.model.dto.TreeDto;
import com.example.treetask.model.entity.Tree;
import com.example.treetask.model.srv.TreeSrv;
import org.hibernate.service.spi.ServiceException;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")

public interface TreeConvertor<Tree, TreeDto, TreeSrv> {

    TreeDto entityConvertToDto(Tree tree);

    TreeSrv entityConvertToSrv(Tree tree);

    Tree dtoConvertToEntity(TreeDto Dto);

    default List<Tree> dtoListConvertToEntityList(List<TreeDto> dList) {
        if (dList != null) {
            return dList.stream().map(i -> {
                try {
                    return dtoConvertToEntity(i);
                } catch (ServiceException e) {
                    throw new RuntimeException(e);
                }
            }).collect(Collectors.toList());

        }
        return null;
    }

    default List<TreeSrv> entityListConvertToSrv(List<Tree> eList) {
        if (eList != null) {
            return eList.stream()
                    .map(i -> entityConvertToSrv(i))
                    .collect(Collectors.toList());
        }
        return null;
    }
}




