package edu.nyu.cs9053.homework3;
import edu.nyu.cs9053.homework3.metadata.*;
/**
 * User: blangel
 * Date: 8/23/14
 * Time: 11:45 AM
 */
public class FixMe {

    private final String name;

    public final String metadata;

    public FixMe(String name) {
        this.name = name;
        metadata = "";
    }

    public FixMe(String name, String metadata) {
        this.name = name;
        this.metadata = new Processor(true).processMetadata(metadata);
    }

    public FixMe changeName(String name) {
        return new FixMe(name);
    }

    public FixMe changeName(String firstName, String lastName) {
        return new FixMe(changeNameTo(firstName, lastName), metadata);
    }

    public String changeNameTo(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }

    public String getName() {
        return name;
    }

}
