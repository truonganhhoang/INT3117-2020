# 8.3-2.

```java
class TestCCThermostat {
    void testThermostat() {
        Thermostat thermo = new Thermostat();
        ProgrammedSettings settings = new ProgrammedSettings();

        settings.setSetting (period.MORNING, DayType.WEEKDAY, 69);

        thermo.setPeriod (period.MORNING);
        thermo.setDay (DayType.WEEKDAY);

        thermo.setCurTemp (63);
        thermo.setThresholdDiff (6);
        thermo.setCurTemp (66);
        thermo.setThresholdDiff (5);

        thermo.setOverride (true);
        thermo.setOverride (false);
        thermo.setOverTemp (72);
        thermo.set0verTemp (67);

        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (12);
        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (8);

        assertTrue(thermo.check(settings));
    }
}
```