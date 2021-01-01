def filepath= findFiles(glob: '**/*')

for (i=0;i<filepath.size();i++){
if("$filepath[i].name".contains("Jenkinsfile")){
def Jenkinsfile = readFile file:"${workspace}/Jenkinsfile"
  println "$filepath[i]"
  println "Jenkinsfile found"
if (Jenkinsfile.contains("/*validate")) {
    println "validated"
  
}
  if (Jenkinsfile.contains("//validate")) {
    println "validated"
  
}
 
}

}
