# Câu 3

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
        public void TestCACC1() {
            thermo.setCurrentTemp (63);
            thermo.setThresholdDiff (5);
            thermo.setOverride (true);
            thermo.setOverTemp (67);
            thermo.setMinLag (10);
            thermo.setTimeSinceLastRun (12);
        }
    
        @Test
        public void TestCACC2() {
            thermo.setCurrentTemp (66); 
            thermo.setThresholdDiff (5);
            thermo.setOverride (true);
            thermo.setOverTemp (67); 
            thermo.setMinLag (10);
            thermo.setTimeSinceLastRun (12);
        }
    
        @Test
        public void TestCACC3() {
            thermo.setCurrentTemp (66); 
            thermo.setThresholdDiff (5);
            thermo.setOverride (true);
            thermo.setOverTemp (72); 
            thermo.setMinLag (10);
            thermo.setTimeSinceLastRun (12);
        }
    
        @Test
        public void TestCACC4() {
            thermo.setCurrentTemp (66);
            thermo.setThresholdDiff (5);
            thermo.setOverride (false);
            thermo.setOverTemp (72);
            thermo.setMinLag (10);
            thermo.setTimeSinceLastRun (12);
        }
    
        @Test
        public void TestCACC5() {
            thermo.setCurrentTemp (63);
            thermo.setThresholdDiff (5);
            thermo.setOverride (true);
            thermo.setOverTemp (72);
            thermo.setMinLag (10);
            thermo.setTimeSinceLastRun (12);
        }
    
        @Test
        public void TestCACC6() {
            thermo.setCurrentTemp (63);
            thermo.setThresholdDiff (5);
            thermo.setOverride (true);
            thermo.setOverTemp (72);
            thermo.setMinLag (10);
            thermo.setTimeSinceLastRun (8); // d is false
        }
}
```