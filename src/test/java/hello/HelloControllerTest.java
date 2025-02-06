package hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest  // Ensures full application context is loaded
@AutoConfigureMockMvc  // Automatically configures MockMvc for testing
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;  // This should be injected properly

    @Test
    public void testIndex() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().string("Greetings from Springboot..!!!"));
    }
}
