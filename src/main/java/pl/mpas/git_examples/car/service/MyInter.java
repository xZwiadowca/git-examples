package pl.mpas.git_examples.car.service;
@FunctionalInterface
public interface MyInter {
    int Inti (int x,int z);
    default int calc2(String x){
        return 0;
    }
}
