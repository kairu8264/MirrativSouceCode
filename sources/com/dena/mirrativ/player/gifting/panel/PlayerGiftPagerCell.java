package com.dena.mirrativ.player.gifting.panel;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import de.n;
import hb.b2;
import hb.q1;
import hb.t1;
import hb.x1;
import io.l;
import java.util.Arrays;
import jf.q;
import jo.h;
import jo.i0;
import jo.p;
import kb.z;
import wn.v;

/* loaded from: classes2.dex */
public final class PlayerGiftPagerCell extends ConstraintLayout {
    public final z U;
    public q V;
    public l<? super q, v> W;

    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PlayerGiftPagerCell.this.getOnProgressAnimationEnd().invoke(PlayerGiftPagerCell.this.V);
            PlayerGiftPagerCell.this.x();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements l<q, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f22697w = new b();

        public b() {
            super(1);
        }

        public final void a(q qVar) {
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(q qVar) {
            a(qVar);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerGiftPagerCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ PlayerGiftPagerCell(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final q getGift() {
        return this.V;
    }

    public final l<q, v> getOnProgressAnimationEnd() {
        return this.W;
    }

    public final void setOnProgressAnimationEnd(l<? super q, v> lVar) {
        p.h(lVar, "<set-?>");
        this.W = lVar;
    }

    public final void x() {
        this.U.J.setVisibility(0);
        this.U.M.h();
        this.U.M.setVisibility(8);
        this.U.I.setVisibility(8);
    }

    public final void y(q qVar, boolean z10) {
        p.h(qVar, "gift");
        q qVar2 = this.V;
        if (qVar2 != null && p.c(qVar2.h(), qVar.h()) && qVar.g() && !qVar2.g()) {
            setEnabled(false);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), q1.f34954c);
            loadAnimation.setDuration(300L);
            loadAnimation.setFillAfter(true);
            startAnimation(loadAnimation);
        }
        if (!qVar.g() && !isEnabled()) {
            setEnabled(true);
            Animation animation = getAnimation();
            if (animation != null) {
                animation.cancel();
            }
        }
        this.V = qVar;
        setVisibility(0);
        x();
        if (z10) {
            this.U.J.setPadding(0, 0, 0, 0);
        } else {
            this.U.J.setPadding(0, n.b(this, 10), 0, 0);
        }
        String j10 = qVar.j();
        if (j10 == null || j10.length() == 0) {
            this.U.K.setVisibility(8);
            this.U.L.setVisibility(8);
        } else {
            this.U.K.setVisibility(0);
            this.U.L.setVisibility(0);
        }
        ImageView imageView = this.U.J;
        p.g(imageView, "binding.giftImageView");
        td.a.f(imageView, qVar.o());
        if (qVar.d().length() > 0) {
            AppCompatImageView appCompatImageView = this.U.B;
            p.g(appCompatImageView, "binding.bonusImageView");
            td.a.f(appCompatImageView, qVar.d());
            this.U.B.setVisibility(0);
        } else {
            this.U.B.setVisibility(8);
        }
        if (qVar.f().length() > 0) {
            AppCompatImageView appCompatImageView2 = this.U.G;
            p.g(appCompatImageView2, "binding.eventIconImageView");
            td.a.t(appCompatImageView2, qVar.f(), 5, 1, Integer.valueOf(t1.f34977r));
            this.U.F.setVisibility(0);
        } else {
            this.U.F.setVisibility(8);
        }
        if (qVar.s()) {
            this.U.E.setTextColor(getResources().getColor(t1.f34969j, null));
            AppCompatTextView appCompatTextView = this.U.E;
            i0 i0Var = i0.f38149a;
            String string = getResources().getString(b2.text_gift_panel_paid_coins);
            p.g(string, "resources.getString(R.st…xt_gift_panel_paid_coins)");
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(qVar.e())}, 1));
            p.g(format, "format(format, *args)");
            String format2 = String.format(string, Arrays.copyOf(new Object[]{format}, 1));
            p.g(format2, "format(format, *args)");
            appCompatTextView.setText(format2);
            return;
        }
        this.U.E.setTextColor(getResources().getColor(t1.gift_panel_free_coins_text_color, null));
        AppCompatTextView appCompatTextView2 = this.U.E;
        i0 i0Var2 = i0.f38149a;
        String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(qVar.e())}, 1));
        p.g(format3, "format(format, *args)");
        appCompatTextView2.setText(format3);
    }

    public final void z() {
        this.U.J.setVisibility(4);
        this.U.M.setVisibility(0);
        this.U.M.setProgress(0.0f);
        this.U.M.r();
        q qVar = this.V;
        if (qVar == null || qVar.p() <= 1) {
            return;
        }
        this.U.I.setCount(qVar.p());
        this.U.I.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerGiftPagerCell(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        z zVar = (z) f.e(LayoutInflater.from(context), x1.item_player_gift_pager_cell, this, true);
        this.U = zVar;
        this.W = b.f22697w;
        setVisibility(4);
        zVar.M.setAnimation("circle_progressbar_ja.json");
        zVar.M.e(new a());
    }
}
