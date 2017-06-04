/**
 * 
 */
package test.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;

import main.controller.Hello;

/**
 * @author fzb
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:*.xml")
@WebAppConfiguration
public class HelloTest {
	
	@Test
		public String helloTest() throws Exception{
			Hello hello=new Hello();
			 MockMvc mock=MockMvcBuilders.standaloneSetup(hello).build();
			 ResultActions result =mock.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("hello"));
		return null;
	}
}
