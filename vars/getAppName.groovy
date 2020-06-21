def call(repositoryUrl){
    tmp = repositoryUrl.split('//')
    tmp = tmp[1].split('/')
    tmp =  tmp[2]
    return tmp - ".git"
}
