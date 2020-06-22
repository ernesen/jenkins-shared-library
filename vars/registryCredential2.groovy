def call (registryCredential) {
    withCredentials([usernamePassword(
            credentialsId: "${registryCredential}",
            usernameVariable: "USER",
            passwordVariable: "PASS" 
    )]) {
        //echo "docker login --username '$USER' --password-stdin '$PASS'"
        echo "docker login --username '$USER' --password '$PASS'"
    }
}
