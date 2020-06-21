def call(String deploy_file){
    def KUBECONFIG = "$JENKINS_HOME/config"
    sh "export ${KUBECONFIG}" 
    sh "kubectl apply -f  ${deploy_file}"    
}
