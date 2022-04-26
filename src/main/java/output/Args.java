package output;

import com.beust.jcommander.Parameter;

public class Args {
    @Parameter(names = { "-f", "-file" }, description = "Filename")
    private String filename;

    @Parameter(names = { "-h", "-help" }, description = "Help", help = true)
    private boolean help = false;

    public String getFilename() { return this.filename; }

    public Boolean getHelp() { return this.help; }
}
