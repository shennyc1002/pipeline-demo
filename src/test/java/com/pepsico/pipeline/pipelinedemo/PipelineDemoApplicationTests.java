package com.pepsico.pipeline.pipelinedemo;

import com.pepsico.pipeline.pipelinedemo.Service.PipelineService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PipelineDemoApplicationTests {

	Logger logger = LoggerFactory.getLogger(PipelineDemoApplicationTests.class);

	@InjectMocks
    PipelineService pipelineService;


	@Test
	public void contextLoads() {
	}
	@Test
	public void testGetMessage()
	{
		logger.error("inside the tests");
		assertEquals("Welcome to Concourse Pipeline",pipelineService.getMessage());

	}
	@Test
	public void testGetMessageType()
	{
		logger.error("inside the tests 1");
		assertNotNull(pipelineService.getMessage());
	}

}

