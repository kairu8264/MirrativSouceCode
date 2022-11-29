package com.dena.mirrorman.customview;

import ae.on;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrorman.base.WebViewActivity;
import io.l;
import jo.p;
import jo.q;
import ud.y4;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class UserProfileYellStatusConditionView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final on f25624w;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f25625w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserProfileYellStatusConditionView f25626x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y4 f25627y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar, UserProfileYellStatusConditionView userProfileYellStatusConditionView, y4 y4Var) {
            super(1);
            this.f25625w = aVar;
            this.f25626x = userProfileYellStatusConditionView;
            this.f25627y = y4Var;
        }

        public final void a(View view) {
            p.h(view, "it");
            this.f25625w.invoke();
            Context context = this.f25626x.getContext();
            WebViewActivity.a aVar = WebViewActivity.X;
            Context context2 = this.f25626x.getContext();
            p.g(context2, "context");
            context.startActivity(WebViewActivity.a.b(aVar, context2, this.f25627y.n(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileYellStatusConditionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        on T = on.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f25624w = T;
    }

    public final void a(y4 y4Var, io.a<v> aVar) {
        p.h(y4Var, "bindModel");
        p.h(aVar, "onClickLpButton");
        AppCompatImageView appCompatImageView = this.f25624w.f1453k0;
        p.g(appCompatImageView, "binding.yellStatusLpButtonImageView");
        g1.a(appCompatImageView, new a(aVar, this, y4Var));
        this.f25624w.f1443a0.setImageDrawable(c3.a.f(getContext(), y4Var.p().o()));
        this.f25624w.X.setText(y4Var.m());
        this.f25624w.f1444b0.setText(getContext().getString(y4Var.p().i()));
        this.f25624w.f1444b0.setTextSize(2, y4Var.q());
        this.f25624w.f1444b0.setTextColor(c3.a.d(getContext(), y4Var.p().p()));
        this.f25624w.f1456n0.setText(y4Var.o());
        this.f25624w.C.a(y4Var.b());
        this.f25624w.B.a(y4Var.a());
        this.f25624w.F.a(y4Var.d());
        this.f25624w.E.a(y4Var.c());
        this.f25624w.H.a(y4Var.f());
        this.f25624w.G.a(y4Var.e());
        this.f25624w.K.a(y4Var.h());
        this.f25624w.J.a(y4Var.g());
        this.f25624w.M.a(y4Var.j());
        this.f25624w.L.a(y4Var.i());
        this.f25624w.P.a(y4Var.l());
        this.f25624w.O.a(y4Var.k());
        this.f25624w.f1452j0.setVisibility(y4Var.r() ? 0 : 8);
        this.f25624w.f1446d0.setVisibility(y4Var.s() ? 0 : 8);
        this.f25624w.V.setVisibility(y4Var.s() ? 0 : 8);
        this.f25624w.f1448f0.setVisibility(y4Var.t() ? 0 : 8);
        this.f25624w.W.setVisibility(y4Var.t() ? 0 : 8);
        this.f25624w.f1451i0.setVisibility(y4Var.u() ? 0 : 8);
        this.f25624w.f1456n0.setVisibility(y4Var.v() ? 0 : 8);
        this.f25624w.f1455m0.setVisibility(y4Var.w() ? 0 : 8);
    }
}
