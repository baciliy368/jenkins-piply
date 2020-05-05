def call(String command) {
    dir ('%WORKSPACE%\\${env.JOB_NAME}@libs\\custom-pip\\resources') {
        bat String.format('nuget.exe %s', command)
    }
}