package intro.landoflogic;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileNaming {
  String[] fileNaming(String[] names) {
    if (names == null || names.length == 0)
      return new String[0];

    String[] newDocNames = new String[names.length];
    newDocNames[0] = names[0];

    Map<String, Integer> documentNameCountMap = new HashMap<>();
    documentNameCountMap.put(names[0], 1);

    for (int i = 1; i < names.length; i++) {
      final FileNamingParameter parameter = new FileNamingParameter();
      parameter.fileName = names[i];
      parameter.fileNameCounter = 0;
      parameter.newFileName = names[i];

      final FileNamingParameter resultParameter = reduceFilenameToNewName(parameter, documentNameCountMap);
      if (!resultParameter.newFileName.equals(names[i])) {
        documentNameCountMap.put(resultParameter.fileName, resultParameter.fileNameCounter);
      }

      newDocNames[i] = resultParameter.newFileName;
      documentNameCountMap.put(newDocNames[i], 1);
    }

    return newDocNames;
  }

  FileNamingParameter reduceFilenameToNewName(FileNamingParameter fileNameParameter, Map<String, Integer> fileNameMapper) {
    if (!fileNameMapper.containsKey(fileNameParameter.newFileName)){
      return fileNameParameter;
    }

    //Construct new name
    fileNameParameter.newFileName = fileNameParameter.fileName + String.format("(%d)", ++fileNameParameter.fileNameCounter);

    return reduceFilenameToNewName(fileNameParameter, fileNameMapper);
  }

  class FileNamingParameter {
    String fileName;
    Integer fileNameCounter;
    String newFileName;
  }
}
