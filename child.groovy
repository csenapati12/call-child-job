pipeline {
    agent any
    stages {
        stage('2nd job stage1') {
            steps {
                echo "child 1"
            }
        }
        stage('2nd job stage 2') {
            steps {
                echo "child 2"
            }
        }
    }
}