def call(String pathToNuGet, String command) {
    dir("${env.WORKSPACE}\\pipe@lib\\resources"){
        sh "pwd"
        bat String.format('nuget.exe %s', command)
    }
   // bat String.format('%s %s', pathToNuGet, command)
}