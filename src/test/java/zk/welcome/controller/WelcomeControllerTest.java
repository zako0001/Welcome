package zk.welcome.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@WebMvcTest(WelcomeController.class)
class WelcomeControllerTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testWelcome() throws Exception {
        mockMvc.perform(get("/welcome"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"));
    }
}