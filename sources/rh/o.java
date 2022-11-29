package rh;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f51486a = new j0();

    /* loaded from: classes3.dex */
    public interface a<R extends oh.e, T> {
        T a(R r10);
    }

    public static <R extends oh.e, T extends oh.d<R>> vi.g<T> a(oh.b<R> bVar, T t10) {
        return b(bVar, new l0(t10));
    }

    public static <R extends oh.e, T> vi.g<T> b(oh.b<R> bVar, a<R, T> aVar) {
        m0 m0Var = f51486a;
        vi.h hVar = new vi.h();
        bVar.a(new k0(bVar, hVar, aVar, m0Var));
        return hVar.a();
    }
}
