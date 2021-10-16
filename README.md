# Converted into maven project 
* File Structure
  -String_Calculator
    -src : Folder to maintain java source files
	-main : String Calculator 
	-test : JUnit test cases 
    -target: Folder to maintain java class files
    -pom.xml

  -README.txt

# What it does.
  Calcuates sum for input string.
   e.g. input   --> "1,2,3"
        output  -->  6
  Default delimiters are ',' and '\n'.
  Custom delimiters can be added as '//[newDelimiter][newDelimiter]...\n[numbers...with custom delimiters]'
   e.g. input   --> "//[%]\n1%2%3"
        output  --> 6
         
# Build using
  *Java(1.8)
  *JUnit(4.13.2)
  *STS(eclipse)

