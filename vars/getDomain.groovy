def call(repositoryUrl){
    tmp = repositoryUrl.split('//')
    tmp = tmp[1].split('/')
    return tmp[1]
}
