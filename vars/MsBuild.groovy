def call(String projectFolderName, String pathToMsBuild) {
    dir("${workspace}") {
        bat String.format('%s %s',pathToMsBuild, getPathToSolution(projectFolderName))
    }
}

def getPathToSolution(String projectName) {
    return String.format("%s\\%s.sln", projectName, projectName)
}