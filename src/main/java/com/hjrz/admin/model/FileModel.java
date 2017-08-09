package com.hjrz.admin.model;

import java.io.Serializable;

public class FileModel implements Serializable{

	private static final long serialVersionUID = 2780976864858197554L;
	
	private String file_type;
	
	private String file_name;
	
	private String file_path;

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	
	

}
