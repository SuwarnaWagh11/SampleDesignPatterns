package org.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.qa.builderpattern.mmskwds.SBSBKeywords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MMSKeywordTest {

    String downloadedFileName = "C:\\MMS\\Enrollment_EAM_20251231_111222.txt";
    SBSBKeywords actualSbsbKeywords = null;
    @Test
    public void generateSBSBKeywordFromEAMLegacy(){

        SBSBKeywords sbsbKeywords = SBSBKeywords.builder()
                .addSBSBId("11111")
                .addSBSBFirstName("XYZ")
                .addSBSBLastName("ABC")
                .addSBSBDOB("1945-04-30")
                .build();
        System.out.println(sbsbKeywords);
    }

    @Test
    public void compareSBSBKeyword() throws FileNotFoundException {

        SBSBKeywords expectedSbsbKeywords = SBSBKeywords.builder()
                .addSBSBId("111111")
                .addSBSBFirstName("XYZ")
                .addSBSBLastName("ABC")
                .addSBSBDOB("1945-04-30")
                .build();
        actualSbsbKeywords = buildActualSBSB(downloadedFileName);
        Assertions.assertEquals(expectedSbsbKeywords, actualSbsbKeywords);
    }

    public SBSBKeywords buildActualSBSB(String filename) throws FileNotFoundException {
        SBSBKeywords aSbsbKeywords = null;
        File inFile = new File(filename);
        Scanner inputFile = new Scanner(inFile);
        String str;
        String[] kwd;
        while (inputFile.hasNext()) {
            str = inputFile.nextLine();         // read a line of text from the file
            String result = str.replaceAll("\"", "");
            kwd = result.split(",");            // split the line using commas as delimiter
            String[] val0 = kwd[0].split("=");
            String[] val1 = kwd[1].split("=");
            String[] val2 = kwd[2].split("=");
            String[] val3 = kwd[3].split("=");
            aSbsbKeywords = SBSBKeywords.builder()
                    .addSBSBId(val0[1])
                    .addSBSBFirstName(val1[1])
                    .addSBSBLastName(val2[1])
                    .addSBSBDOB(val3[1])
                    .build();
        }
        return aSbsbKeywords;
    }
}
