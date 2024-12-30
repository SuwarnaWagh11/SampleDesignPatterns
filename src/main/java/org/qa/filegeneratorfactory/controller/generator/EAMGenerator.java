package org.qa.filegeneratorfactory.controller.generator;

import org.qa.filegeneratorfactory.model.FileGenerator;

import java.util.Arrays;
import java.util.List;

public class EAMGenerator implements FileGenerator {
    /**
     * @return
     */
    @Override
    public String generateFileName() {
        return "Legacy_Mem_20241230.txt";
    }

    /**
     * @return
     */
    @Override
    public List<String> generateRequiredValues() {
        return Arrays.asList("1234566","Mr.","Randhir","Giri");
    }
}
