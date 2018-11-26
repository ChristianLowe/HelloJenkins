pipeline {
  agent any
  
  tools {
    maven 'M3'
  }
  
  stages {
    stage('Install') {
      sh "mvn -U clean test cobertura:cobertura -Dcobertura.report.format=xml"
    }
    post {
      always {
        junit '**/target/*-reports/TEST-*.xml'
        step([$class: 'CoberturaPublisher', coberturaReportFile: 'target/site/cobertura/coverage.xml'])
      }
    }
  }
}
