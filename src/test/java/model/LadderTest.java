package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LadderTest {

    @Test
    public void should_throw_exception_when_ladder_height_is_under_zero_or_width_is_under_zero() {
        // given
        int test_width = 3;
        int test_height = 3;

        // when
        // model.Ladder ladder = new model.Ladder(test_width, test_height);

        // then

    }

    @Test
    @DisplayName("(참가자 수 -1) * (높이 수 - 1) 만큼 line이 생성되면 성공이다.")
    public void should_success_when_line_is_created_as_w_line_and_h_line() {
        // given

        // when

        // then

    }

    @Test
    public void test() {
        // given
        // model.Ladder ladder = new model.Ladder(7,3);

        // assertThat(ladder.getLadderSize()).isEqualTo(21);
    }

    /*
    @Test
    public void getLadderSize() {
        model.Ladder ladder = new model.Ladder(3, 5);
        System.out.println(ladder.getLines());
    }

    @Test
    public void getLadder() {

        model.Ladder ladder = new model.Ladder(3, 5);
        List<model.Line> linesList = ladder.getLines();

        List<model.Point> pointList = new ArrayList<>();

        List<Boolean> booleanList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            model.Line line = linesList.get(i);
            List<model.Point> points = line.getLine();

            for (int j = 0; j < 5-1; j++) {

                pointList.add((points.get(j)));

            }
        }

        System.out.println(pointList);
    }

     */

    /*
    @Test
    public void generatedLadder() {
        model.Ladder ladder = new model.Ladder(3, 4);
        // ladder.generateLadder(ladder.getLines());

        List<ArrayList<String>> generatedLadder = ladder.generateLadder(ladder.getLines());

        System.out.println(ladder.generateLadder(ladder.getLines()));

        // 사다리 출력
        for (int i = 0; i < generatedLadder.size(); i++) {
            String result = generatedLadder.get(i).stream()
                    .map(n -> String.valueOf(n))
                    .collect(Collectors.joining());

            System.out.println(result);
        }
    }

     */
}