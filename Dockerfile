FROM tomcat
RUN mkdir -p /var/lib/kubeapp
ADD target/spring-boot-mybatis-0.0.1-SNAPSHOT.jar /var/lib/kubeapp
CMD java -jar /var/lib/kubeapp/spring-boot-mybatis-0.0.1-SNAPSHOT.jar
EXPOSE 9095