pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo "parentJob"
            }
        }
       /** stage('triggerChildJob') {
            steps {
                build job: "childjob", wait: true
            }
        } **/
        stage('Stage Name') {
           steps {
                build(job: 'pipeline.name', parameters: [string(name: 'DEPLOY_TO', value: "test")])
           }
        }
    }
}
