package com.dena.mirrorman.customview;

import ae.sl;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import io.l;
import jo.p;
import jo.q;
import nd.b1;
import ud.p2;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class PartTextTutorialView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final sl f25561w;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f25562w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(1);
            this.f25562w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            this.f25562w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartTextTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25561w = (sl) f.e(LayoutInflater.from(getContext()), b1.view_part_text_tutorial, this, true);
    }

    public final void a(p2 p2Var) {
        p.h(p2Var, "bindModel");
        this.f25561w.G.setText(p2Var.b());
        this.f25561w.E.setText(p2Var.a());
    }

    public final void setOnCloseImageViewListener(io.a<v> aVar) {
        p.h(aVar, "listener");
        AppCompatImageView appCompatImageView = this.f25561w.D;
        p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new a(aVar));
    }
}
