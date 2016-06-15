FROM catalystdevlabs/centos7-java8:latest
MAINTAINER catalystdevlabs <dsloane@catalystdevworks.com>

# Add Compiled Spring Boot Package
VOLUME /tmp
ADD aperture-data.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8070
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]