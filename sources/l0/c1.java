package l0;

/* loaded from: classes.dex */
public abstract class c1<T> extends q<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(io.a<? extends T> aVar) {
        super(aVar, null);
        jo.p.h(aVar, "defaultFactory");
    }

    public final d1<T> c(T t10) {
        return new d1<>(this, t10, true);
    }

    public final d1<T> d(T t10) {
        return new d1<>(this, t10, false);
    }
}
