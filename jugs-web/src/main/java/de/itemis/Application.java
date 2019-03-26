package de.itemis;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("jugs")
public class Application extends javax.ws.rs.core.Application {
	@Override
    public Map<String, Object> getProperties()
    {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("jersey.config.server.provider.packages", "de.itemis");
        return properties;
    }
}
