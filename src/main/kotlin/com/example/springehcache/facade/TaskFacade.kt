package com.example.springehcache.facade

import com.example.springehcache.dto.TaskDTO
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Slf4j
@Service
class TaskFacade {
    fun findAll() : List<TaskDTO> {
        return listOf(
            TaskDTO(1L, "My first task", true),
            TaskDTO(2L, "My second task", false)
        )
    }
}