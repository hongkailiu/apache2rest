# apache2rest

This is a demo project for uploading Apache access log to a rest service.

# Prerequisites
* CentOS 7
* Apache

  ```sh
  $ sudo yum install httpd
  $ sudo systemctl start httpd
  $ tail -f /var/log/httpd/access_log
  ```

* Java
* Gradle

  ```sh
  $ cd <project-root>/test-springboot
  $ ./gradlew clean bootRun
  ```

* Logstash
  ```sh
  $ cd <project-root>
  $ wget https://download.elastic.co/logstash/logstash/logstash-2.3.4.zip
  $ unzip logstash-2.3.4.zip
  $ cd logstash-2.3.4
  $ ./bin/logstash -f ../logstashconf/apache2rest.conf
  ```
