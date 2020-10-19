# Câu 2

```Java
public class ThermostatTest {
    Thermostat thermostat;
    ProgrammedSettings programmedSettings;
    @Before
    public void setUp() {
        thermostat = new Thermostat();
        programmedSettings = new ProgrammedSettings();
        programmedSettings.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
        thermostat.setPeriod(Period.MORNING);
        thermostat.setDay(DayType.WEEKDAY);
    }
    @Test
    public void testTruePredicate() {
        thermostat.setCurrentTemp(63);
        thermostat.setThresholdDiff(5);
        thermostat.setOverride(true);
        thermostat.setOverTemp(70);
        thermostat.setMinLag(10);
        thermostat.setTimeSinceLastRun(12);
        assertTrue(thermostat.turnHeaterOn(programmedSettings));
    }
    @Test
    public void testFalsePredicate() {
        thermostat.setPeriod(Period.MORNING);
        thermostat.setDay(DayType.WEEKDAY);
        thermostat.setCurrentTemp(63);
        thermostat.setThresholdDiff(8);
        thermostat.setOverride(false);
        thermostat.setOverTemp(70);
        thermostat.setMinLag(13);
        thermostat.setTimeSinceLastRun(12);
        assertFalse(thermo.turnHeaterOn(programmedSettings));
    }
}
```