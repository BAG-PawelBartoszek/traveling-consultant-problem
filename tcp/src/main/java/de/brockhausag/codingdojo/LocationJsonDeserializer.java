package de.brockhausag.codingdojo;

import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Path;
import java.util.List;

public class LocationJsonDeserializer {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Object> deserialize(Path jsonFile) throws IOException {
        return objectMapper.readValue(jsonFile.toFile(), new TypeReference<List<Object>>() {
        });
    }
}
