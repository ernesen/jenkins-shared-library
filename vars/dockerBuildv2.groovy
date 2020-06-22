def call(String project, String hubUser, String imageTag, String USER, String PASS ) {
    sh "docker image build -t ${hubUser}/${project} ."
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:${imageTag}"
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:latest"
    sh "docker login --username '$USER' --password '$PASS'"
    sh "docker image push ${hubUser}/${project}:${imageTag}"
    sh "docker image push ${hubUser}/${project}:latest"
}
