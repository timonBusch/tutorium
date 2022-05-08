import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

public class GartenTest {

    Pflanze pflanze1;
    Pflanze pflanze2;
    Pflanze pflanze3;
    Garten<Pflanze> garten;

    @Before
    public void setup() {
        pflanze1 = mock(Pflanze.class);
        pflanze2 = mock(Pflanze.class);
        pflanze3 = mock(Pflanze.class);
        garten = new Garten<>();
        assumeTrue(garten.getGartenSize() == 0);
        garten.addToGarten(pflanze1);
        garten.addToGarten(pflanze2);
        garten.addToGarten(pflanze3);
        assumeTrue(garten.getGartenSize() == 3);
    }

    /**
     * Checkt ob removeUnkraut() eine Liste zurueck gibt mit einem
     * bestimmten Objekt
     */
    @Test
    public void testRemoveUnkrautCheckUnkrautListe() {
        when(pflanze1.getUnkraut()).thenReturn(false);
        when(pflanze2.getUnkraut()).thenReturn(true);
        when(pflanze3.getUnkraut()).thenReturn(false);
        List<Pflanze> unkrautGarten = garten.removeUnkraut();
        assertEquals(unkrautGarten.get(0), pflanze2);
    }

    /**
     * Checkt ob die zurueck gelieferte Liste die korrekte groesse hat
     */
    @Test
    public void testRemoveUnkrautCheckUnkrautGartenSize(){
        when(pflanze1.getUnkraut()).thenReturn(true);
        when(pflanze2.getUnkraut()).thenReturn(false);
        when(pflanze3.getUnkraut()).thenReturn(true);
        List<Pflanze> unkrautGarten = garten.removeUnkraut();
        assertEquals(unkrautGarten.size(), 2);
    }


}
