package vk;

/* loaded from: classes.dex */
public class t<T> implements xl.b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f57468c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f57469a = f57468c;

    /* renamed from: b  reason: collision with root package name */
    public volatile xl.b<T> f57470b;

    public t(xl.b<T> bVar) {
        this.f57470b = bVar;
    }

    @Override // xl.b
    public T get() {
        T t10 = (T) this.f57469a;
        Object obj = f57468c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f57469a;
                if (t10 == obj) {
                    t10 = this.f57470b.get();
                    this.f57469a = t10;
                    this.f57470b = null;
                }
            }
        }
        return t10;
    }
}
