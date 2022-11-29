package com.dena.mirrorman.customview;

import ae.il;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.MyPageContinuousLivePromotionView;
import io.a;
import jo.p;
import nd.b1;
import ud.m2;
import wn.v;

/* loaded from: classes2.dex */
public final class MyPageContinuousLivePromotionView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final il f25539w;

    /* renamed from: x  reason: collision with root package name */
    public a<v> f25540x;

    /* renamed from: y  reason: collision with root package name */
    public a<v> f25541y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyPageContinuousLivePromotionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25539w = (il) f.e(LayoutInflater.from(getContext()), b1.view_my_page_continuous_live_promotion, this, true);
    }

    public static final void e(MyPageContinuousLivePromotionView myPageContinuousLivePromotionView, View view) {
        p.h(myPageContinuousLivePromotionView, "this$0");
        a<v> aVar = myPageContinuousLivePromotionView.f25541y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void f(MyPageContinuousLivePromotionView myPageContinuousLivePromotionView, View view) {
        p.h(myPageContinuousLivePromotionView, "this$0");
        a<v> aVar = myPageContinuousLivePromotionView.f25540x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void g(MyPageContinuousLivePromotionView myPageContinuousLivePromotionView, View view) {
        p.h(myPageContinuousLivePromotionView, "this$0");
        a<v> aVar = myPageContinuousLivePromotionView.f25540x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void d(m2 m2Var) {
        p.h(m2Var, "bindModel");
        this.f25539w.T(m2Var);
        this.f25539w.D.setOnClickListener(new View.OnClickListener() { // from class: yd.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageContinuousLivePromotionView.e(MyPageContinuousLivePromotionView.this, view);
            }
        });
        this.f25539w.C.setOnClickListener(new View.OnClickListener() { // from class: yd.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageContinuousLivePromotionView.f(MyPageContinuousLivePromotionView.this, view);
            }
        });
        this.f25539w.E.setOnClickListener(new View.OnClickListener() { // from class: yd.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageContinuousLivePromotionView.g(MyPageContinuousLivePromotionView.this, view);
            }
        });
    }

    public final a<v> getOnClickContinuousListener() {
        return this.f25541y;
    }

    public final a<v> getOnClickHelpListener() {
        return this.f25540x;
    }

    public final void setOnClickContinuousListener(a<v> aVar) {
        this.f25541y = aVar;
    }

    public final void setOnClickHelpListener(a<v> aVar) {
        this.f25540x = aVar;
    }
}
