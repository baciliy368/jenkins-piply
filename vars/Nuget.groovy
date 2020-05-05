def call(String command) {
    def nugetResource = getClass().getResource("\\resources\\nuget.exe")
        bat String.format('%s %s', nugetResource, command)

}