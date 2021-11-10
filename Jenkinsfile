node {
   stage("docker_scan"){
      sh '''
      
        DOCKER_GATEWAY=$(docker network inspect bridge --format "{{range .IPAM.Config}}{{.Gateway}}{{end}}")
        
        ./clair-scanner --ip="$DOCKER_GATEWAY" my-java-app:v1 || exit 0
      '''
    }
}
