package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
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
    public FileReader(String directoryName, String fileName, String logFileName) throws IOException {
        this.directoryName = directoryName;
        this.fileName = fileName;
        this.logFileName = logFileName;
        //Instantiating Path values
        this.directoryPath = Paths.get(directoryName); //Paths.get("data"), creates a path to a directory
        this.filePath = Paths.get(directoryName, fileName); //creates a path to a file, via directory-->file
        this.logFilePath = Paths.get(directoryName, logFileName);

        //Check if files exist, and create them if they don't exist
        //Log File
        if(Files.notExists(this.logFilePath)){
            try {
                Files.createFile(this.logFilePath);
            }catch (IOException e) {
                //store this exception message in the log file
                //if there is an issue creating the log file, let's crash everything and throw an exception
                throw new IOException("Unable to create the logfile (" + this.logFileName + ")!");
            }
        }

        //Directory for data file ("data" or "src/fileIO")  (does it exist?, if not, let's create it)
        if(Files.notExists(this.directoryPath)){
            try{
                Files.createDirectories(this.directoryPath); //will also set up any missing parent folders, as opposed to just one directory
            }catch(IOException e){
                //Add this error message to the log
                ///Files.write(Path filePath, List<String> message(s), appendOption)
                //Could also initialize a string list instead of useing arrays.aslist???
                Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND); //APPEND is a constant; will append to the end of the log file instead of replacing
                throw new IOException("Unable to create the data directory (" + this.directoryName + ")!");
            }
        }

        //Data file ("day18.txt")
        if(Files.notExists(this.filePath)){
            //if we've made it into the IF statements, that means the file does NOT exist, so let's create it
            try{
                Files.createFile(this.filePath);
            }catch(IOException e){
                //Files.write prefers list!!
                Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);
                throw new IOException("Unable to create the data file (" + this.fileName + ")!");
            }
        }



        System.out.println(filePath); //display the file path for the passed in arguments
        this.fileLines = Files.readAllLines(this.filePath); //gives me every line in (i.e. "day18.txt" as a String, inside of a List<String>
    }



    //PSVM (you can think of this as being 20 files away from this file - it is STATIC
    public static void main(String[] args) throws IOException {
        //instantiate a file reader object, see if it works!

        FileReader day18Reader = new FileReader("data", "day18.txt", "day18.log");
        day18Reader.writeToLog("Successfully read the " + day18Reader.getFileName() + " file!");

        FileReader joltsReader = new FileReader("src/fileIO", "jolts.txt", "jolts.log");
        joltsReader.writeToLog("Successfully read the " + joltsReader.getFileName() + " file!");

        System.out.println("Day 18 File, here's the first line:");
        System.out.println(day18Reader.getFileLines().get(0));

        System.out.println("Jolts File, here's the first line:");
        System.out.println(joltsReader.getFileLines().get(0));

    }


    //Custom Method - want to be able to easily write a message to the log, without some enormous nested function calling nonsense
    public void writeToLog(String message) throws IOException {
        try{
            //write the string "message" to the log file of THIS INSTANCE of a FileReader object
            Files.write(this.logFilePath, Arrays.asList(message), StandardOpenOption.APPEND);
        }catch(IOException e){
            Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);
            throw new IOException("Unable to write custom message to log file");
        }
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
