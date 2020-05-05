def call(String projectFolderName, String pathToNuget, String command) {
    dir(String.format("\\%s", projectFolderName)) {
        bat String.format('%s %s',pathToNuget, command)
    }
}