def call(String projectFolderName, String pathToNunitConsole, String resultFile, String resultFormat) {
    bat String.format('%s %s %s',pathToNunitConsole, getDllFile(projectFolderName),
            getResultParameter(projectFolderName, resultFile, resultFormat))
}

def getDllFile(String projectName) {
    return String.format("%s\\%s.dll", getDebugFolderPath(projectName), projectName, projectName)
}

def getResultParameter(String projectName, String resultFile, String format) {
    return String.format("--result=%s\\%s;format=%s",getDebugFolderPath(projectName), resultFile, format)
}

def getDebugFolderPath(String projectName) {
    return String.format("${workspace}\\${env.JOB_NAME}\\%s\\bin\\Debug", projectName)
}