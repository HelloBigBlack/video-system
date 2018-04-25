package com.chao.video.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.chao.video.bean.Video;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMethod {
	
	@Test
	public void test1() throws Exception, JsonMappingException, IOException{
		String jsonstr = "[{\"videoId\":1,\"videoTitle\":\"123\",\"videoBrief\":\"123\",\"videoClass\":null,\"videoLabel\":null,\"imgUrl\":\"123\",\"videoUrl\":\"123\",\"uploadTime\":\"2018-03-19\",\"videoTime\":123,\"videoVisited\":0},{\"videoId\":2,\"videoTitle\":\"222\",\"videoBrief\":\"222\",\"videoClass\":\"11\",\"videoLabel\":\"1231231\",\"imgUrl\":\"22\",\"videoUrl\":\"222\",\"uploadTime\":\"2018-03-30\",\"videoTime\":22,\"videoVisited\":0}]";
		ObjectMapper mapper = new ObjectMapper();
		List<Video> videos = mapper.readValue(jsonstr, new TypeReference<List<Video>>() {});
		System.out.println(videos);
	}
	
}
