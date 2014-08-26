package uk.ac.cam.cl.dtg.teaching.containers.api.exceptions;

public class TestNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public TestNotFoundException() {
	}

	public TestNotFoundException(String message) {
		super(message);
	}

	public TestNotFoundException(Throwable cause) {
		super(cause);
	}

	public TestNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public TestNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
