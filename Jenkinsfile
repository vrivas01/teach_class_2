pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                echo 'Packaging...'
                sh 'mvn package'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'java -cp target/teach2-app-1.0-SNAPSHOT.jar com.apasoft.ToUpper "${param}"'
            }
        }
    }
}
