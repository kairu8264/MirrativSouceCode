package ai;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ic2 implements xc2<jc2> {

    /* renamed from: a  reason: collision with root package name */
    public final ai0 f5183a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f5184b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5185c;

    public ic2(ai0 ai0Var, t43 t43Var, Context context) {
        this.f5183a = ai0Var;
        this.f5184b = t43Var;
        this.f5185c = context;
    }

    public final /* synthetic */ jc2 a() throws Exception {
        if (!this.f5183a.g(this.f5185c)) {
            return new jc2(null, null, null, null, null);
        }
        String o10 = this.f5183a.o(this.f5185c);
        String str = o10 == null ? "" : o10;
        String p10 = this.f5183a.p(this.f5185c);
        String str2 = p10 == null ? "" : p10;
        String q10 = this.f5183a.q(this.f5185c);
        String str3 = q10 == null ? "" : q10;
        String r10 = this.f5183a.r(this.f5185c);
        return new jc2(str, str2, str3, r10 == null ? "" : r10, "TIME_OUT".equals(str2) ? (Long) ft.c().c(ox.f7938a0) : null);
    }

    @Override // ai.xc2
    public final s43<jc2> zza() {
        return this.f5184b.h(new Callable(this) { // from class: ai.hc2

            /* renamed from: a  reason: collision with root package name */
            public final ic2 f4821a;

            {
                this.f4821a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4821a.a();
            }
        });
    }
}
