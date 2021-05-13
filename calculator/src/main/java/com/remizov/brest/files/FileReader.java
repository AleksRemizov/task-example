package com.remizov.brest.files;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public interface FileReader {
    Map<Integer, BigDecimal> readDate (String filePath) throws IOException;

}
