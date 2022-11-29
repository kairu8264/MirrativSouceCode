package ai;

import android.content.Context;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class cb2 implements xc2<db2> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f2782a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2783b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f2784c;

    public cb2(t43 t43Var, Context context, Set<String> set) {
        this.f2782a = t43Var;
        this.f2783b = context;
        this.f2784c = set;
    }

    public final /* synthetic */ db2 a() throws Exception {
        if (((Boolean) ft.c().c(ox.f8104u3)).booleanValue()) {
            Set<String> set = this.f2784c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains(MRLog.TARGET_TYPE_BANNER)) {
                return new db2(wg.t.s().a(this.f2783b));
            }
        }
        return new db2(null);
    }

    @Override // ai.xc2
    public final s43<db2> zza() {
        return this.f2782a.h(new Callable(this) { // from class: ai.bb2

            /* renamed from: a  reason: collision with root package name */
            public final cb2 f2278a;

            {
                this.f2278a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2278a.a();
            }
        });
    }
}
