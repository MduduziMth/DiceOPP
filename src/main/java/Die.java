import sun.jvm.hotspot.code.AdapterBlob;

import java.util.Arrays;
import java.util.zip.DeflaterInputStream;

public class Die {

    int sides;
    int value;
    int[] probability;


    public Die(int sides)
    {
        this.sides = sides;
    }

    public Die(int sides,int... probability)
    {
        this.sides  = sides;
        this.probability  = probability;
    }

    public void roll() throws Exception
    {
        if(probability != null) {
            double[] FractionProbability = new double[probability.length];

            int sumProbability = Arrays.stream(probability).sum();

            for (int i = 0; i < probability.length; i++) {

                if (i > 0) {
                    FractionProbability[i] += ((double) probability[i] / sumProbability + FractionProbability[i - 1]);
                } else
                    FractionProbability[i] += ((double) probability[i] / sumProbability);
            }

            double random = Math.random();

            for (int i = 0; i < FractionProbability.length; i++) {


                if (random < FractionProbability[i]) {
                    value = i + 1;
                    break;
                }
            }
        }
        else
            value = (int)(Math.random() * sides)+ 1;
    }

}
