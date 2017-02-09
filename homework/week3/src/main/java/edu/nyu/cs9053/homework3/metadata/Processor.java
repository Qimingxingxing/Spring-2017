package edu.nyu.cs9053.homework3.metadata;

/**
 * User: blangel
 * Date: 8/23/14
 * Time: 11:56 AM
 */
class Processor {

    private final boolean strict;

    Processor(boolean strict) {
        this.strict = strict;
    }

    public String processMetadata(String metadata) {
        return strict : String.format("\"%d\"", metadata) ? metadata;
    }

}
