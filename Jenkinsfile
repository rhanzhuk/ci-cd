pipeline {
    agent{
        docker { image 'maven'}
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean install'
                sh 'docker build -t hanzhukruslan/status-server:$JOB_NUMBER .'
            }
        }
        stage ('Push on repo'){
            steps {
                sh 'docker push hanzhukruslan/status-server:$JOB_NUMBER'
            }
        }
    }
}