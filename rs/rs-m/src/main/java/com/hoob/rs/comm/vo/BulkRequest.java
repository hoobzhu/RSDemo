package com.hoob.rs.comm.vo;

import java.util.List;

import com.hoob.rs.comm.vo.Request;

public class BulkRequest extends Request {

	private List<String> contentIds;

	public List<String> getContentIds() {
		return contentIds;
	}

	public void setContentIds(List<String> contentIds) {
		this.contentIds = contentIds;
	}

	
}
