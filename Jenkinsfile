pipeline { 
    environment { 
        registry = "omjai1010/docker-scan" 
        registryCredential = 'DockerHub' 
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
        stage('Scan docker image')
          {
                steps{
                      script{
                                   sh '''
                                DOCKER_GATEWAY=$(docker network inspect bridge --format "{{range .IPAM.Config}}{{.Gateway}}{{end}}")
                                wget -qO clair-scanner https://github.com/arminc/clair-scanner/releases/download/v8/clair-scanner_linux_amd64 && chmod +x clair-scanner
                               ./clair-scanner --ip="$DOCKER_GATEWAY" dockerImage ||exit 0
                               '''
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
         stage('Run Image') { 
            steps { 
                script { 
                      sh '''
                    docker run -d dockerImage  node:latest
                    '''
                    }
                } 
            }
//         stage('Cleaning up') { 
//             steps { 
//                 sh "docker rmi $registry:$BUILD_NUMBER" 
//             }
//         } 
    }
}

