def call(String targetPath = '.') {
    sh "trivy fs ${targetPath}"
}