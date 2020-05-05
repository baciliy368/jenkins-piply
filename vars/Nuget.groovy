def call(String pathToNuget, String command) {
    bat String.format('%s %s', pathToNuget, command)
}