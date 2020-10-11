# Section 7.4-1

# Use the class Watch in Figures 7.38 and 7.39 in Section 7.5 to answer questions a–d below.

a, Draw control flow graphs for the methods in Watch.

b, List all the call sites.

- Line 62, Watch::constructor() ! Time:constructor()
- Line 63, Watch::constructor() ! Time:constructor()
- Line 64, Watch::constructor() ! Time:constructor()
- Line 69, Watch::toString() ! Time:toString()
- Line 70, Watch::toString() ! Time:toString()
- Line 70, Watch::toString() ! Time:toString()
- Line 82, Watch::doTransition() ! Time:changeTime()
- Line 88, Watch::doTransition() ! Time:changeTime()
- Line 94, Watch::doTransition() ! Time:changeTime()

c, List all coupling du-pairs for each call site.

d, Create test data to satisfy All-Coupling-Use Coverage for
Watch.