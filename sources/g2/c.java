package g2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Spanned;
import android.text.TextUtils;
import c1.f1;
import c1.n;
import c1.u;
import c1.u0;
import c1.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jo.p;
import jo.q;
import kotlin.NoWhenBranchMatchedException;
import y1.c0;
import y1.d0;
import z1.s;

/* loaded from: classes.dex */
public final class c implements y1.h {

    /* renamed from: a  reason: collision with root package name */
    public final e f32580a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32581b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32582c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32583d;

    /* renamed from: e  reason: collision with root package name */
    public final s f32584e;

    /* renamed from: f  reason: collision with root package name */
    public final List<b1.h> f32585f;

    /* renamed from: g  reason: collision with root package name */
    public final wn.f f32586g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32587a;

        static {
            int[] iArr = new int[j2.d.values().length];
            iArr[j2.d.Ltr.ordinal()] = 1;
            iArr[j2.d.Rtl.ordinal()] = 2;
            f32587a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<a2.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final a2.a invoke() {
            return new a2.a(c.this.D(), c.this.f32584e.z());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(e eVar, int i10, boolean z10, long j10) {
        int f10;
        List<b1.h> list;
        b1.h hVar;
        float p10;
        float f11;
        int b10;
        float q10;
        float f12;
        float f13;
        int e10;
        this.f32580a = eVar;
        this.f32581b = i10;
        this.f32582c = z10;
        this.f32583d = j10;
        boolean z11 = false;
        if (!(m2.b.o(j10) == 0 && m2.b.p(j10) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i10 >= 1) {
            d0 h10 = eVar.h();
            f10 = g.f(h10.v());
            j2.e v10 = h10.v();
            int j11 = v10 == null ? 0 : j2.e.j(v10.m(), j2.e.f37075b.c());
            TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
            s z12 = z(f10, j11, truncateAt, i10);
            if (z10 && z12.b() > m2.b.m(j10) && i10 > 1) {
                e10 = g.e(z12, m2.b.m(j10));
                if (e10 > 0 && e10 != i10) {
                    z12 = z(f10, j11, truncateAt, e10);
                }
                this.f32584e = z12;
            } else {
                this.f32584e = z12;
            }
            E().a(h10.f(), b1.m.a(getWidth(), getHeight()));
            for (i2.a aVar : C(this.f32584e)) {
                aVar.a(b1.l.c(b1.m.a(getWidth(), getHeight())));
            }
            CharSequence e11 = this.f32580a.e();
            if (e11 instanceof Spanned) {
                Object[] spans = ((Spanned) e11).getSpans(0, e11.length(), b2.h.class);
                p.g(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                ArrayList arrayList = new ArrayList(spans.length);
                int length = spans.length;
                int i11 = 0;
                while (i11 < length) {
                    b2.h hVar2 = (b2.h) spans[i11];
                    Spanned spanned = (Spanned) e11;
                    int spanStart = spanned.getSpanStart(hVar2);
                    int spanEnd = spanned.getSpanEnd(hVar2);
                    int l10 = this.f32584e.l(spanStart);
                    boolean z13 = (this.f32584e.i(l10) <= 0 || spanEnd <= this.f32584e.j(l10)) ? z11 : true;
                    boolean z14 = spanEnd > this.f32584e.k(l10) ? true : z11;
                    if (z13 || z14) {
                        hVar = null;
                    } else {
                        int i12 = a.f32587a[t(spanStart).ordinal()];
                        if (i12 == 1) {
                            p10 = p(spanStart, true);
                        } else if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            p10 = p(spanStart, true) - hVar2.d();
                        }
                        float d10 = hVar2.d() + p10;
                        s sVar = this.f32584e;
                        switch (hVar2.c()) {
                            case 0:
                                f11 = sVar.f(l10);
                                b10 = hVar2.b();
                                q10 = f11 - b10;
                                break;
                            case 1:
                                q10 = sVar.q(l10);
                                break;
                            case 2:
                                f11 = sVar.g(l10);
                                b10 = hVar2.b();
                                q10 = f11 - b10;
                                break;
                            case 3:
                                q10 = ((sVar.q(l10) + sVar.g(l10)) - hVar2.b()) / 2;
                                break;
                            case 4:
                                f12 = hVar2.a().ascent;
                                f13 = sVar.f(l10);
                                q10 = f12 + f13;
                                break;
                            case 5:
                                f11 = hVar2.a().descent + sVar.f(l10);
                                b10 = hVar2.b();
                                q10 = f11 - b10;
                                break;
                            case 6:
                                Paint.FontMetricsInt a10 = hVar2.a();
                                f12 = ((a10.ascent + a10.descent) - hVar2.b()) / 2;
                                f13 = sVar.f(l10);
                                q10 = f12 + f13;
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                        hVar = new b1.h(p10, q10, d10, hVar2.b() + q10);
                    }
                    arrayList.add(hVar);
                    i11++;
                    z11 = false;
                }
                list = arrayList;
            } else {
                list = xn.s.k();
            }
            this.f32585f = list;
            this.f32586g = wn.g.b(wn.i.NONE, new b());
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }

    public /* synthetic */ c(e eVar, int i10, boolean z10, long j10, jo.h hVar) {
        this(eVar, i10, z10, j10);
    }

    public final CharSequence A() {
        return this.f32580a.e();
    }

    public final float B(int i10) {
        return this.f32584e.f(i10);
    }

    public final i2.a[] C(s sVar) {
        if (sVar.z() instanceof Spanned) {
            i2.a[] aVarArr = (i2.a[]) ((Spanned) sVar.z()).getSpans(0, sVar.z().length(), i2.a.class);
            p.g(aVarArr, "brushSpans");
            return aVarArr.length == 0 ? new i2.a[0] : aVarArr;
        }
        return new i2.a[0];
    }

    public final Locale D() {
        Locale textLocale = this.f32580a.j().getTextLocale();
        p.g(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public final h E() {
        return this.f32580a.j();
    }

    public final a2.a F() {
        return (a2.a) this.f32586g.getValue();
    }

    @Override // y1.h
    public float a() {
        return this.f32580a.a();
    }

    @Override // y1.h
    public j2.d b(int i10) {
        return this.f32584e.t(this.f32584e.l(i10)) == 1 ? j2.d.Ltr : j2.d.Rtl;
    }

    @Override // y1.h
    public float c(int i10) {
        return this.f32584e.q(i10);
    }

    @Override // y1.h
    public b1.h d(int i10) {
        if (i10 >= 0 && i10 <= A().length()) {
            float v10 = s.v(this.f32584e, i10, false, 2, null);
            int l10 = this.f32584e.l(i10);
            return new b1.h(v10, this.f32584e.q(l10), v10, this.f32584e.g(l10));
        }
        throw new AssertionError("offset(" + i10 + ") is out of bounds (0," + A().length());
    }

    @Override // y1.h
    public long e(int i10) {
        return c0.b(F().b(i10), F().a(i10));
    }

    @Override // y1.h
    public float f() {
        return B(0);
    }

    @Override // y1.h
    public void g(w wVar, u uVar, f1 f1Var, j2.f fVar) {
        p.h(wVar, "canvas");
        p.h(uVar, "brush");
        h E = E();
        E.a(uVar, b1.m.a(getWidth(), getHeight()));
        E.c(f1Var);
        E.d(fVar);
        Canvas c10 = c1.c.c(wVar);
        if (m()) {
            c10.save();
            c10.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f32584e.C(c10);
        if (m()) {
            c10.restore();
        }
    }

    @Override // y1.h
    public float getHeight() {
        return this.f32584e.b();
    }

    @Override // y1.h
    public float getWidth() {
        return m2.b.n(this.f32583d);
    }

    @Override // y1.h
    public int h(long j10) {
        return this.f32584e.s(this.f32584e.m((int) b1.f.n(j10)), b1.f.m(j10));
    }

    @Override // y1.h
    public int i(int i10) {
        return this.f32584e.p(i10);
    }

    @Override // y1.h
    public int j(int i10, boolean z10) {
        if (z10) {
            return this.f32584e.r(i10);
        }
        return this.f32584e.k(i10);
    }

    @Override // y1.h
    public int k() {
        return this.f32584e.h();
    }

    @Override // y1.h
    public float l(int i10) {
        return this.f32584e.o(i10);
    }

    @Override // y1.h
    public boolean m() {
        return this.f32584e.a();
    }

    @Override // y1.h
    public int n(float f10) {
        return this.f32584e.m((int) f10);
    }

    @Override // y1.h
    public u0 o(int i10, int i11) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10 && i11 <= A().length()) {
            Path path = new Path();
            this.f32584e.y(i10, i11, path);
            return n.b(path);
        }
        throw new AssertionError("Start(" + i10 + ") or End(" + i11 + ") is out of Range(0.." + A().length() + "), or start > end!");
    }

    @Override // y1.h
    public float p(int i10, boolean z10) {
        if (z10) {
            return s.v(this.f32584e, i10, false, 2, null);
        }
        return s.x(this.f32584e, i10, false, 2, null);
    }

    @Override // y1.h
    public float q(int i10) {
        return this.f32584e.n(i10);
    }

    @Override // y1.h
    public float r() {
        if (this.f32581b < k()) {
            return B(this.f32581b - 1);
        }
        return B(k() - 1);
    }

    @Override // y1.h
    public int s(int i10) {
        return this.f32584e.l(i10);
    }

    @Override // y1.h
    public j2.d t(int i10) {
        if (this.f32584e.B(i10)) {
            return j2.d.Rtl;
        }
        return j2.d.Ltr;
    }

    @Override // y1.h
    public float u(int i10) {
        return this.f32584e.g(i10);
    }

    @Override // y1.h
    public b1.h v(int i10) {
        float v10 = s.v(this.f32584e, i10, false, 2, null);
        float v11 = s.v(this.f32584e, i10 + 1, false, 2, null);
        int l10 = this.f32584e.l(i10);
        return new b1.h(v10, this.f32584e.q(l10), v11, this.f32584e.g(l10));
    }

    @Override // y1.h
    public List<b1.h> w() {
        return this.f32585f;
    }

    @Override // y1.h
    public void x(w wVar, long j10, f1 f1Var, j2.f fVar) {
        p.h(wVar, "canvas");
        h E = E();
        E.b(j10);
        E.c(f1Var);
        E.d(fVar);
        Canvas c10 = c1.c.c(wVar);
        if (m()) {
            c10.save();
            c10.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f32584e.C(c10);
        if (m()) {
            c10.restore();
        }
    }

    public final s z(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12) {
        return new s(this.f32580a.e(), getWidth(), E(), i10, truncateAt, this.f32580a.i(), 1.0f, 0.0f, d.b(this.f32580a.h()), true, i12, 0, 0, i11, null, null, this.f32580a.g(), 55424, null);
    }
}
