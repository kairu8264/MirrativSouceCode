package mm;

import com.google.firebase.perf.metrics.Trace;
import java.util.Arrays;
import java.util.List;
import tm.k;
import tm.m;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Trace f41219a;

    public e(Trace trace) {
        this.f41219a = trace;
    }

    public m a() {
        m.b O = m.w0().Q(this.f41219a.f()).N(this.f41219a.h().d()).O(this.f41219a.h().c(this.f41219a.e()));
        for (b bVar : this.f41219a.d().values()) {
            O.M(bVar.b(), bVar.a());
        }
        List<Trace> i10 = this.f41219a.i();
        if (!i10.isEmpty()) {
            for (Trace trace : i10) {
                O.J(new e(trace).a());
            }
        }
        O.L(this.f41219a.getAttributes());
        k[] b10 = pm.a.b(this.f41219a.g());
        if (b10 != null) {
            O.G(Arrays.asList(b10));
        }
        return O.a();
    }
}
