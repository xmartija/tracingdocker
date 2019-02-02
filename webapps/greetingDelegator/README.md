# greeting delegator
Is a simple app that does not know how to greet but knows how to get the greeting from a different service.
Even if it is simple, this and other services inheriting(better word forking?) from this , could be used to proof  that the tracing works at deeper levels, context propagated, bottleneck when under load, ... i.e. how microservices work together .

I might prefer to copy (fork) the whole demo project as opposed to extending the demo service. This services started doing similar things, but they will diverge independently. I we start creating Maven parents, maven multimodules,  shared libs, apis ..., we will reuse code at the cost of independence  
