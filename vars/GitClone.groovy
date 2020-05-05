def call(String  branch, String credentials, String url) {
    cleanWs()
    git branch: branch, credentialsId: credentials, url: url
}