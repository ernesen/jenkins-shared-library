def call(String project, String hubUser, String imageTag, String registryCredential) {
    sh "docker image build -t ${hubUser}/${project} ."
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:${imageTag}"
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:latest"
    withCredentials([usernamePassword(
            credentialsId: "${registryCredential}",
            usernameVariable: "USER",
            passwordVariable: "PASS" 
    )]) {
        sh "docker login --username '$USER' --password-stdin '$PASS'"
    }
    sh "docker image push ${hubUser}/${project}:${imageTag}"
    sh "docker image push ${hubUser}/${project}:latest"
}
