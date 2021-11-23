//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 9+
//DEPS com.github.nbbrd.sdmx-dl:sdmx-dl-cli:3.0.0-beta.5

public class sdmx_dl {
    public static void main(String... args) throws Exception {
        sdmxdl.cli.MainCommand.main(args);
    }
}