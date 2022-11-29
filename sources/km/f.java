package km;

import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes4.dex */
public final class f implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38879a;

    public f(a aVar) {
        this.f38879a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) pn.b.c(aVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public RemoteConfigManager get() {
        return c(this.f38879a);
    }
}
