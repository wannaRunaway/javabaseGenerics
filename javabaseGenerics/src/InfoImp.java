public class InfoImp<T> implements Info<T> {
    private T tdata;
    public InfoImp(T tdata){
        setTdata(tdata);
    }
    public void setTdata(T tdata){
        this.tdata = tdata;
    }
    @Override
    public T getValue() {
        return tdata;
    }
}
