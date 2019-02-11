node {
    def server = Artifactory.server 'ART'
    def rtMaven = Artifactory.newMavenBuild()
    def buildInfo

    stage ('Clone') {
         git url: 'https://github.com/rKS2827/testMavenBuild'
    }

    stage ('Artifactory configuration') {
        rtMaven.tool = M3 // Tool name from Jenkins configuration
        rtMaven.deployer releaseRepo: 'libs-release-local', snapshotRepo: 'libs-snapshot-local', server: server
        rtMaven.resolver releaseRepo: 'libs-release', snapshotRepo: 'libs-snapshot', server: server
        buildInfo = Artifactory.newBuildInfo()
        buildInfo.env.capture=true
    }

    stage ('Exec Maven') {
         rtMaven.run pom: 'pom.xml', goals: 'clean install', buildInfo: buildInfo
    }

    stage ('Publish build info') {
        server.publishBuildInfo buildInfo
    }
}
