## Ex6.1-2

The first fault is in the Where Made characteristic. Cars can be manufactured at other places than the 3 mentioned. The tester should include an "other" case.

The second fault is in the Size characteristic since ther is overlap. A hatch-back car can have 2 or 4 doors. The tester should split this into two distince characteristics: doors and hatch-back.

|Where Made|Energy Source|Doors |Hatch-back|
|:---------|:------------|:-----|:------|
|North America|Gas|2|Yes|
|Asia|Electric|4|No|
|Europe|Hybrid|
|Other|