package Assets;

import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class MinTest {
  private List<String> list;
  
  @BeforeEach
  public void setUp() {
    list = new ArrayList<String>();
  }
  @AfterEach
  public clean() {
    list = null;
  }

  @Test
  public void testForSoloNullElement()
  {
     list.add (null);
     assertThrows(NullPointerException.class, () -> Min.min (list));
  }

}
