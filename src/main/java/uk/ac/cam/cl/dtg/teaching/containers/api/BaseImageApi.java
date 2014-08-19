package uk.ac.cam.cl.dtg.teaching.containers.api;

import java.util.List;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import uk.ac.cam.cl.dtg.teaching.containers.api.exceptions.InvalidNameException;
import uk.ac.cam.cl.dtg.teaching.containers.api.model.ContainerData;
import uk.ac.cam.cl.dtg.teaching.containers.api.model.Result;

@Path("/baseimages")
@Produces("application/json")
public interface BaseImageApi {

	@GET
	@Path("/builders")
	public abstract List<ContainerData> listBaseImageBuilders(
			@CookieParam("crsid") String crsid) throws InvalidNameException;

	@POST
	@Path("/builders")
	public abstract ContainerData createBaseImageBuilder(
			@CookieParam("crsid") String crsid,
			@FormParam("parentImageID") String parentImageID,
			@FormParam("baseImageBuilderName") String baseImageBuilderName)
			throws InvalidNameException;

	@DELETE
	@Path("/builders/{containerID}")
	public abstract Result deleteBaseImageBuilder(
			@CookieParam("crsid") String crsid,
			@PathParam("containerID") String containerID)
			throws InvalidNameException;

	@GET
	@Path("/")
	public abstract List<ContainerData> listBaseImages();

	@POST
	@Path("/")
	public abstract Result createBaseImage(@CookieParam("crsid") String crsid,
			@FormParam("containerID") String containerID)
			throws InvalidNameException;

	@DELETE
	@Path("/{imageID}")
	public abstract Result deleteImage(@CookieParam("crsid") String crsid,
			@PathParam("imageID") String imageID) throws InvalidNameException;

}