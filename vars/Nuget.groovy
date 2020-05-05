def call(String pathToNuGet, String command) {
    bat String.format('%s %s', pathToNuGet, command)
}