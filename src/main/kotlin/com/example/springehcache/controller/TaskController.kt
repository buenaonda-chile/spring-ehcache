package com.example.springehcache.controller

import com.example.springehcache.dto.TaskDTO
import com.example.springehcache.facade.TaskFacade
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.concurrent.timerTask
import kotlin.math.tan

@RestController
@RequestMapping("/api/tasks")
class TaskController (
    private val taskFacade: TaskFacade
) {
    @GetMapping
    fun findAll() : List<TaskDTO> {
        return taskFacade.findAll();
    }
}