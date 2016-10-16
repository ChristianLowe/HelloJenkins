node {
    stage 'Build and Test'
    git url: 'https://github.com/Grognak/HelloJenkins.git'
    def mvnHome = tool 'M3'
    sh "${mvnHome}/bin/mvn -B clean install"
}