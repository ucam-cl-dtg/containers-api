package uk.ac.cam.cl.dtg.teaching.containers.api.model;

public class ContainerData {
	
	private String id;
	private String name;

	public ContainerData(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
