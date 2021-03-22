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
- [ ] Latest Docker(?)
- [ ] Jtest

* [Install Docker](https://docs.docker.com/engine/install/debian)

```sh
sudo apt-get remove docker docker-engine docker.io containerd runc
sudo apt-get upgrade 

sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg \
    lsb-release

curl -fsSL https://download.docker.com/linux/debian/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg

echo \
  "deb [arch=amd64 signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/debian \
  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io
```

### [Run Docker without `sudo`](https://docs.docker.com/engine/install/linux-postinstall/)

```sh
sudo groupadd docker
sudo gpasswd -aG $USER docker
newgrp docker 
docker run hello-world
```

## [Init maven project](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

```sh
mvn archetype:generate \
    -DgroupId=com.eurotech.app \
    -DartifactId=efilter \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false
```

* `DinteractiveMode=true` enables a [setup wizard](https://howtodoinjava.com/maven/create-java-project-maven/)
* `DartifactId` project name
* `DarchetypeArtifactId` [specific configuration of an archetype](https://stackoverflow.com/questions/5137809/what-is-the-purpose-of-the-archetypeartifactid)
  * list of archetype-artefact-ids (templates) [here](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html)

```
mvn test
mvn package
```

## Debugger - [vscode](https://code.visualstudio.com/docs/java/java-debugging)

* *Debugger for Java* extension
* *Language support for Java* extension
* `.vscode/launch.json`:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Debug current file",
            "request": "launch",
            "mainClass": "${file}"
        },
        {
            "type": "java",
            "name": "Debug Efilter",
            "request": "launch",
            "mainClass": "com.eurotech.app.App",
            "projectName": "efilter"
        }
    ]
}
```

---
Now we have also

- [X] debugger
- [X] maven
- [X] docker

😄🍻
---

## Solution

The string serialization of a filter may follow [Open Data Standard](https://www.odata.org/libraries) (odata) and implemented in a web service using [Apach Olingo library](http://olingo.incubator.apache.org).

Let cosider the requirements:

* boolean literals (True False)
* boolean operators (AND, OR, NOT)
* comparison operators (care should be taken to deal with missing properties):
    * property is **present**
    * property is **equal** to some value
    * property is **less** than some value
    * property is **greater** than some value
    * property **matches** a regular expression ([unsupported](https://stackoverflow.com/questions/13525788/regular-expressions-in-odata-filter-conditions))

```
$filter=contains(key)

$filter=contains(key, 'value')
$filter=key eq value
$filter=key gt value
$filter=key lt value

// custom, not present in odata
$filter=regex(key, regex) 

and or not and parenthesization
```

# Day 2

## [antlr maven plugin](https://www.antlr.org/api/maven-plugin/latest/plugin-info.html)

The grammar (`.g4`) should be stored in `/src/main/antlr4/...` ([see this](https://www.antlr.org/api/maven-plugin/latest/index.html)).

The grammar is compiled into Java native code with:

```
mvn antlr4:antlr4
```

[visitor pattern](https://stackoverflow.com/questions/23092081/antlr4-visitor-pattern-on-simple-arithmetic-example)

```
antlr4 Filter.g4
javac Filter*.java
grun Filter start -gui
    $filter=contains(firstname)
    ^D
```

