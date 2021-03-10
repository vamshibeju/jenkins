pipeline{
agent any 
stages{
stage('teststage'){
  steps{
script{
echo  "this is used for testing"
}
  }
}
stage('secondstage'){
  when {
    expression {
        (env.BRANCH_NAME).startswith("develop")
    }
  }
  steps{
script{
echo "this is second for testing"
}
  }
}
}
}
