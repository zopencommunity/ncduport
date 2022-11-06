node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/ncduport.git'), string(name: 'PORT_DESCRIPTION', value: 'Ncdu is a disk usage analyzer with an ncurses interface' )]
  }
}
