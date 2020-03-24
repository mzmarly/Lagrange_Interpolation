public class Interpolation {
    public static void InterpolationLagrange(Point2D [] tab, int size, int x)
    {
        int i=0;
        double result = 0.;
        for(i=0;i<tab.length-1;i++)
        {
            double p=1.;
            for(int j=0;j<tab.length-1;j++)
                if(i!=j) {
                    p = p * ((x - tab[j].x) / (tab[i].x - tab[j].x));
                }
            result += tab[i].y * p;
        }
        System.out.println("Interpolation value is "+ result);
    }
}
