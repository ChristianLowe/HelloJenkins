node {
    stage 'Build and Test'
    sh "ls -a"
    def mvnHome = tool 'M3'
    sh "${mvnHome}/bin/mvn -B clean install"
}