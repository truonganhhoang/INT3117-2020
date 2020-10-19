# 8.3-1.

- a : curTemp < desiredTemp - thresholdDiff b : Override c : curTemp < overTemp - thresholdDiff d : timeSinceLastRun.greaterThan (minLag)

24-26: (a || (b && c)) && d 30: b