package com.dena.mirrativ.catalog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import r8.f1;
import t8.c2;
import wn.v;
import yd.g1;

/* loaded from: classes.dex */
public final class LiveCatalogSmallStreamerView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final c2 f20389w;

    /* loaded from: classes.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f20390w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(1);
            this.f20390w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            this.f20390w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f20391w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a<v> aVar) {
            super(1);
            this.f20391w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            this.f20391w.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveCatalogSmallStreamerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LiveCatalogSmallStreamerView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "profileImageUrl");
        p.h(str2, "userName");
        AppCompatImageView appCompatImageView = this.f20389w.F;
        p.g(appCompatImageView, "binding.profileImageView");
        td.a.i(appCompatImageView, str);
        AppCompatImageView appCompatImageView2 = this.f20389w.B;
        p.g(appCompatImageView2, "binding.continuousStreamerBadgeImageView");
        td.a.f(appCompatImageView2, str4);
        this.f20389w.E.setText(str3);
        if (str3 == null && str5 == null) {
            this.f20389w.C.setVisibility(8);
        } else {
            this.f20389w.C.setVisibility(0);
        }
        if (str5 != null) {
            this.f20389w.D.setVisibility(0);
            AppCompatImageView appCompatImageView3 = this.f20389w.D;
            p.g(appCompatImageView3, "binding.continuousStreamerLabelImageView");
            td.a.f(appCompatImageView3, str5);
        } else {
            this.f20389w.D.setVisibility(8);
        }
        this.f20389w.G.setText(str2);
    }

    public final void setOnProfileClickListener(io.a<v> aVar) {
        p.h(aVar, "listener");
        AppCompatImageView appCompatImageView = this.f20389w.F;
        p.g(appCompatImageView, "binding.profileImageView");
        g1.a(appCompatImageView, new a(aVar));
        AppCompatTextView appCompatTextView = this.f20389w.G;
        p.g(appCompatTextView, "binding.userNameTextView");
        g1.a(appCompatTextView, new b(aVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCatalogSmallStreamerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f20389w = (c2) f.e(LayoutInflater.from(getContext()), f1.view_live_catalog_small_streamer, this, true);
    }
}
