package ai;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class kb2 implements xc2<lb2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f6159a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f6160b;

    public kb2(t43 t43Var, Bundle bundle) {
        this.f6159a = t43Var;
        this.f6160b = bundle;
    }

    public final /* synthetic */ lb2 a() throws Exception {
        return new lb2(this.f6160b);
    }

    @Override // ai.xc2
    public final s43<lb2> zza() {
        return this.f6159a.h(new Callable(this) { // from class: ai.jb2

            /* renamed from: a  reason: collision with root package name */
            public final kb2 f5686a;

            {
                this.f5686a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5686a.a();
            }
        });
    }
}
