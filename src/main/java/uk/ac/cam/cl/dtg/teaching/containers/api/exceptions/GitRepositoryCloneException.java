package uk.ac.cam.cl.dtg.teaching.containers.api.exceptions;

public class GitRepositoryCloneException extends Exception {

	private static final long serialVersionUID = 1L;

	public GitRepositoryCloneException() {
	}

	public GitRepositoryCloneException(String message) {
		super(message);
	}

	public GitRepositoryCloneException(Throwable cause) {
		super(cause);
	}

	public GitRepositoryCloneException(String message, Throwable cause) {
		super(message, cause);
	}

	public GitRepositoryCloneException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
