def call(String credentials, String  branch, String url) {
    git poll: false, changelog: false, url: url, credentialsId: credentials, branch: branch
}