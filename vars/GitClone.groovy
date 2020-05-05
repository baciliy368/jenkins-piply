def call(credentials, branch, url) {
    checkout( branch: branch, credentialsId: credentials, url: url)
}
