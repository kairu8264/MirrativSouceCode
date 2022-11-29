package pi;

import android.os.Bundle;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d2 extends e3 {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Long> f47753b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f47754c;

    /* renamed from: d  reason: collision with root package name */
    public long f47755d;

    public d2(b5 b5Var) {
        super(b5Var);
        this.f47754c = new s.a();
        this.f47753b = new s.a();
    }

    public static /* synthetic */ void g(d2 d2Var, String str, long j10) {
        d2Var.f();
        rh.p.e(str);
        if (d2Var.f47754c.isEmpty()) {
            d2Var.f47755d = j10;
        }
        Integer num = d2Var.f47754c.get(str);
        if (num != null) {
            d2Var.f47754c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (d2Var.f47754c.size() >= 100) {
            d2Var.f48285a.r().v().a("Too many ads visible");
        } else {
            d2Var.f47754c.put(str, 1);
            d2Var.f47753b.put(str, Long.valueOf(j10));
        }
    }

    public static /* synthetic */ void h(d2 d2Var, String str, long j10) {
        d2Var.f();
        rh.p.e(str);
        Integer num = d2Var.f47754c.get(str);
        if (num != null) {
            p7 s10 = d2Var.f48285a.K().s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                d2Var.f47754c.remove(str);
                Long l10 = d2Var.f47753b.get(str);
                if (l10 == null) {
                    d2Var.f48285a.r().p().a("First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    d2Var.f47753b.remove(str);
                    d2Var.n(str, j10 - longValue, s10);
                }
                if (d2Var.f47754c.isEmpty()) {
                    long j11 = d2Var.f47755d;
                    if (j11 == 0) {
                        d2Var.f48285a.r().p().a("First ad exposure time was never set");
                        return;
                    }
                    d2Var.m(j10 - j11, s10);
                    d2Var.f47755d = 0L;
                    return;
                }
                return;
            }
            d2Var.f47754c.put(str, Integer.valueOf(intValue));
            return;
        }
        d2Var.f48285a.r().p().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public final void j(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f48285a.a().y(new a(this, str, j10));
        } else {
            this.f48285a.r().p().a("Ad unit id must be a non-empty string");
        }
    }

    public final void k(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f48285a.a().y(new b0(this, str, j10));
        } else {
            this.f48285a.r().p().a("Ad unit id must be a non-empty string");
        }
    }

    public final void l(long j10) {
        p7 s10 = this.f48285a.K().s(false);
        for (String str : this.f47753b.keySet()) {
            n(str, j10 - this.f47753b.get(str).longValue(), s10);
        }
        if (!this.f47753b.isEmpty()) {
            m(j10 - this.f47755d, s10);
        }
        o(j10);
    }

    public final void m(long j10, p7 p7Var) {
        if (p7Var == null) {
            this.f48285a.r().u().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.f48285a.r().u().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            ia.w(p7Var, bundle, true);
            this.f48285a.I().t(TopicConstant.PACKET_TYPE_AUDIO_MP3, "_xa", bundle);
        }
    }

    public final void n(String str, long j10, p7 p7Var) {
        if (p7Var == null) {
            this.f48285a.r().u().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.f48285a.r().u().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            ia.w(p7Var, bundle, true);
            this.f48285a.I().t(TopicConstant.PACKET_TYPE_AUDIO_MP3, "_xu", bundle);
        }
    }

    public final void o(long j10) {
        for (String str : this.f47753b.keySet()) {
            this.f47753b.put(str, Long.valueOf(j10));
        }
        if (this.f47753b.isEmpty()) {
            return;
        }
        this.f47755d = j10;
    }
}
