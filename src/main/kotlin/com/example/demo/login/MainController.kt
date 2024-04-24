
package com.example.demo.login
import com.example.demo.vo.UserVO

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class MainController {
	
    @PostMapping("/login")
	@ResponseBody
    fun Login(@RequestBody user:UserVO): String {
		println(user);
        return "Success"
    }

	
}