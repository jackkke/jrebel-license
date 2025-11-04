FROM jackkke/openjdk:21-jre-alpine
ARG VERSION
WORKDIR /app
COPY jrebel-license-${VERSION}.jar ./app.jar
ENV PORT=8081
EXPOSE 8081
ENTRYPOINT exec java -jar app.jar -p ${PORT}
