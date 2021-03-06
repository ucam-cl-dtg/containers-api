package uk.ac.cam.cl.dtg.teaching.containers.api;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import uk.ac.cam.cl.dtg.teaching.containers.api.exceptions.GitRepositoryCloneException;
import uk.ac.cam.cl.dtg.teaching.containers.api.exceptions.InvalidNameException;
import uk.ac.cam.cl.dtg.teaching.containers.api.model.ContainerData;
import uk.ac.cam.cl.dtg.teaching.containers.api.model.Result;

@Path("/testers")
@Produces("application/json")
public interface TesterApi {

	@GET
	@Path("/")
	public List<ContainerData> listTesters(@CookieParam("crsid") String crsid)
			throws InvalidNameException;

	@DELETE
	@Path("/{containerID}")
	public Result deleteTester(@CookieParam("crsid") String crsid,
			@PathParam("containerID") String containerID)
			throws InvalidNameException;

	@POST
	@Path("/")
	public ContainerData createTester(@CookieParam("crsid") String crsid,
			@FormParam("testerName") String name,
			@FormParam("gitURL") String gitURL,
			@FormParam("branch") String branch,
			@FormParam("parentImageID") String parentID,
			@FormParam("privateKey") String privateKey)
			throws GitRepositoryCloneException, InvalidNameException;

	@POST
	@Path("/{containerID}/rescan")
	public Result rescan(@CookieParam("crsid") String crsid, @PathParam("containerID") String containerID) throws InvalidNameException, IOException;
}