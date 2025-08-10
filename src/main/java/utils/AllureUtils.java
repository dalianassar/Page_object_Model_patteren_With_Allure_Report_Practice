package utils;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class AllureUtils {
// clean allure result folder
public  static void cleanAllureResults(){
    FileUtils.deleteQuietly(new File("Test-output/allure-results"));
}



}