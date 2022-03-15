def newgit(repo)
{
  git "${repo}"
}

def NewMaven()
{
  sh 'mvn package'
}
def newDeployment(ip,appname)
{
   deploy adapters: [tomcat9(credentialsId: 'ad7320e5-afcc-4292-ac30-011905d49893', path: '', url: '${ip}')], contextPath: '${appname}', war: '**/*.war'
}
