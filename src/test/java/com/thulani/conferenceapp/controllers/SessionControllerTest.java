package com.thulani.conferenceapp.controllers;

import com.thulani.conferenceapp.models.Session;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class SessionControllerTest extends AbstractControllerTest {

	@Test
	public void shouldReturnFoundSession() throws Exception {
		// given
		Session session = new Session();
		session.setSession_id(100L);
		session.setSession_name("Keynote - The Golden Age of Software");
		session.setSession_length(45);
		session.setSession_description("Description - The Golden Age of Software");


		// when
		when(sessionRepository.getOne(100L)).thenReturn(session);

		// then
		mockMvc.perform(get("/api/v1/sessions/100").accept(APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(APPLICATION_JSON))
				.andExpect(jsonPath("$.session_description", is("Description - The Golden Age of Software")))
				.andExpect(jsonPath("$.session_length", is(45)))
				.andExpect(jsonPath("$.session_name", is("Keynote - The Golden Age of Software")));
	}
}
