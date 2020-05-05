def call(String pathToNuget, String command) {
    dir("\\PaintTests") {

            bat "C:\\nuget.exe restore"
            //bat String.format('nuget.exe %s', command)

    }
}