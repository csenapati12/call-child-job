def buildResult     = [:]
def logsList        = []
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
                build(job: 'childjob', parameters: [string(name: 'nodeName', value: "chaitanya-rakesh"), string(name: 'gfxIp', value: "chaitanya-rakesh1"), string(name: 'artifactoryServer', value: "arifactory11111"), list(name: 'logsList', value: logList), map(name: 'buildResult', value: buildResult)])
           }
        }
    }
}
