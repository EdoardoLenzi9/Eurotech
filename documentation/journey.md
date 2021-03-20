# Day 0 

I'm not a Java developer therefore the hardest part is the implementation of an "hello word" app in Java!

[Which build automation tool should I use?](https://www.baeldung.com/ant-maven-gradle)

- [ ] ANT is only an automated building tool without dependency management 
- [X] MAVEN largely used with also dependency management
- [ ] GRADLE+KOTLIN for sure the best but hard to learn from scratch in a weekend...


[Quickstart with maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

* [Maven Installation](https://maven.apache.org/download.cgi) -> binary executable

```sh
wget https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
wget https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz.sha512
sha512sum apache-maven-3.x.y-bin.tar.gz 
cat apache-maven-3.x.y-bin.tar.gz.sha512 
tar -zxvf apache-maven-3.x.y-bin.tar.gz 
export PATH=/usr/local/apache-maven-3.x.y/bin:$PATH
```

* [JDK Installation](https://openjdk.java.net/install/index.html)

```sh
wget https://download.java.net/java/GA/jdk16/7863447f0ab643c585b9bdebf67c69db/36/GPL/openjdk-16_linux-x64_bin.tar.gz
wget https://download.java.net/java/GA/jdk16/7863447f0ab643c585b9bdebf67c69db/36/GPL/openjdk-16_linux-x64_bin.tar.gz.sha256
sha256sum openjdk-xy_linux-x64_bin.tar.gz
cat openjdk-xy_linux-x64_bin.tar.gz.sha256

nano ~/.bash_profile
# export JAVA_HOME=/usr/java/jdk16/bin/java
# export PATH=$PATH:/usr/java/jdk16/bin
source ~/.bash_profile
```

# Day 1

- [X] Latest OpenJDK
- [X] Latest Maven