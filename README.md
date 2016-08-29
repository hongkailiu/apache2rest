# apache2rest

This is a demo project for uploading Apache access log to a rest service.

# Running Env.
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

  Note that the above access log need to use default log format and path. Otherwise update the Logstash config accordingly.

# Test

* Ping Apache server (we should see access log rolling)
  ```sh
  $ curl http://localhost/aaa
  ```

* Check the result from rest server
  ```sh
  $ curl http://localhost:8080/log
  ```

# References

* Logstash documentation: [Apache log](https://www.elastic.co/guide/en/logstash/current/advanced-pipeline.html) and [out http](https://www.elastic.co/guide/en/logstash/current/plugins-outputs-http.html).

* Further work on trigger http requests via [http poller](https://www.elastic.co/blog/introducing-logstash-http-poller) and email notification via [email](https://www.elastic.co/guide/en/logstash/current/plugins-outputs-email.html).
