def buildResult     = [firstName:'John', lastName:'Doe', fullName:'John Doe']
def logsList        = ['precise', 'trusty']
def DEPLOY_TO = "Test121"
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
        }**/
		 stage('Stage Name1') {
           steps {
                build(job: 'childjob',  parameters: [DEPLOY_TO]))
           }
        } 
       /** stage('Stage Name') {
           steps {
		       // testStages["gfxip_${ip}"] = {testStage(nodeName, gfxIp, bdcServer, logsList, buildResult)}
                build(job: 'childjob', parameters: [string(name: 'nodeName', value: "chaitanya-rakesh"), 
				                                    string(name: 'gfxIp', value: "chaitanya-rakesh1"), 
													string(name: 'artifactoryServer', value: "arifactory11111"), 
													list(name: 'logsList', value: 'logList'), 
													map(name: 'buildResult', value: 'buildResult')])
           }
        }**/
		
    }
}
