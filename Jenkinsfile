pipeline{
     agent any 
           stages {
                stage('Build'){
                 steps       {
                        bat "rmdir   /s  /q  FinalRepo5"
                        bat "https://github.com/Revanth-25/FinalRepo5.git"
                        //bat "mvn clean -f FinalRepo5"
                         bat"mvn install"
                        echo 'Build Done'
                             }
                         }
 stage('Deploy'){
                 steps{
                        bat "mvn deploy -f FinalRepo5"
                        echo 'Deploy done'
                       }
                 }
          }
}
