//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 8+
//DEPS com.github.nbbrd.sandbox:hello-nbbrd:2.0.0

public class hello_nbbrd {
    public static void main(String... args) throws Exception {
        nbbrd.sandbox.cli.MainCommand.main(args);
    }
}