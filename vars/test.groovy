node {
    stage('Example1') {
        print 'Hello World'
    }
    stage('Example2') {
        if (env.BRANCH_NAME == 'master') {
            echo 'I only execute on the master branch'
        } else {
            echo 'I execute elsewhere'
        }
    }
}