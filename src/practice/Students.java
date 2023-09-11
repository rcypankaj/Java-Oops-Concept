package practice;

public class Students {
    float hin, eng, math, science;
    static float totalAverage = 0;

    public float calcAverage () {
        return (this.hin +this.eng + this.math+ this.science)/4;
    }
}
