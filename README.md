# tracingdocker

## to run
chmod +x  ./start-all.sh
./start-all.sh
go for one coffee ... or two

## test

### demo (helloworld)
hit localhost:8080

### greetin delegator (delegates the hello to demo)
hit localhost:8081

### kibana
check localhost:5601

set indepatern logstash*
pick timestamp as timestamp
go to discover, last hour
you should have some logs there, for different containers

### zipkin
got to http://localhost:9411
some traces there too



## Showcase of java webapps beeing traced by ELK running in docker

centralized logs with ELK, logspout

webapps that demostrate traces accross servers:
use spring cloud tracing
user initiates an action to server A
part of the action needs to be solved by server B and code C
server A needs to wait for both result. We would prefere not having a thread blocked for those


Server A : AggreagationAndMultiplactionDivider, (A+B)/(CxD) yet only knows how to divide
Server B : Multiplicator . Knows how to do the CxD part
Server C : Aggregator. Know how to do the A+B part

It would be interesting to inject some delay (sleep) and see how the bottleneck switches


I like the consistency of docker. If I use docker to build the code, using the maven wrapper, the person (or CI system) running this will have no need to install java, maven, and will consistently work in any environment that just supports Docker.

So the code is build into an docker image by using docker build
An we just run it with docker run . The dilema now is mount the volume of the src or just copy the source?
