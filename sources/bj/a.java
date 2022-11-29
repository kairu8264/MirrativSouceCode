package bj;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import o3.c0;
import qj.c;
import tj.g;
import tj.k;
import tj.n;
import wi.b;
import wi.l;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f18474t;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f18475a;

    /* renamed from: b  reason: collision with root package name */
    public k f18476b;

    /* renamed from: c  reason: collision with root package name */
    public int f18477c;

    /* renamed from: d  reason: collision with root package name */
    public int f18478d;

    /* renamed from: e  reason: collision with root package name */
    public int f18479e;

    /* renamed from: f  reason: collision with root package name */
    public int f18480f;

    /* renamed from: g  reason: collision with root package name */
    public int f18481g;

    /* renamed from: h  reason: collision with root package name */
    public int f18482h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f18483i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f18484j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f18485k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f18486l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f18487m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18488n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18489o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f18490p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f18491q;

    /* renamed from: r  reason: collision with root package name */
    public LayerDrawable f18492r;

    /* renamed from: s  reason: collision with root package name */
    public int f18493s;

    static {
        f18474t = Build.VERSION.SDK_INT >= 21;
    }

    public a(MaterialButton materialButton, k kVar) {
        this.f18475a = materialButton;
        this.f18476b = kVar;
    }

    public void A(ColorStateList colorStateList) {
        if (this.f18485k != colorStateList) {
            this.f18485k = colorStateList;
            I();
        }
    }

    public void B(int i10) {
        if (this.f18482h != i10) {
            this.f18482h = i10;
            I();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.f18484j != colorStateList) {
            this.f18484j = colorStateList;
            if (f() != null) {
                g3.a.o(f(), this.f18484j);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.f18483i != mode) {
            this.f18483i = mode;
            if (f() == null || this.f18483i == null) {
                return;
            }
            g3.a.p(f(), this.f18483i);
        }
    }

    public final void E(int i10, int i11) {
        int J = c0.J(this.f18475a);
        int paddingTop = this.f18475a.getPaddingTop();
        int I = c0.I(this.f18475a);
        int paddingBottom = this.f18475a.getPaddingBottom();
        int i12 = this.f18479e;
        int i13 = this.f18480f;
        this.f18480f = i11;
        this.f18479e = i10;
        if (!this.f18489o) {
            F();
        }
        c0.G0(this.f18475a, J, (paddingTop + i10) - i12, I, (paddingBottom + i11) - i13);
    }

    public final void F() {
        this.f18475a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.X(this.f18493s);
        }
    }

    public final void G(k kVar) {
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public void H(int i10, int i11) {
        Drawable drawable = this.f18487m;
        if (drawable != null) {
            drawable.setBounds(this.f18477c, this.f18479e, i11 - this.f18478d, i10 - this.f18480f);
        }
    }

    public final void I() {
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.g0(this.f18482h, this.f18485k);
            if (n10 != null) {
                n10.f0(this.f18482h, this.f18488n ? hj.a.c(this.f18475a, b.f58778o) : 0);
            }
        }
    }

    public final InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f18477c, this.f18479e, this.f18478d, this.f18480f);
    }

    public final Drawable a() {
        g gVar = new g(this.f18476b);
        gVar.N(this.f18475a.getContext());
        g3.a.o(gVar, this.f18484j);
        PorterDuff.Mode mode = this.f18483i;
        if (mode != null) {
            g3.a.p(gVar, mode);
        }
        gVar.g0(this.f18482h, this.f18485k);
        g gVar2 = new g(this.f18476b);
        gVar2.setTint(0);
        gVar2.f0(this.f18482h, this.f18488n ? hj.a.c(this.f18475a, b.f58778o) : 0);
        if (f18474t) {
            g gVar3 = new g(this.f18476b);
            this.f18487m = gVar3;
            g3.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(rj.b.d(this.f18486l), J(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f18487m);
            this.f18492r = rippleDrawable;
            return rippleDrawable;
        }
        rj.a aVar = new rj.a(this.f18476b);
        this.f18487m = aVar;
        g3.a.o(aVar, rj.b.d(this.f18486l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f18487m});
        this.f18492r = layerDrawable;
        return J(layerDrawable);
    }

    public int b() {
        return this.f18481g;
    }

    public int c() {
        return this.f18480f;
    }

    public int d() {
        return this.f18479e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f18492r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f18492r.getNumberOfLayers() > 2) {
            return (n) this.f18492r.getDrawable(2);
        }
        return (n) this.f18492r.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z10) {
        LayerDrawable layerDrawable = this.f18492r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f18474t) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f18492r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return (g) this.f18492r.getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f18486l;
    }

    public k i() {
        return this.f18476b;
    }

    public ColorStateList j() {
        return this.f18485k;
    }

    public int k() {
        return this.f18482h;
    }

    public ColorStateList l() {
        return this.f18484j;
    }

    public PorterDuff.Mode m() {
        return this.f18483i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f18489o;
    }

    public boolean p() {
        return this.f18491q;
    }

    public void q(TypedArray typedArray) {
        this.f18477c = typedArray.getDimensionPixelOffset(l.V2, 0);
        this.f18478d = typedArray.getDimensionPixelOffset(l.W2, 0);
        this.f18479e = typedArray.getDimensionPixelOffset(l.X2, 0);
        this.f18480f = typedArray.getDimensionPixelOffset(l.Y2, 0);
        int i10 = l.f58952c3;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f18481g = dimensionPixelSize;
            y(this.f18476b.w(dimensionPixelSize));
            this.f18490p = true;
        }
        this.f18482h = typedArray.getDimensionPixelSize(l.f59042m3, 0);
        this.f18483i = nj.l.e(typedArray.getInt(l.f58943b3, -1), PorterDuff.Mode.SRC_IN);
        this.f18484j = c.a(this.f18475a.getContext(), typedArray, l.f58934a3);
        this.f18485k = c.a(this.f18475a.getContext(), typedArray, l.f59033l3);
        this.f18486l = c.a(this.f18475a.getContext(), typedArray, l.f59024k3);
        this.f18491q = typedArray.getBoolean(l.Z2, false);
        this.f18493s = typedArray.getDimensionPixelSize(l.f58961d3, 0);
        int J = c0.J(this.f18475a);
        int paddingTop = this.f18475a.getPaddingTop();
        int I = c0.I(this.f18475a);
        int paddingBottom = this.f18475a.getPaddingBottom();
        if (typedArray.hasValue(l.U2)) {
            s();
        } else {
            F();
        }
        c0.G0(this.f18475a, J + this.f18477c, paddingTop + this.f18479e, I + this.f18478d, paddingBottom + this.f18480f);
    }

    public void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void s() {
        this.f18489o = true;
        this.f18475a.setSupportBackgroundTintList(this.f18484j);
        this.f18475a.setSupportBackgroundTintMode(this.f18483i);
    }

    public void t(boolean z10) {
        this.f18491q = z10;
    }

    public void u(int i10) {
        if (this.f18490p && this.f18481g == i10) {
            return;
        }
        this.f18481g = i10;
        this.f18490p = true;
        y(this.f18476b.w(i10));
    }

    public void v(int i10) {
        E(this.f18479e, i10);
    }

    public void w(int i10) {
        E(i10, this.f18480f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f18486l != colorStateList) {
            this.f18486l = colorStateList;
            boolean z10 = f18474t;
            if (z10 && (this.f18475a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f18475a.getBackground()).setColor(rj.b.d(colorStateList));
            } else if (z10 || !(this.f18475a.getBackground() instanceof rj.a)) {
            } else {
                ((rj.a) this.f18475a.getBackground()).setTintList(rj.b.d(colorStateList));
            }
        }
    }

    public void y(k kVar) {
        this.f18476b = kVar;
        G(kVar);
    }

    public void z(boolean z10) {
        this.f18488n = z10;
        I();
    }
}
