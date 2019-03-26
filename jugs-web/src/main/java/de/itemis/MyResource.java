package de.itemis;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("message")
public class MyResource {
	
	@Inject
	JMSContext jmsctx;
	
	@Resource(lookup = "java:/jugs/jugsqueue")
	Queue queue;

	@GET
	public Response getMessage(@QueryParam("msg") @DefaultValue("world") String message) {
		String greeting = "Hello " + message + "!";
		TextMessage msg = jmsctx.createTextMessage(greeting);
		jmsctx.createProducer().send(queue, msg);

		return Response.ok(greeting).build();
	}
}
