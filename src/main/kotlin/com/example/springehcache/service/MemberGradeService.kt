package com.example.springehcache.service

import com.example.springehcache.dto.MemberGradeDTO
import lombok.extern.slf4j.Slf4j
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Slf4j
@Service
class MemberGradeService {

    @Cacheable("grade")
    fun getGrade() : MemberGradeDTO {
        return MemberGradeDTO(1L, "VIP");
    }
}