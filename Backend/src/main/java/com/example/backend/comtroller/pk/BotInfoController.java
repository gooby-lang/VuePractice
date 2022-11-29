package com.example.backend.comtroller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getBotInfo/")
    public Map<String, String> getBotInfo() {
        Map<String, String> ans = new HashMap<>();
        ans.put("name", "JYF");
        ans.put("rating", "114514");
        return ans;
    }
}
