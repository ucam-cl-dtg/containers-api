package uk.ac.cam.cl.dtg.teaching.containers.api.model;

public class Attachment {
	private String mimeType;
	private String content;

	public Attachment(String mimeType, String content) {
		super();
		this.mimeType = mimeType;
		this.content = content;
	}

	public Attachment() {
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
