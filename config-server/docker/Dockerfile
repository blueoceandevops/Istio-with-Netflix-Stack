# Use an official ubuntu runtime as a parent image
FROM ubuntu:latest

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
ADD . /app


# Define environment variable
ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"
ENV JAVA_HOME /Softwares/jdk8


# Install any needed packages specified 
RUN mkdir /app/config-files
RUN chmod -R 777 /app/config-files
RUN echo y | apt-get update
RUN echo y | apt-get install maven
RUN chmod -R 777 /app/*
RUN chmod -R 777 /usr/share/maven/*
RUN mkdir /Softwares/
RUN chmod -R 777 /Softwares/
RUN cp -rf /app/jdk8   /Softwares/
RUN cp -rf maven.sh /Softwares/
RUN java -version

RUN cd /app/config-server && mvn clean && mvn install

EXPOSE 8081

# Run app.py when the container launches
CMD ["/Softwares/maven.sh"]




