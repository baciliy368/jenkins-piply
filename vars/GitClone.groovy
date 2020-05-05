def call(String credentials, String  branch, String url) {
    git branch: 'paint_sharp', credentialsId: '6a6c48eb-48f3-4481-a049-e6c170f076aa', url: 'http://qa-gitlab.itransition.corp/self-education/d2.orlov'
    //git branch: branch, changelog: false, credentialsId: credentials, poll: false, url: url
}