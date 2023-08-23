pipeline{
     agent any 
           stages {
                stage('Build'){
                 steps       {
                        bat "rmdir   /s  /q  AssessmentWebApp"
                        bat "git clone https://github.com/Revanth-25/AssessmentWebApp.git"
                        bat "mvn clean -f AssessmentWebApp"
                        bat  "mvn build -f AssessmentWebApp"
                        echo 'Build App'
                             }
                         }
 stage('Test'){
                 steps{
                        bat "mvn test -f AssessmentWebApp"
                        echo 'Test App'
                       }
              }
 stage('Deploy'){
                 steps{
                        bat "mvn deploy -f AssessmentWebApp"
                        echo 'Deploy App'
                       }
                 }
          }
}
