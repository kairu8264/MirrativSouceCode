package androidx.compose.ui.platform;

import android.graphics.Rect;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: h  reason: collision with root package name */
    public static e f14427h;

    /* renamed from: c  reason: collision with root package name */
    public y1.z f14430c;

    /* renamed from: d  reason: collision with root package name */
    public w1.q f14431d;

    /* renamed from: e  reason: collision with root package name */
    public Rect f14432e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f14425f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f14426g = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final j2.d f14428i = j2.d.Rtl;

    /* renamed from: j  reason: collision with root package name */
    public static final j2.d f14429j = j2.d.Ltr;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a() {
            if (e.f14427h == null) {
                e.f14427h = new e(null);
            }
            e eVar = e.f14427h;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return eVar;
        }
    }

    public e() {
        this.f14432e = new Rect();
    }

    public /* synthetic */ e(jo.h hVar) {
        this();
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        int m10;
        y1.z zVar = null;
        if (d().length() > 0 && i10 < d().length()) {
            try {
                w1.q qVar = this.f14431d;
                if (qVar == null) {
                    jo.p.v("node");
                    qVar = null;
                }
                int c10 = lo.c.c(qVar.f().h());
                int d10 = po.n.d(0, i10);
                y1.z zVar2 = this.f14430c;
                if (zVar2 == null) {
                    jo.p.v("layoutResult");
                    zVar2 = null;
                }
                int p10 = zVar2.p(d10);
                y1.z zVar3 = this.f14430c;
                if (zVar3 == null) {
                    jo.p.v("layoutResult");
                    zVar3 = null;
                }
                float u10 = zVar3.u(p10) + c10;
                y1.z zVar4 = this.f14430c;
                if (zVar4 == null) {
                    jo.p.v("layoutResult");
                    zVar4 = null;
                }
                y1.z zVar5 = this.f14430c;
                if (zVar5 == null) {
                    jo.p.v("layoutResult");
                    zVar5 = null;
                }
                if (u10 < zVar4.u(zVar5.m() - 1)) {
                    y1.z zVar6 = this.f14430c;
                    if (zVar6 == null) {
                        jo.p.v("layoutResult");
                    } else {
                        zVar = zVar6;
                    }
                    m10 = zVar.q(u10);
                } else {
                    y1.z zVar7 = this.f14430c;
                    if (zVar7 == null) {
                        jo.p.v("layoutResult");
                    } else {
                        zVar = zVar7;
                    }
                    m10 = zVar.m();
                }
                return c(d10, i(m10 - 1, f14429j) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i10) {
        int i11;
        y1.z zVar = null;
        if (d().length() > 0 && i10 > 0) {
            try {
                w1.q qVar = this.f14431d;
                if (qVar == null) {
                    jo.p.v("node");
                    qVar = null;
                }
                int c10 = lo.c.c(qVar.f().h());
                int i12 = po.n.i(d().length(), i10);
                y1.z zVar2 = this.f14430c;
                if (zVar2 == null) {
                    jo.p.v("layoutResult");
                    zVar2 = null;
                }
                int p10 = zVar2.p(i12);
                y1.z zVar3 = this.f14430c;
                if (zVar3 == null) {
                    jo.p.v("layoutResult");
                    zVar3 = null;
                }
                float u10 = zVar3.u(p10) - c10;
                if (u10 > 0.0f) {
                    y1.z zVar4 = this.f14430c;
                    if (zVar4 == null) {
                        jo.p.v("layoutResult");
                    } else {
                        zVar = zVar4;
                    }
                    i11 = zVar.q(u10);
                } else {
                    i11 = 0;
                }
                if (i12 == d().length() && i11 < p10) {
                    i11++;
                }
                return c(i(i11, f14428i), i12);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    public final int i(int i10, j2.d dVar) {
        y1.z zVar = this.f14430c;
        y1.z zVar2 = null;
        if (zVar == null) {
            jo.p.v("layoutResult");
            zVar = null;
        }
        int t10 = zVar.t(i10);
        y1.z zVar3 = this.f14430c;
        if (zVar3 == null) {
            jo.p.v("layoutResult");
            zVar3 = null;
        }
        if (dVar != zVar3.x(t10)) {
            y1.z zVar4 = this.f14430c;
            if (zVar4 == null) {
                jo.p.v("layoutResult");
            } else {
                zVar2 = zVar4;
            }
            return zVar2.t(i10);
        }
        y1.z zVar5 = this.f14430c;
        if (zVar5 == null) {
            jo.p.v("layoutResult");
            zVar5 = null;
        }
        return y1.z.o(zVar5, i10, false, 2, null) - 1;
    }

    public final void j(String str, y1.z zVar, w1.q qVar) {
        jo.p.h(str, "text");
        jo.p.h(zVar, "layoutResult");
        jo.p.h(qVar, "node");
        f(str);
        this.f14430c = zVar;
        this.f14431d = qVar;
    }
}
