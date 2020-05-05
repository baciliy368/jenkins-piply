def call(String credentials, String  branch, String url) {
    git branch: branch, credentialsId: credentials, url: url
    //git branch: branch, changelog: false, credentialsId: credentials, poll: false, url: url
}