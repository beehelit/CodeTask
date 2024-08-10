FROM maven:3.9.8-eclipse-temurin-22-alpine
RUN apk update && apk add openssh

# SSH
EXPOSE 22
EXPOSE 8080
RUN echo "StrictHostKeyChecking=no" >> /etc/ssh/ssh_config
RUN mkdir /var/run/sshd
RUN ssh-keygen -A
CMD ["/usr/sbin/sshd", "-D"]