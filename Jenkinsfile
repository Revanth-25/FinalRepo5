pipeline{
     agent any 
           stages {
                stage('Build'){
                 steps       {
                        bat "rmdir   /s  /q  AssessmentWebApp"
                        bat "git clone https://github.com/Revanth-25/AssessmentWebApp.git"
                        //bat "mvn clean -f AssessmentWebApp"
                         bat"mvn install"
                        echo 'Build Done'
                             }
                         }
                stage('Push image') {
    withCredentials([usernamePassword( credentialsId: 'docker-hub-credentials', usernameVariable: 'revanth2', passwordVariable: 'Devops@1st')]) {
        def registry_url = "registry.hub.docker.com/"
        bat "docker login -u $USER -p $PASSWORD ${registry_url}"
        docker.withRegistry("http://${registry_url}", "docker-hub-credentials") {
            // Push your image now
            bat "docker push revanth2/webapp:build"
        }
    }
}
 stage('Deploy'){
                 steps{
                        bat "mvn deploy -f AssessmentWebApp"
                        echo 'Deploy done'
                       }
                 }
          }
}
