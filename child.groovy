pipeline {
    agent any
    stages {
       /** stage('2nd job stage1') {
            steps {
                echo "child 11111111 ${params.DEPLOY_TO} and ${artifactoryServer} and ${logsList} and ${buildResult}"
            }
        }**/
        stage('2nd job stage 2') {
            steps {
                echo "child 2 ${params.DEPLOY_TO}"
            }
        }
    }
}
