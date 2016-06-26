package com.foobar.examples.swagger;

import java.util.Date;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Michael on 2016/6/26.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public TestModel echo(@RequestParam String message) {
        return new TestModel(new Date(), message);
    }
}
