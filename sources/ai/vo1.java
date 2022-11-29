package ai;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vo1 implements rn3<Set<gc1<dq2>>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<String> f11142a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f11143b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f11144c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Map<wp2, xo1>> f11145d;

    public vo1(eo3<String> eo3Var, eo3<Context> eo3Var2, eo3<Executor> eo3Var3, eo3<Map<wp2, xo1>> eo3Var4) {
        this.f11142a = eo3Var;
        this.f11143b = eo3Var2;
        this.f11144c = eo3Var3;
        this.f11145d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String a10 = ((df2) this.f11142a).a();
        Context a11 = ((tr0) this.f11143b).a();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Map zzb = ((vn3) this.f11145d).zzb();
        if (((Boolean) ft.c().c(ox.f8056o3)).booleanValue()) {
            qn qnVar = new qn(new un(a11));
            qnVar.b(new pn(a10) { // from class: ai.wo1

                /* renamed from: a  reason: collision with root package name */
                public final String f11701a;

                {
                    this.f11701a = a10;
                }

                @Override // ai.pn
                public final void a(fp fpVar) {
                    fpVar.s(this.f11701a);
                }
            });
            emptySet = Collections.singleton(new gc1(new yo1(qnVar, zzb), t43Var));
        } else {
            emptySet = Collections.emptySet();
        }
        zn3.b(emptySet);
        return emptySet;
    }
}
