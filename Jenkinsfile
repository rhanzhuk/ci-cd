pipeline {
    agent{
        docker { image 'maven'}
    }
    stages {
        stage('Docker') {
            steps {
                sh 'mvn clean install'
                reuseNode true
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