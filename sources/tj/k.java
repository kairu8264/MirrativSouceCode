package tj;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final tj.c f53697m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public d f53698a;

    /* renamed from: b  reason: collision with root package name */
    public d f53699b;

    /* renamed from: c  reason: collision with root package name */
    public d f53700c;

    /* renamed from: d  reason: collision with root package name */
    public d f53701d;

    /* renamed from: e  reason: collision with root package name */
    public tj.c f53702e;

    /* renamed from: f  reason: collision with root package name */
    public tj.c f53703f;

    /* renamed from: g  reason: collision with root package name */
    public tj.c f53704g;

    /* renamed from: h  reason: collision with root package name */
    public tj.c f53705h;

    /* renamed from: i  reason: collision with root package name */
    public f f53706i;

    /* renamed from: j  reason: collision with root package name */
    public f f53707j;

    /* renamed from: k  reason: collision with root package name */
    public f f53708k;

    /* renamed from: l  reason: collision with root package name */
    public f f53709l;

    /* loaded from: classes3.dex */
    public interface c {
        tj.c a(tj.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    public static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new tj.a(i12));
    }

    public static b d(Context context, int i10, int i11, tj.c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, wi.l.R4);
        try {
            int i12 = obtainStyledAttributes.getInt(wi.l.S4, 0);
            int i13 = obtainStyledAttributes.getInt(wi.l.V4, i12);
            int i14 = obtainStyledAttributes.getInt(wi.l.W4, i12);
            int i15 = obtainStyledAttributes.getInt(wi.l.U4, i12);
            int i16 = obtainStyledAttributes.getInt(wi.l.T4, i12);
            tj.c m10 = m(obtainStyledAttributes, wi.l.X4, cVar);
            tj.c m11 = m(obtainStyledAttributes, wi.l.f58936a5, m10);
            tj.c m12 = m(obtainStyledAttributes, wi.l.f58945b5, m10);
            tj.c m13 = m(obtainStyledAttributes, wi.l.Z4, m10);
            return new b().B(i13, m11).F(i14, m12).v(i15, m13).r(i16, m(obtainStyledAttributes, wi.l.Y4, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new tj.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, tj.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.l.f58944b4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(wi.l.f58953c4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(wi.l.f58962d4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    public static tj.c m(TypedArray typedArray, int i10, tj.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new tj.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f53708k;
    }

    public d i() {
        return this.f53701d;
    }

    public tj.c j() {
        return this.f53705h;
    }

    public d k() {
        return this.f53700c;
    }

    public tj.c l() {
        return this.f53704g;
    }

    public f n() {
        return this.f53709l;
    }

    public f o() {
        return this.f53707j;
    }

    public f p() {
        return this.f53706i;
    }

    public d q() {
        return this.f53698a;
    }

    public tj.c r() {
        return this.f53702e;
    }

    public d s() {
        return this.f53699b;
    }

    public tj.c t() {
        return this.f53703f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f53709l.getClass().equals(f.class) && this.f53707j.getClass().equals(f.class) && this.f53706i.getClass().equals(f.class) && this.f53708k.getClass().equals(f.class);
        float a10 = this.f53702e.a(rectF);
        return z10 && ((this.f53703f.a(rectF) > a10 ? 1 : (this.f53703f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f53705h.a(rectF) > a10 ? 1 : (this.f53705h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f53704g.a(rectF) > a10 ? 1 : (this.f53704g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f53699b instanceof j) && (this.f53698a instanceof j) && (this.f53700c instanceof j) && (this.f53701d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(tj.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().E(cVar.a(r())).I(cVar.a(t())).u(cVar.a(j())).y(cVar.a(l())).m();
    }

    public k(b bVar) {
        this.f53698a = bVar.f53710a;
        this.f53699b = bVar.f53711b;
        this.f53700c = bVar.f53712c;
        this.f53701d = bVar.f53713d;
        this.f53702e = bVar.f53714e;
        this.f53703f = bVar.f53715f;
        this.f53704g = bVar.f53716g;
        this.f53705h = bVar.f53717h;
        this.f53706i = bVar.f53718i;
        this.f53707j = bVar.f53719j;
        this.f53708k = bVar.f53720k;
        this.f53709l = bVar.f53721l;
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public d f53710a;

        /* renamed from: b  reason: collision with root package name */
        public d f53711b;

        /* renamed from: c  reason: collision with root package name */
        public d f53712c;

        /* renamed from: d  reason: collision with root package name */
        public d f53713d;

        /* renamed from: e  reason: collision with root package name */
        public tj.c f53714e;

        /* renamed from: f  reason: collision with root package name */
        public tj.c f53715f;

        /* renamed from: g  reason: collision with root package name */
        public tj.c f53716g;

        /* renamed from: h  reason: collision with root package name */
        public tj.c f53717h;

        /* renamed from: i  reason: collision with root package name */
        public f f53718i;

        /* renamed from: j  reason: collision with root package name */
        public f f53719j;

        /* renamed from: k  reason: collision with root package name */
        public f f53720k;

        /* renamed from: l  reason: collision with root package name */
        public f f53721l;

        public b() {
            this.f53710a = h.b();
            this.f53711b = h.b();
            this.f53712c = h.b();
            this.f53713d = h.b();
            this.f53714e = new tj.a(0.0f);
            this.f53715f = new tj.a(0.0f);
            this.f53716g = new tj.a(0.0f);
            this.f53717h = new tj.a(0.0f);
            this.f53718i = h.c();
            this.f53719j = h.c();
            this.f53720k = h.c();
            this.f53721l = h.c();
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f53696a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f53665a;
            }
            return -1.0f;
        }

        public b A(f fVar) {
            this.f53718i = fVar;
            return this;
        }

        public b B(int i10, tj.c cVar) {
            return C(h.a(i10)).E(cVar);
        }

        public b C(d dVar) {
            this.f53710a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                D(n10);
            }
            return this;
        }

        public b D(float f10) {
            this.f53714e = new tj.a(f10);
            return this;
        }

        public b E(tj.c cVar) {
            this.f53714e = cVar;
            return this;
        }

        public b F(int i10, tj.c cVar) {
            return G(h.a(i10)).I(cVar);
        }

        public b G(d dVar) {
            this.f53711b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                H(n10);
            }
            return this;
        }

        public b H(float f10) {
            this.f53715f = new tj.a(f10);
            return this;
        }

        public b I(tj.c cVar) {
            this.f53715f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return D(f10).H(f10).x(f10).t(f10);
        }

        public b p(tj.c cVar) {
            return E(cVar).I(cVar).y(cVar).u(cVar);
        }

        public b q(f fVar) {
            this.f53720k = fVar;
            return this;
        }

        public b r(int i10, tj.c cVar) {
            return s(h.a(i10)).u(cVar);
        }

        public b s(d dVar) {
            this.f53713d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                t(n10);
            }
            return this;
        }

        public b t(float f10) {
            this.f53717h = new tj.a(f10);
            return this;
        }

        public b u(tj.c cVar) {
            this.f53717h = cVar;
            return this;
        }

        public b v(int i10, tj.c cVar) {
            return w(h.a(i10)).y(cVar);
        }

        public b w(d dVar) {
            this.f53712c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                x(n10);
            }
            return this;
        }

        public b x(float f10) {
            this.f53716g = new tj.a(f10);
            return this;
        }

        public b y(tj.c cVar) {
            this.f53716g = cVar;
            return this;
        }

        public b z(f fVar) {
            this.f53721l = fVar;
            return this;
        }

        public b(k kVar) {
            this.f53710a = h.b();
            this.f53711b = h.b();
            this.f53712c = h.b();
            this.f53713d = h.b();
            this.f53714e = new tj.a(0.0f);
            this.f53715f = new tj.a(0.0f);
            this.f53716g = new tj.a(0.0f);
            this.f53717h = new tj.a(0.0f);
            this.f53718i = h.c();
            this.f53719j = h.c();
            this.f53720k = h.c();
            this.f53721l = h.c();
            this.f53710a = kVar.f53698a;
            this.f53711b = kVar.f53699b;
            this.f53712c = kVar.f53700c;
            this.f53713d = kVar.f53701d;
            this.f53714e = kVar.f53702e;
            this.f53715f = kVar.f53703f;
            this.f53716g = kVar.f53704g;
            this.f53717h = kVar.f53705h;
            this.f53718i = kVar.f53706i;
            this.f53719j = kVar.f53707j;
            this.f53720k = kVar.f53708k;
            this.f53721l = kVar.f53709l;
        }
    }

    public k() {
        this.f53698a = h.b();
        this.f53699b = h.b();
        this.f53700c = h.b();
        this.f53701d = h.b();
        this.f53702e = new tj.a(0.0f);
        this.f53703f = new tj.a(0.0f);
        this.f53704g = new tj.a(0.0f);
        this.f53705h = new tj.a(0.0f);
        this.f53706i = h.c();
        this.f53707j = h.c();
        this.f53708k = h.c();
        this.f53709l = h.c();
    }
}
