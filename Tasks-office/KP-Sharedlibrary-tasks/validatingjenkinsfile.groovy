String filepath= "${workspace}/Jenkinsfile"
File  Myfile = new File(filepath)
println Myfile.text
if((Myfile.contains("stage(gitcheckout)")== true)  && (Myfile.contains("stage(sonarqube)")== true)){
	println("stages are present but if the stage is commented it will fail in next validation")
}
else {
	println ("stages are missing hence its getting failed")
	throw Exception("error message")
}


if ((Myfile.contains('''/*stage(gitcheckout)''')==true ) || (Myfile.contains('''//stage(gitcheckout)''')==true )){
	println("stage is commented hence job getting failed")
	throw  Exception("error message")
}
else {
	println "no stages commented"
}
