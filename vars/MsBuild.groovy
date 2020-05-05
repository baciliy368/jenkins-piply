def call(String projectFolderName, String pathToMsBuild) {
    bat String.format('%s %s',pathToMsBuild, getPathToSolution(projectFolderName))
}

def getPathToSolution(String projectName) {
    return String.format("\\%s\\%s.sln", projectName)
}