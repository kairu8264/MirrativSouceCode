package ai;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class sp1 implements dq2 {

    /* renamed from: x  reason: collision with root package name */
    public final lp1 f9898x;

    /* renamed from: y  reason: collision with root package name */
    public final vh.f f9899y;

    /* renamed from: w  reason: collision with root package name */
    public final Map<wp2, Long> f9897w = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public final Map<wp2, rp1> f9900z = new HashMap();

    public sp1(lp1 lp1Var, Set<rp1> set, vh.f fVar) {
        wp2 wp2Var;
        this.f9898x = lp1Var;
        for (rp1 rp1Var : set) {
            Map<wp2, rp1> map = this.f9900z;
            wp2Var = rp1Var.f9533c;
            map.put(wp2Var, rp1Var);
        }
        this.f9899y = fVar;
    }

    @Override // ai.dq2
    public final void A(wp2 wp2Var, String str) {
    }

    @Override // ai.dq2
    public final void K(wp2 wp2Var, String str) {
        this.f9897w.put(wp2Var, Long.valueOf(this.f9899y.elapsedRealtime()));
    }

    public final void a(wp2 wp2Var, boolean z10) {
        wp2 wp2Var2;
        String str;
        wp2Var2 = this.f9900z.get(wp2Var).f9532b;
        String str2 = true != z10 ? "f." : "s.";
        if (this.f9897w.containsKey(wp2Var2)) {
            long elapsedRealtime = this.f9899y.elapsedRealtime() - this.f9897w.get(wp2Var2).longValue();
            Map<String, String> c10 = this.f9898x.c();
            str = this.f9900z.get(wp2Var).f9531a;
            String concat = str.length() != 0 ? "label.".concat(str) : new String("label.");
            String valueOf = String.valueOf(Long.toString(elapsedRealtime));
            c10.put(concat, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    @Override // ai.dq2
    public final void c(wp2 wp2Var, String str) {
        if (this.f9897w.containsKey(wp2Var)) {
            long elapsedRealtime = this.f9899y.elapsedRealtime() - this.f9897w.get(wp2Var).longValue();
            Map<String, String> c10 = this.f9898x.c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            c10.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f9900z.containsKey(wp2Var)) {
            a(wp2Var, true);
        }
    }

    @Override // ai.dq2
    public final void n(wp2 wp2Var, String str, Throwable th2) {
        if (this.f9897w.containsKey(wp2Var)) {
            long elapsedRealtime = this.f9899y.elapsedRealtime() - this.f9897w.get(wp2Var).longValue();
            Map<String, String> c10 = this.f9898x.c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            c10.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f9900z.containsKey(wp2Var)) {
            a(wp2Var, false);
        }
    }
}
