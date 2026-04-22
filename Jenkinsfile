pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
        jdk   'JDK-17'
    }

    environment {
        APP_NAME = 'my-java-app'
        VERSION  = '1.0-SNAPSHOT'
    }

    stages {

        stage('Checkout') {
            steps {
                echo "Cloning repository..."
                checkout scm
            }
        }

        stage('Install Dependencies') {
            steps {
                echo "Downloading Maven dependencies..."
                sh 'mvn dependency:resolve'
            }
        }

        stage('Build') {
            steps {
                echo "Compiling Java source code..."
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo "Running JUnit 5 tests..."
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo "Packaging into JAR..."
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "✅ Pipeline SUCCESS — ${APP_NAME} v${VERSION} built and tested!"
        }
        failure {
            echo "❌ Pipeline FAILED — Check the logs above!"
        }
        always {
            echo "Cleaning workspace..."
            cleanWs()
        }
    }
}
