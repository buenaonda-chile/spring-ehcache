package com.example.springehcache.controller

import com.example.springehcache.dto.MemberGradeDTO
import com.example.springehcache.service.MemberGradeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/members")
class MemberController (
    private val memberGradeService: MemberGradeService
){
    @GetMapping
    fun findAll() : MemberGradeDTO {
        return memberGradeService.getGrade();
    }
}