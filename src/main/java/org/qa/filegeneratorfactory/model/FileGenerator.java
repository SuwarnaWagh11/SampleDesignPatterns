package org.qa.filegeneratorfactory.model;

import java.util.List;

public interface FileGenerator {

    String generateFileName();
    List<String> generateRequiredValues();
}
