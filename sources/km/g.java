package km;

import com.google.firebase.perf.session.SessionManager;

/* loaded from: classes4.dex */
public final class g implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38880a;

    public g(a aVar) {
        this.f38880a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) pn.b.c(aVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public SessionManager get() {
        return c(this.f38880a);
    }
}
