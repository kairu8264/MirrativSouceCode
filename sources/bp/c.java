package bp;

/* loaded from: classes4.dex */
public final class c extends f {
    public static final c D = new c();

    public c() {
        super(l.f18574b, l.f18575c, l.f18576d, "DefaultDispatcher");
    }

    @Override // uo.s1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // uo.k0
    public String toString() {
        return "Dispatchers.Default";
    }
}
