def call(String credentials, String  branch, String url) {
    git branch: branch, credentialsId: '6a6c48eb-48f3-4481-a049-e6c170f076aa', url: url
    //git branch: branch, changelog: false, credentialsId: credentials, poll: false, url: url
}