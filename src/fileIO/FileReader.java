package fileIO;

import java.nio.file.Path;
import java.util.List;

public class FileReader {

    //Properties
    //goal: read in a file and parse through it

    private String directoryName; //i.e. 'data', 'src/filIO'
    private String fileName; //i.e. 'day18.txt, 'jolts.txt,
    private String logFileName; //will hold all the logging info
    private Path directoryPath; //Path representation of the parent directory for our files
    private Path filePath; //Path representation for the actual file itself
    private Path logFilePath; //Path representation of the log file
    private List<String> fileLines; //Holding spot for the content inside of the data file itself
    private List<String> logFileLines; //Holding spot for the content inside of the log file

    //Constructor
    public FileReader(String directoryName, String fileName, String logFileName){

    }


    //Getters and Setters

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Path getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(Path directoryPath) {
        this.directoryPath = directoryPath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public Path getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(Path logFilePath) {
        this.logFilePath = logFilePath;
    }

    public List<String> getFileLines() {
        return fileLines;
    }

    public void setFileLines(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    public List<String> getLogFileLines() {
        return logFileLines;
    }

    public void setLogFileLines(List<String> logFileLines) {
        this.logFileLines = logFileLines;
    }
}
