mvn clean package && docker build -t adriantrifan/java-app .

docker rm -f java-app || true

docker run -d --name adriantrifan -p 8080:8080 adriantrifan/java-app