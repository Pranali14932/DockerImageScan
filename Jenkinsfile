node {
   stage("docker_scan"){
      sh '''
      
        DOCKER_GATEWAY=$(docker network inspect bridge --format "{{range .IPAM.Config}}{{.Gateway}}{{end}}")
        
        ./clair-scanner --ip="$DOCKER_GATEWAY" my-java-app:v1 || exit 0
      '''
 docker.withRegistry('https://registry.example.com', 'credentials-id') {

        def customImage = docker.build("my-image:${env.BUILD_ID}")

        /* Push the container to the custom Registry */
        customImage.push()
 }
    }
}
