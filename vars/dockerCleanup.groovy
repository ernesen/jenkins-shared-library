def call(String project, String hubUser, String imageTag) {
    sh "docker rmi ${hubUser}/${project}:${imageTag}"
    sh "docker rmi ${hubUser}/${project}:latest"
}
