# jugs-activemq-ear

Example EAR for the presentation on JUG Saxony Camp for showing how to use an extern ActiveMQ-Server with the Wildfly Application Server

- Branch 'intern-amq' shows how to use the intern message broker of the wildfly
- Branch 'extern-amq' shows how to use an extern ActiveMQ-Server with a Resource Adapter

## build

the ear can be build with `mvn clean install`

the resource adapter can be build with `mvn clean rar:rar`

the built EAR and RAR need to be copied to the deployment directory of your wildlfy instance
