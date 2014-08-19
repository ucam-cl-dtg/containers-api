package uk.ac.cam.cl.dtg.teaching.containers.api.exceptions;

public class TestInstanceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public TestInstanceNotFoundException() {
	}

	public TestInstanceNotFoundException(String message) {
		super(message);
	}

	public TestInstanceNotFoundException(Throwable cause) {
		super(cause);
	}

	public TestInstanceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public TestInstanceNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
