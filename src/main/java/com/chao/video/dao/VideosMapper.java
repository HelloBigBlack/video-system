package com.chao.video.dao;

import java.util.List;

import com.chao.video.bean.Video;
import com.chao.video.bean.VideoClass;
import com.chao.video.bean.VideoMessage;

public interface VideosMapper {

    int deleteByPrimaryKey(Integer videoId);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer videoId);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
    
    List<Video> getAllVideos();
    
    List<Video> getVideosByVideoMessage(VideoMessage videoMessage);
    
    List<VideoClass> getVideoClasses();
}