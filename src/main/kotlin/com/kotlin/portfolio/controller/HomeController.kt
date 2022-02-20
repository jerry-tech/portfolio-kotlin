package com.kotlin.portfolio.controller

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.HashMap

@RestController
@RequestMapping("/")
class HomeController {

    @GetMapping
    @ApiOperation(value = "Display index page message to users")
    fun message() : HashMap<String, String> {
        val hashMapResponse: HashMap<String, String> = HashMap<String, String>()
        hashMapResponse.put("author", "Jeremiah Udoh")
        hashMapResponse.put("language", "Kotlin")
        hashMapResponse.put("startDate", "20-2-2022")
      
        return hashMapResponse
    }
}
