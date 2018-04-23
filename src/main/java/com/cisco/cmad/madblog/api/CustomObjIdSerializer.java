package com.cisco.cmad.madblog.api;

import org.bson.types.ObjectId;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;

public class CustomObjIdSerializer extends JsonSerializer<ObjectId> {

	@Override
	public void serialize(ObjectId value, JsonGenerator jsonGenerator, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		if (value == null) {
			jsonGenerator.writeNull();
		} else {
			jsonGenerator.writeString(value.toHexString());
		}
	}
}
