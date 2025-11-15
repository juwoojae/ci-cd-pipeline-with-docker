package ci_cd_pipeline_with_docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String HelloController() {
        return "Hello World";
    }
}
