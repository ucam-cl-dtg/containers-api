package uk.ac.cam.cl.dtg.teaching.containers.api.model;

public class TestInfo {

	private String testName;
	private String containerID;
	private String testID;

	public TestInfo() {
	}

	public TestInfo(String testName, String containerID, String testID) {
		this.testName = testName;
		this.containerID = containerID;
		this.testID = testID;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getContainerID() {
		return containerID;
	}

	public void setContainerID(String containerID) {
		this.containerID = containerID;
	}

	public String getTestID() {
		return testID;
	}

	public void setTestID(String testID) {
		this.testID = testID;
	}

}
