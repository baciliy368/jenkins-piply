def call(String projectFolderName, String pathToNunitConsole, String resultFile, String resultFormat) {
    bat String.format('%s %s %s',pathToNunitConsole, getDllFile(projectFolderName),
            getResultParameter(projectFolderName, resultFile, resultFormat))
}

def getDllFile(String projectName) {
    return String.format("${workspace}\\\\${env.JOB_NAME}\\%s\\bin\\Debug\\%s.dll", projectName, projectName)
}

def getResultParameter(String projectName, String resultFile, String format) {
    return String.format("--result=${workspace}\\${env.JOB_NAME}\\%s\\bin\\Debug\\%s;format=%s", projectName, resultFile, format)
}