## AdoptOpenJDK 停止发布 OpenJDK 二进制，而 Eclipse Temurin 是它的延伸，提供更好的稳定性
## 感谢复旦核博士的建议！灰子哥，牛皮！
FROM eclipse-temurin:11-jre

## 创建目录，并使用它作为工作目录
RUN mkdir -p /lab-12-sc-k8s-caller
WORKDIR /lab-12-sc-k8s-caller
## 将后端项目的 Jar 文件，复制到镜像中
COPY ./target/lab-12-sc-k8s-caller.jar app.jar

## 设置 TZ 时区
## 设置 JAVA_OPTS 环境变量，可通过 docker run -e "JAVA_OPTS=" 进行覆盖
ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms512m -Xmx512m"

EXPOSE 8998

## 启动后端项目
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar app.jar --spring.profiles.active=local,k8s
