package points;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.level.PlayerFactory;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class DefaultPointCalculatorTest {
    private PointCalculator pointCalculator;
    int testScore = 0;
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private final PlayerFactory Factory = new PlayerFactory(SPRITE_STORE);
    private final Player player = Factory.createPacMan();
    private final Pellet pellet = mock(Pellet.class);
    private final PointCalculator calc = mock(PointCalculator.class);
    private final Pellet pellet2 = new Pellet(10, SPRITE_STORE.getPelletSprite());

    @Test
    void testConsumedAPelletUpdateScore() {
        calc.consumedAPellet(player, pellet2);
        assertEquals(player.getScore(), testScore);
    }
}
