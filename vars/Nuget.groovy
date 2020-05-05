def call(String pathToNuget, String command) {
    dir("\\PaintTests") {
        dir(pathToNuget) {
            bat String.format('nuget.exe %s', command)
        }
    }
}