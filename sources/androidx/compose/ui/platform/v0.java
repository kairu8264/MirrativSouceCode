package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import c1.c0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d2.u;
import d2.v;
import m2.r;
import m2.t;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public Parcel f14670a;

    public v0() {
        Parcel obtain = Parcel.obtain();
        jo.p.g(obtain, "obtain()");
        this.f14670a = obtain;
    }

    public final void a(byte b10) {
        this.f14670a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f14670a.writeFloat(f10);
    }

    public final void c(int i10) {
        this.f14670a.writeInt(i10);
    }

    public final void d(c1.f1 f1Var) {
        jo.p.h(f1Var, "shadow");
        m(f1Var.c());
        b(b1.f.m(f1Var.d()));
        b(b1.f.n(f1Var.d()));
        b(f1Var.b());
    }

    public final void e(d2.x xVar) {
        jo.p.h(xVar, TtmlNode.ATTR_TTS_FONT_WEIGHT);
        c(xVar.r());
    }

    public final void f(j2.f fVar) {
        jo.p.h(fVar, TtmlNode.ATTR_TTS_TEXT_DECORATION);
        c(fVar.e());
    }

    public final void g(j2.i iVar) {
        jo.p.h(iVar, "textGeometricTransform");
        b(iVar.b());
        b(iVar.c());
    }

    public final void h(String str) {
        jo.p.h(str, "string");
        this.f14670a.writeString(str);
    }

    public final void i(y1.v vVar) {
        jo.p.h(vVar, "spanStyle");
        long f10 = vVar.f();
        c0.a aVar = c1.c0.f18634b;
        if (!c1.c0.m(f10, aVar.e())) {
            a((byte) 1);
            m(vVar.f());
        }
        long i10 = vVar.i();
        r.a aVar2 = m2.r.f40540b;
        if (!m2.r.e(i10, aVar2.a())) {
            a((byte) 2);
            j(vVar.i());
        }
        d2.x l10 = vVar.l();
        if (l10 != null) {
            a((byte) 3);
            e(l10);
        }
        d2.u j10 = vVar.j();
        if (j10 != null) {
            int i11 = j10.i();
            a((byte) 4);
            o(i11);
        }
        d2.v k10 = vVar.k();
        if (k10 != null) {
            int m10 = k10.m();
            a((byte) 5);
            l(m10);
        }
        String h10 = vVar.h();
        if (h10 != null) {
            a((byte) 6);
            h(h10);
        }
        if (!m2.r.e(vVar.m(), aVar2.a())) {
            a((byte) 7);
            j(vVar.m());
        }
        j2.a d10 = vVar.d();
        if (d10 != null) {
            float h11 = d10.h();
            a((byte) 8);
            k(h11);
        }
        j2.i s10 = vVar.s();
        if (s10 != null) {
            a((byte) 9);
            g(s10);
        }
        if (!c1.c0.m(vVar.c(), aVar.e())) {
            a((byte) 10);
            m(vVar.c());
        }
        j2.f q10 = vVar.q();
        if (q10 != null) {
            a((byte) 11);
            f(q10);
        }
        c1.f1 p10 = vVar.p();
        if (p10 != null) {
            a((byte) 12);
            d(p10);
        }
    }

    public final void j(long j10) {
        long g10 = m2.r.g(j10);
        t.a aVar = m2.t.f40544b;
        byte b10 = 0;
        if (!m2.t.g(g10, aVar.c())) {
            if (m2.t.g(g10, aVar.b())) {
                b10 = 1;
            } else if (m2.t.g(g10, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (m2.t.g(m2.r.g(j10), aVar.c())) {
            return;
        }
        b(m2.r.h(j10));
    }

    public final void k(float f10) {
        b(f10);
    }

    public final void l(int i10) {
        v.a aVar = d2.v.f29143b;
        byte b10 = 0;
        if (!d2.v.h(i10, aVar.b())) {
            if (d2.v.h(i10, aVar.a())) {
                b10 = 1;
            } else if (d2.v.h(i10, aVar.d())) {
                b10 = 2;
            } else if (d2.v.h(i10, aVar.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long j10) {
        n(j10);
    }

    public final void n(long j10) {
        this.f14670a.writeLong(j10);
    }

    public final void o(int i10) {
        u.a aVar = d2.u.f29139b;
        byte b10 = 0;
        if (!d2.u.f(i10, aVar.b()) && d2.u.f(i10, aVar.a())) {
            b10 = 1;
        }
        a(b10);
    }

    public final String p() {
        String encodeToString = Base64.encodeToString(this.f14670a.marshall(), 0);
        jo.p.g(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void q() {
        this.f14670a.recycle();
        Parcel obtain = Parcel.obtain();
        jo.p.g(obtain, "obtain()");
        this.f14670a = obtain;
    }
}
