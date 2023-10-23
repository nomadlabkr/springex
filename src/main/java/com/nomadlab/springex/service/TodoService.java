package com.nomadlab.springex.service;

import com.nomadlab.springex.domain.TodoVO;
import com.nomadlab.springex.dto.PageRequestDTO;
import com.nomadlab.springex.dto.PageResponseDTO;
import com.nomadlab.springex.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    void register(TodoDTO todoDTO);

    List<TodoDTO> getAll();

    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);
}
