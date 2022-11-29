package hi;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class df extends j {

    /* renamed from: y  reason: collision with root package name */
    public final Callable<Object> f35732y;

    public df(String str, Callable<Object> callable) {
        super("internal.appMetadata");
        this.f35732y = callable;
    }

    @Override // hi.j
    public final q a(u4 u4Var, List<q> list) {
        try {
            return w6.b(this.f35732y.call());
        } catch (Exception unused) {
            return q.f35921f;
        }
    }
}
