package com.b2w.api.challenge.mock;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.b2w.api.challenge.ChallengeB2wStarWarsApplication;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=ChallengeB2wStarWarsApplication.class)
@AutoConfigureMockMvc
public class PlanetTest {
	
	    
}
