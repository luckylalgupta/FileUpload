package com.fileuploder.demo.response;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class FileResponse {

    private String filename;
    private String fileDownloadUrl;
    private String fileType;
    private Long size;

    public FileResponse(String filename, String fileDownloadUrl, String fileType, Long size) {
        super();
        this.filename = filename;
        this.fileDownloadUrl = fileDownloadUrl;
        this.fileType = fileType;
        this.size = size;
    }
}
