FROM websphere-liberty:springBoot2

RUN installUtility install --acceptLicense mpConfig-1.2

ADD config/server.xml config/server.xml

ADD target/logdemo2-0.0.1-SNAPSHOT.jar /config/dropins/spring/   