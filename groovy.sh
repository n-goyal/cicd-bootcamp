node{
    stage('git checkout'){
        git credentialsId: 'git-creds', url: 'https://github.com/n-goyal/cicd-bootcamp'
    }
    
    stage('mvn clean'){
        sh 'mvn clean'
    }
    
    stage('mvn build'){
        try{
            def mvnHome = tool name: 'maven3', type: 'maven'
            def mvnCMD = "${mvnHome}/bin/mvn"
            sh "${mvnCMD} package"
        }
        catch(Exception err){
            currentBuild.result='FAILURE'
        }
        finally{
            emailext (
                subject: "Job '${env.JOB_NAME} ${env.BUILD_NUMBER}'",
                body: """<p>Check console output at <a href="${env.BUILD_URL}">${env.JOB_NAME}</a></p>""",
                to: "nk.goyal@tcs.com"
            )
        }
    }
    
    stage('Docker Build Image'){
        sh "docker build -t nitingo/cicd-demo:v2.0 ."
    }
    
    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'docker-hub-creds', variable: 'dockerHubCred')]) {
        sh "docker login -u nitingo -p ${dockerHubCred}"
        }
        sh "docker push nitingo/cicd-demo:v2.0"
    }
    
    stage('pull docker image'){
        sh 'docker pull nitingo/cicd-demo:v2.0'
    } 
    
    stage('Run container'){
        sh 'docker run -p 8888:8080 --name spring-container -d nitingo/cicd-demo:v2.0'
        sh 'sleep 30'
        sh 'docker stop spring-container'
        sh 'docker rm spring-container'
    }
}

