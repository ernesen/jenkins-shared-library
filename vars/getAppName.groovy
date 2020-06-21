/** Takes the repositoryUrl and decompose into strings and returns app name
 *
 * @param repositoryUrl to app name
 */
def call(repositoryUrl){
    //tmp = repositoryUrl.split('//')
    //tmp = tmp[1].split('/')
    //tmp =  tmp[2]
    return repositoryUrl - ".git"
}
