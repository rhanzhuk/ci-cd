pipeline {
    agent{
        docker {
            image 'maven'
            args '-v /root/.m2:/root/.m2'
            reuseNode true
            }
    }
    stages {
        stage('Docker') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage ('Build image'){
            steps {
                sh 'docker build -t hanzhukruslan/status-server:$BUILD_NUMBER .'
            }
        }
        stage ('Push on repo'){
            steps {
                sh 'docker push hanzhukruslan/status-server:$BUILD_NUMBER'
            }
        }
    }
}