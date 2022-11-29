package nm;

import java.util.Map;
import tm.m;

/* loaded from: classes4.dex */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final lm.a f43709b = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final m f43710a;

    public d(m mVar) {
        this.f43710a = mVar;
    }

    @Override // nm.e
    public boolean c() {
        if (!o(this.f43710a, 0)) {
            lm.a aVar = f43709b;
            aVar.j("Invalid Trace:" + this.f43710a.n0());
            return false;
        } else if (!i(this.f43710a) || g(this.f43710a)) {
            return true;
        } else {
            lm.a aVar2 = f43709b;
            aVar2.j("Invalid Counters for Trace:" + this.f43710a.n0());
            return false;
        }
    }

    public final boolean g(m mVar) {
        return h(mVar, 0);
    }

    public final boolean h(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f43709b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : mVar.g0().entrySet()) {
            if (!l(entry.getKey())) {
                lm.a aVar = f43709b;
                aVar.j("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m(entry.getValue())) {
                lm.a aVar2 = f43709b;
                aVar2.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (m mVar2 : mVar.p0()) {
            if (!h(mVar2, i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    public final boolean i(m mVar) {
        boolean z10;
        if (mVar.f0() > 0) {
            return true;
        }
        for (m mVar2 : mVar.p0()) {
            if (mVar2.f0() > 0) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String d10 = e.d(entry);
            if (d10 != null) {
                f43709b.j(d10);
                return false;
            }
        }
        return true;
    }

    public final boolean k(m mVar) {
        return mVar.n0().startsWith("_st_");
    }

    public final boolean l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f43709b.j("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            f43709b.j("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    public final boolean m(Long l10) {
        return l10 != null;
    }

    public final boolean n(m mVar) {
        Long l10 = mVar.g0().get(sm.b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    public final boolean o(m mVar, int i10) {
        if (mVar == null) {
            f43709b.j("TraceMetric is null");
            return false;
        } else if (i10 > 1) {
            f43709b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(mVar.n0())) {
            lm.a aVar = f43709b;
            aVar.j("invalid TraceId:" + mVar.n0());
            return false;
        } else if (!p(mVar)) {
            lm.a aVar2 = f43709b;
            aVar2.j("invalid TraceDuration:" + mVar.j0());
            return false;
        } else if (!mVar.q0()) {
            f43709b.j("clientStartTimeUs is null.");
            return false;
        } else if (k(mVar) && !n(mVar)) {
            lm.a aVar3 = f43709b;
            aVar3.j("non-positive totalFrames in screen trace " + mVar.n0());
            return false;
        } else {
            for (m mVar2 : mVar.p0()) {
                if (!o(mVar2, i10 + 1)) {
                    return false;
                }
            }
            return j(mVar.h0());
        }
    }

    public final boolean p(m mVar) {
        return mVar != null && mVar.j0() > 0;
    }

    public final boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }
}
