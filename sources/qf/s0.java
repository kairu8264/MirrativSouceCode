package qf;

import ae.cf;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class s0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49372b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49373c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final cf f49374a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_gift_gacha_stock, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new s0((cf) e10, null);
        }
    }

    public s0(cf cfVar) {
        super(cfVar.u());
        this.f49374a = cfVar;
    }

    public /* synthetic */ s0(cf cfVar, jo.h hVar) {
        this(cfVar);
    }

    public final void a(ud.m0 m0Var) {
        jo.p.h(m0Var, "bindModel");
        AppCompatImageView appCompatImageView = this.f49374a.G;
        jo.p.g(appCompatImageView, "binding.typeImageView");
        td.a.f(appCompatImageView, m0Var.i());
        AppCompatImageView appCompatImageView2 = this.f49374a.F;
        jo.p.g(appCompatImageView2, "binding.profileImageView");
        td.a.i(appCompatImageView2, m0Var.g());
        this.f49374a.E.setBackgroundResource(m0Var.f());
        this.f49374a.C.setVisibility(m0Var.j() ? 0 : 8);
        this.f49374a.D.setText(String.valueOf(m0Var.c()));
        this.f49374a.D.setVisibility(m0Var.c() < 2 ? 8 : 0);
    }

    public final AnimationSet b() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(true);
        Float valueOf = Float.valueOf(72.0f);
        Float valueOf2 = Float.valueOf(94.0f);
        wn.k a10 = wn.q.a(valueOf, valueOf2);
        Float valueOf3 = Float.valueOf(0.0f);
        Float valueOf4 = Float.valueOf(8.0f);
        Float valueOf5 = Float.valueOf(60.0f);
        wn.k a11 = wn.q.a(valueOf2, valueOf5);
        Float valueOf6 = Float.valueOf(16.0f);
        Float valueOf7 = Float.valueOf(80.0f);
        wn.k a12 = wn.q.a(valueOf5, valueOf7);
        Float valueOf8 = Float.valueOf(22.0f);
        Float valueOf9 = Float.valueOf(68.0f);
        wn.k a13 = wn.q.a(valueOf7, valueOf9);
        Float valueOf10 = Float.valueOf(28.0f);
        for (wn.k kVar : xn.s.m(wn.q.a(a10, wn.q.a(valueOf3, valueOf4)), wn.q.a(a11, wn.q.a(valueOf4, valueOf6)), wn.q.a(a12, wn.q.a(valueOf6, valueOf8)), wn.q.a(a13, wn.q.a(valueOf8, valueOf10)), wn.q.a(wn.q.a(valueOf9, valueOf), wn.q.a(valueOf10, Float.valueOf(34.0f))))) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, ((Number) ((wn.k) kVar.c()).d()).floatValue() / ((Number) ((wn.k) kVar.c()).c()).floatValue(), 1.0f, ((Number) ((wn.k) kVar.c()).d()).floatValue() / ((Number) ((wn.k) kVar.c()).c()).floatValue(), 1, 0.5f, 1, 0.5f);
            scaleAnimation.setStartOffset(((Number) ((wn.k) kVar.d()).c()).floatValue() * 16.7f);
            scaleAnimation.setDuration((((Number) ((wn.k) kVar.d()).d()).floatValue() - ((Number) ((wn.k) kVar.d()).c()).floatValue()) * 16.7f);
            animationSet.addAnimation(scaleAnimation);
        }
        return animationSet;
    }

    public final void c() {
        this.f49374a.B.r();
        this.f49374a.G.startAnimation(b());
    }
}
