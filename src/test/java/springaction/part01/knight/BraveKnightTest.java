package springaction.part01.knight;
import static org.mockito.Mockito.*;

import com.springaction.part01.knight.BraveKnight;
import com.springaction.part01.knight.Quest;
import org.junit.Test;

public class BraveKnightTest {

    @Test
    public void KnightShouldEmbarkOnQuest(){

        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();

    }
}
