pipeline{
     agent any 
           stages {
                stage('Build'){
                 steps       {
                        //bat "rmdir   /s  /q  AssessmentWebApp"
                        bat "git clone https://github.com/Revanth-25/AssessmentWebApp.git"
                        bat "mvn clean -f AssessmentWebApp"
                         bat"mvn install"
                        echo 'Build Done'
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
