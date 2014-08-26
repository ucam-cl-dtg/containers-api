package uk.ac.cam.cl.dtg.teaching.containers.api.model;


/**
 * This object needs to be immutable since its used concurrently by many threads.  It also needs to be serializable/deserializable through jackson.
 * @author acr31
 *
 */
public class TestDetails {

	private String id;
	private String name;
	private String[] commands;

	public String getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("unused")
	private void setName(String name) {
		this.name = name;
	}

	public String[] getCommands() {
		return commands;
	}

	@SuppressWarnings("unused")
	private void setCommands(String[] commands) {
		this.commands = commands;
	}
}
