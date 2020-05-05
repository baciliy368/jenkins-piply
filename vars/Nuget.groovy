def call(String pathToNuget, String command) {
    dir("\\PaintTests") {
        bat String.format('%s %s',pathToNuget, command)
    }
}