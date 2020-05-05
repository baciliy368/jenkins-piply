def call(String command) {
    dir ('resources') {
        bat String.format('nuget.exe %s', command)
    }
}