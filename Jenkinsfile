pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M2_HOME"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/erc83/test_junit_jenkins.git'

                // Run Maven on a Unix agent.
                //bat "mvn clean package -DskipTests"
                bat "mvn clean verify"
                

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        
        stage('UNIT TESTS'){
            steps{
                echo 'Ejecutando Tests'
                bat "mvn test"
            }
        }
        
        stage('Post-build-JaCoCo') {
            steps {
                jacoco execPattern: '**/target/jacoco.exec', classPattern: '**/target/classes', sourcePattern: '**/src/main/java', exclusionPattern: '**/src/test*', changeBuildStatus: true
            }
        }
        
        
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
