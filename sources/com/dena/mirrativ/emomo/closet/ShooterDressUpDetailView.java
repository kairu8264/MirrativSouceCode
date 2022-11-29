package com.dena.mirrativ.emomo.closet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.GaugeView;
import com.google.android.material.card.MaterialCardView;
import de.n;
import io.l;
import jo.p;
import jo.q;
import q9.h;
import r9.w1;
import s9.o1;
import tj.k;
import tj.o;
import wn.v;

/* loaded from: classes.dex */
public final class ShooterDressUpDetailView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final o1 f20808w;

    /* loaded from: classes.dex */
    public static final class a extends q implements l<k.b, v> {
        public a() {
            super(1);
        }

        public final void a(k.b bVar) {
            p.h(bVar, "it");
            bVar.q(new o(n.b(ShooterDressUpDetailView.this, 4), false));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(k.b bVar) {
            a(bVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<k.b, v> {
        public b() {
            super(1);
        }

        public final void a(k.b bVar) {
            p.h(bVar, "it");
            bVar.z(new o(n.b(ShooterDressUpDetailView.this, 4), false));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(k.b bVar) {
            a(bVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements l<k.b, v> {
        public c() {
            super(1);
        }

        public final void a(k.b bVar) {
            p.h(bVar, "it");
            bVar.A(new o(n.b(ShooterDressUpDetailView.this, 4), false));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(k.b bVar) {
            a(bVar);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShooterDressUpDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f20808w = (o1) f.e(LayoutInflater.from(getContext()), h.view_shooter_dress_up_detail, this, true);
    }

    public final void a(w1 w1Var) {
        p.h(w1Var, "bindModel");
        this.f20808w.T(w1Var);
        MaterialCardView materialCardView = this.f20808w.f52526a0;
        p.g(materialCardView, "binding.powerValueChangePopupCardView");
        b(materialCardView, w1Var.i().d());
        MaterialCardView materialCardView2 = this.f20808w.f52539n0;
        p.g(materialCardView2, "binding.speedValueChangePopupCardView");
        b(materialCardView2, w1Var.m().d());
        MaterialCardView materialCardView3 = this.f20808w.f52546u0;
        p.g(materialCardView3, "binding.weightValueChangePopupCardView");
        e(materialCardView3, w1Var.o().d());
        MaterialCardView materialCardView4 = this.f20808w.D;
        p.g(materialCardView4, "binding.accelValueChangePopupCardView");
        e(materialCardView4, w1Var.a().d());
        MaterialCardView materialCardView5 = this.f20808w.I;
        p.g(materialCardView5, "binding.costumeBonusChangePopupCardView");
        d(materialCardView5, w1Var.e());
        GaugeView gaugeView = this.f20808w.Y;
        p.g(gaugeView, "binding.powerGaugeView");
        GaugeView.j(gaugeView, w1Var.i().c(), true, false, 0L, 12, null);
        GaugeView gaugeView2 = this.f20808w.f52537l0;
        p.g(gaugeView2, "binding.speedGaugeView");
        GaugeView.j(gaugeView2, w1Var.m().c(), true, false, 0L, 12, null);
        GaugeView gaugeView3 = this.f20808w.f52544s0;
        p.g(gaugeView3, "binding.weightGaugeView");
        GaugeView.j(gaugeView3, w1Var.o().c(), true, false, 0L, 12, null);
        GaugeView gaugeView4 = this.f20808w.B;
        p.g(gaugeView4, "binding.accelGaugeView");
        GaugeView.j(gaugeView4, w1Var.a().c(), true, false, 0L, 12, null);
    }

    public final void b(MaterialCardView materialCardView, int i10) {
        c(materialCardView, i10, new a());
    }

    public final void c(MaterialCardView materialCardView, int i10, l<? super k.b, v> lVar) {
        materialCardView.setCardBackgroundColor(i10);
        materialCardView.setCardElevation(n.b(this, 4));
        k.b p10 = k.a().p(new tj.a(n.b(this, 4)));
        p.g(p10, "it");
        lVar.invoke(p10);
        materialCardView.setShapeAppearanceModel(p10.m());
    }

    public final void d(MaterialCardView materialCardView, int i10) {
        c(materialCardView, i10, new b());
    }

    public final void e(MaterialCardView materialCardView, int i10) {
        c(materialCardView, i10, new c());
    }
}
