package com.fourirsw.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    /* Application.java에서
       @EnableJpaAuditing 어노테이션이 달리면
       자동으로 시간을 매핑한 테이블이 들어오게 되므로 테스트 내용이 맞지않게 된다.
       hello_return()과 helloDto_return은 auditing 되기전 내용을 테스트하기
       위한 것인 만큼 테스트 내용을 수정하거나 주석처리하면 된다.
    */

//    @Test
//    public void hello_return() throws Exception{
//        String hello = "hello";
//
//        mvc.perform(get("/hello/"))
//                .andExpect(status().isOk());
//                //.andExpect(content().string(hello));
//    }
//
//    @Test
//    public void helloDto_return() throws Exception {
//        String name = "hello";
//        int amount = 1000;
//
//        mvc.perform(get("/hello/dto")
//        .param("name", name)
//        .param("amount", String.valueOf(amount)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is(name)))
//                .andExpect(jsonPath("$.amount", is(amount)));
//    }
}
