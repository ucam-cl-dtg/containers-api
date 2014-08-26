package uk.ac.cam.cl.dtg.teaching.containers.api.exceptions;

public class TestNotFoundExcaption extends Exception {

	private static final long serialVersionUID = 1L;

	public TestNotFoundExcaption() {
	}

	public TestNotFoundExcaption(String message) {
		super(message);
	}

	public TestNotFoundExcaption(Throwable cause) {
		super(cause);
	}

	public TestNotFoundExcaption(String message, Throwable cause) {
		super(message, cause);
	}

	public TestNotFoundExcaption(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
