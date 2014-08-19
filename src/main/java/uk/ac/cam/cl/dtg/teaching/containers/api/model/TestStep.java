package uk.ac.cam.cl.dtg.teaching.containers.api.model;

import java.util.List;

public class TestStep {
	private List<String> messages;
	private Object expected;
	private Object actual;
	private String className;
	private String methodName;
	private String fileName;
	private long startLine;
	private long endLine;
	private String status;

	public static final String STATUS_PASS = "PASS";
	public static final String STATUS_FAIL = "FAIL";
	public static final String STATUS_WARNING = "WARNING";
	
	public TestStep() {}
	
	public TestStep(List<String> messages, Object expected, Object actual,
			String className, String methodName, String fileName,
			long startLine, long endLine, String status) {
		super();
		this.messages = messages;
		this.expected = expected;
		this.actual = actual;
		this.className = className;
		this.methodName = methodName;
		this.fileName = fileName;
		this.startLine = startLine;
		this.endLine = endLine;
		this.status = status;
	}
	
	
	
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public void setExpected(Object expected) {
		this.expected = expected;
	}

	public void setActual(Object actual) {
		this.actual = actual;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setStartLine(long startLine) {
		this.startLine = startLine;
	}

	public void setEndLine(long endLine) {
		this.endLine = endLine;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getMessages() {
		return messages;
	}

	public Object getExpected() {
		return expected;
	}

	public Object getActual() {
		return actual;
	}

	public String getClassName() {
		return className;
	}

	public String getMethodName() {
		return methodName;
	}

	public long getStartLine() {
		return startLine;
	}

	public long getEndLine() {
		return endLine;
	}
	
	public String getStatus() {
		return status;
	}

	public String getFileName() {
		return fileName;
	}
	
}