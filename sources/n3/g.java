package n3;

/* loaded from: classes.dex */
public class g<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f41563c;

    public g(int i10) {
        super(i10);
        this.f41563c = new Object();
    }

    @Override // n3.f, n3.e
    public boolean a(T t10) {
        boolean a10;
        synchronized (this.f41563c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    @Override // n3.f, n3.e
    public T acquire() {
        T t10;
        synchronized (this.f41563c) {
            t10 = (T) super.acquire();
        }
        return t10;
    }
}
