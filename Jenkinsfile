// node {
//    stage("docker_scan"){
//       sh '''
      
//         DOCKER_GATEWAY=$(docker network inspect bridge --format "{{range .IPAM.Config}}{{.Gateway}}{{end}}")
//          wget -qO clair-scanner https://github.com/arminc/clair-scanner/releases/download/v8/clair-scanner_linux_amd64 && chmod +x clair-scanner
//         ./clair-scanner --ip="$DOCKER_GATEWAY" my-java-app:v1 ||exit 0
//       '''
 
//     }
// }


pipeline { 

    environment { 

        registry = "omjai1010/docker-scan" 

        registryCredential = 'dockerHub' 
        dockerImage = '' 

    }

    agent any 

    stages { 


        stage('Building our image') { 

            steps { 

                script { 

                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 

                }

            } 

        }

        stage('Deploy our image') { 

            steps { 

                script { 

                    docker.withRegistry( '', registryCredential ) { 

                        dockerImage.push() 

                    }

                } 

            }

        } 

        stage('Cleaning up') { 

            steps { 

                sh "docker rmi $registry:$BUILD_NUMBER" 

            }

        } 

    }
}
