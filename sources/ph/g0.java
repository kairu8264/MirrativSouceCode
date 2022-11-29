package ph;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes3.dex */
public final class g0<O extends a.d> extends u {
    @NotOnlyInitialized

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.common.api.b<O> f47495c;

    public g0(com.google.android.gms.common.api.b<O> bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f47495c = bVar;
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, R extends oh.e, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(T t10) {
        return (T) this.f47495c.f(t10);
    }

    @Override // com.google.android.gms.common.api.c
    public final Looper b() {
        return this.f47495c.k();
    }
}
