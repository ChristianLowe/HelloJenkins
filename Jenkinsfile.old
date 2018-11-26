node {
    stage 'Git'
    git url: 'https://github.com/Grognak/HelloJenkins.git'

    stage 'Build and Test'
    withMaven(
        maven: 'M3',
        mavenSettingsConfig: 'my-maven-settings',
        mavenLocalRepo: '.repository') {
        sh "mvn clean install"
    }
}
