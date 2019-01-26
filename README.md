# tracingdocker
 Showcase of java webapps beeing traced by ELK running in docker

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
