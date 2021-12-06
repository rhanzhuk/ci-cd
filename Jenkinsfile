pipeline{
    agent any
    stages{
        stage ('Build jar') {
            agent {
                docker {
                    image 'maven'
                    args '-v /var/lib/jenkins/.m2:/root/.m2'
                    reuseNode true
                }
            }
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