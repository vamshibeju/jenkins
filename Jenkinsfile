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
    branch 'develop'
  }
  steps{
script{
echo "this is second for testing"
}
  }
}
}
}
