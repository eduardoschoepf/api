package com.eduardoschoepf.api;


import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.eduardoschoepf.api.controller.EmployeeController;
import com.eduardoschoepf.api.service.EmployeeService;

@SpringBootTest
@WebMvcTest(controllers = EmployeeController.class)
class EmployeeApplicationTests {
	
	@Autowired
    private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception {
		mockMvc.perform(
			get("/employees"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$[0].firstName", is("Laurent")));
    }

}