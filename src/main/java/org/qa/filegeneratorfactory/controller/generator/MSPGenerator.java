package org.qa.filegeneratorfactory.controller.generator;

import org.qa.filegeneratorfactory.model.FileGenerator;

import java.util.Arrays;
import java.util.List;

public class MSPGenerator implements FileGenerator {
    /**
     * @return
     */
    @Override
    public String generateFileName() {
        return "MSP.MARX.241230.160000";
    }

    /**
     * @return
     */
    @Override
    public List<String> generateRequiredValues() {
        return Arrays.asList("1234567  Mrs.SuwarnaWagh","  ", "EPAM", "");
    }
}
