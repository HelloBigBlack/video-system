package com.chao.video.bean;


public class Video {
	// 视频的id
    private Integer videoId;
    // 视频的标题
    private String videoTitle;
    // 视频的简介
    private String videoBrief;
    // 视频的类别
    private String videoClass;
    // 视频的标签
    private String videoLabel;
    // 视频的封面url
    private String imgUrl;
    // 视频文件的url
    private String videoUrl;
    // 视频的上传时间
    private String uploadTime;
    // 视频的时长
    private Integer videoTime;
    // 视频的访问量 
    private Integer videoVisited;
    // 视频的留言数量
    private Integer messageCount;

   

	public Integer getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(Integer messageCount) {
		this.messageCount = messageCount;
	}

	public Integer getVideoVisited() {
		return videoVisited;
	}

	public void setVideoVisited(Integer videoVisited) {
		this.videoVisited = videoVisited;
	}

	public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }

    public String getVideoBrief() {
        return videoBrief;
    }

    public void setVideoBrief(String videoBrief) {
        this.videoBrief = videoBrief == null ? null : videoBrief.trim();
    }

    public String getVideoClass() {
        return videoClass;
    }

    public void setVideoClass(String videoClass) {
        this.videoClass = videoClass == null ? null : videoClass.trim();
    }

    public String getVideoLabel() {
        return videoLabel;
    }

    public void setVideoLabel(String videoLabel) {
        this.videoLabel = videoLabel == null ? null : videoLabel.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }

    public Integer getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(Integer videoTime) {
        this.videoTime = videoTime;
    }

	@Override
	public String toString() {
		return "Video [videoId=" + videoId + ", videoTitle=" + videoTitle + ", videoBrief=" + videoBrief
				+ ", videoClass=" + videoClass + ", videoLabel=" + videoLabel + ", imgUrl=" + imgUrl + ", videoUrl="
				+ videoUrl + ", uploadTime=" + uploadTime + ", videoTime=" + videoTime + ", videoVisited="
				+ videoVisited + ", messageCount=" + messageCount + "]";
	}

    
}