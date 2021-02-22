# configsamples

Filebeat

  filebeat version 6.6.0
  
  sudo service filebeat start
  sudo service filebeat status

  sudo service filebeat stop
  sudo service filebeat status

  /etc/filebeat
  filebeat.yml

Logstash

  sudo systemctl start logstash.service
  sudo service logstash status

  sudo systemctl stop logstash.service
  sudo service logstash status
  
  Sample stash from commandline (ref : https://www.elastic.co/guide/en/logstash/current/first-event.html)
    cd /usr/share/logstash
    bin/logstash -e 'input { stdin { } } output { stdout {} }'
    
    /usr/share/logstash/bin/logstash -f demo-pipeline.conf --config.test_and_exit
    /usr/share/logstash/bin/logstash -f demo-pipeline.conf --config.reload.automatic

  demo-pipeline.conf inside /etc/logstash/conf.d

ElasticSearch

  elasticsearch version
  {
    "name" : "F1mVuNe",
    "cluster_name" : "elasticsearch",
    "cluster_uuid" : "uz2N-yFhTaurRmBOzQPmeA",
    "version" : {
      "number" : "6.6.0",
      "build_flavor" : "default",
      "build_type" : "deb",
      "build_hash" : "a9861f4",
      "build_date" : "2019-01-24T11:27:09.439740Z",
      "build_snapshot" : false,
      "lucene_version" : "7.6.0",
      "minimum_wire_compatibility_version" : "5.6.0",
      "minimum_index_compatibility_version" : "5.0.0"
    },
    "tagline" : "You Know, for Search"
  }

  curl localhost:9200
  http://localhost:9200

Kibana

  http://localhost:5601/app/kibana


