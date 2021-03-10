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
  steps{
script{
  echo "${env.BRANCH_NAME}"
echo "this is second for testing"
}
  }
}
}
}
