public class ManyTypeclass<T,K,V>{
    private T tdata;
    private K kdata;
    private V vdata;
    public void setTdata(T tdata){
        this.tdata = tdata;
    }
    public T getTdata(){
        return tdata;
    }
    public void setKdata(K kdata){
        this.kdata = kdata;
    }
    public K getKdata(){
        return kdata;
    }
    public void setVdata(V vdata){
        this.vdata = vdata;
    }
    public V getVdata(){
        return vdata;
    }
}
