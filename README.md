
# STUDENT MANAGEMENT

**Prerequisites
**
Ensure that Java 17 is installed on your system. You can check by running:

java -version

If Java 17 is not installed, download and install it from Oracle JDK or use OpenJDK.

Ensure that Maven is installed and configured. Verify by running:

mvn -version

If not installed, download it from Apache Maven and set up the environment variables accordingly.

**Installation Steps
**
Unzip the File

Extract the provided archive file to a suitable directory.

**Navigate to the Project Directory
**
Open a terminal and move to the Student Management System folder:

cd /path/to/student-management

**Build the Project
**
Run the following command to clean and build the project:

mvn clean install

This will download dependencies and compile the project.

**Run the Application
**
Execute the following command to start the application:

mvn exec:java -Dexec.mainClass="com.student.Main"

Ensure that the Main class exists at the specified package path.

