package TD;

@FunctionalInterface
public interface somme<T> {
    T sommer(T t, T m);   
    somme<Integer> sommerint = (Integer x,Integer b) -> (Integer)x+b;
    somme<String> sommerstr = (String x,String b) -> (String) x+b;
    somme<Double> sommerdbl = (Double x,Double b) -> (Double) x+b;
    somme<Float> sommerflt = (Float x, Float b) -> (Float) x+b;
}
