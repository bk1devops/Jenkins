pipeline {
    agent any

    stages {
        stage('Source') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main',url: 'https://github.com/bk1devops/Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                dir('demo0905') {
                    // Run nvm package command
                   bat '"C:\\Program Files\\maven\\apache-maven-3.9.6\\bin\\mvn" clean package'
			 //bat '"C:\\Program Files\\Marven\\bin\\mvn" clean package'
                }
            }
        }
        stage('Publish'){
             steps {
               dir('demo0905') {
                   //bat 'java -jar -Dserver.port=8083 target/springcoreddemo-0.0.1-SNAPSHOT.jar'
			bat 'start java -jar -Dserver.port=8083 target/springcoreddemo-0.0.1-SNAPSHOT.jar'
               }
            }
        }
    }
}
