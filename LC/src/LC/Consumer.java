package LC;
public class Consumer {
    IWorker iw;
    Consumer(IWorker iw){
        this.iw=iw;
    }
    public void consumer()
    {
        iw.first();
    }
}
