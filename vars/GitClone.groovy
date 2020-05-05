def call(String  branch, String credentials, String url) {
    git branch: branch, credentialsId: credentials, url: url
}