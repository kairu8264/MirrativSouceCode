package androidx.compose.ui.platform;

import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f  reason: collision with root package name */
    public static d f14406f;

    /* renamed from: c  reason: collision with root package name */
    public y1.z f14409c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f14404d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f14405e = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final j2.d f14407g = j2.d.Rtl;

    /* renamed from: h  reason: collision with root package name */
    public static final j2.d f14408h = j2.d.Ltr;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a() {
            if (d.f14406f == null) {
                d.f14406f = new d(null);
            }
            d dVar = d.f14406f;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return dVar;
        }
    }

    public d() {
    }

    public /* synthetic */ d(jo.h hVar) {
        this();
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        int i11;
        if (d().length() > 0 && i10 < d().length()) {
            if (i10 < 0) {
                y1.z zVar = this.f14409c;
                if (zVar == null) {
                    jo.p.v("layoutResult");
                    zVar = null;
                }
                i11 = zVar.p(0);
            } else {
                y1.z zVar2 = this.f14409c;
                if (zVar2 == null) {
                    jo.p.v("layoutResult");
                    zVar2 = null;
                }
                int p10 = zVar2.p(i10);
                i11 = i(p10, f14407g) == i10 ? p10 : p10 + 1;
            }
            y1.z zVar3 = this.f14409c;
            if (zVar3 == null) {
                jo.p.v("layoutResult");
                zVar3 = null;
            }
            if (i11 >= zVar3.m()) {
                return null;
            }
            return c(i(i11, f14407g), i(i11, f14408h) + 1);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i10) {
        int i11;
        if (d().length() > 0 && i10 > 0) {
            if (i10 > d().length()) {
                y1.z zVar = this.f14409c;
                if (zVar == null) {
                    jo.p.v("layoutResult");
                    zVar = null;
                }
                i11 = zVar.p(d().length());
            } else {
                y1.z zVar2 = this.f14409c;
                if (zVar2 == null) {
                    jo.p.v("layoutResult");
                    zVar2 = null;
                }
                int p10 = zVar2.p(i10);
                i11 = i(p10, f14408h) + 1 == i10 ? p10 : p10 - 1;
            }
            if (i11 < 0) {
                return null;
            }
            return c(i(i11, f14407g), i(i11, f14408h) + 1);
        }
        return null;
    }

    public final int i(int i10, j2.d dVar) {
        y1.z zVar = this.f14409c;
        y1.z zVar2 = null;
        if (zVar == null) {
            jo.p.v("layoutResult");
            zVar = null;
        }
        int t10 = zVar.t(i10);
        y1.z zVar3 = this.f14409c;
        if (zVar3 == null) {
            jo.p.v("layoutResult");
            zVar3 = null;
        }
        if (dVar != zVar3.x(t10)) {
            y1.z zVar4 = this.f14409c;
            if (zVar4 == null) {
                jo.p.v("layoutResult");
            } else {
                zVar2 = zVar4;
            }
            return zVar2.t(i10);
        }
        y1.z zVar5 = this.f14409c;
        if (zVar5 == null) {
            jo.p.v("layoutResult");
            zVar5 = null;
        }
        return y1.z.o(zVar5, i10, false, 2, null) - 1;
    }

    public final void j(String str, y1.z zVar) {
        jo.p.h(str, "text");
        jo.p.h(zVar, "layoutResult");
        f(str);
        this.f14409c = zVar;
    }
}
