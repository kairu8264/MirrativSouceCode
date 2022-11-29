package com.dena.mirrorman.customview;

import ae.gk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import io.a;
import jo.h;
import jo.p;
import nd.b1;
import wn.v;

/* loaded from: classes2.dex */
public final class LiveCatalogStreamerView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final gk f25471w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveCatalogStreamerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LiveCatalogStreamerView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void e(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public static final void f(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public final void c(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "profileImageUrl");
        p.h(str2, "userName");
        AppCompatImageView appCompatImageView = this.f25471w.F;
        p.g(appCompatImageView, "binding.profileImageView");
        td.a.i(appCompatImageView, str);
        AppCompatImageView appCompatImageView2 = this.f25471w.B;
        p.g(appCompatImageView2, "binding.continuousStreamerBadgeImageView");
        td.a.f(appCompatImageView2, str4);
        this.f25471w.E.setText(str3);
        if (str3 == null && str5 == null) {
            this.f25471w.C.setVisibility(8);
        } else {
            this.f25471w.C.setVisibility(0);
        }
        if (str5 != null) {
            this.f25471w.D.setVisibility(0);
            AppCompatImageView appCompatImageView3 = this.f25471w.D;
            p.g(appCompatImageView3, "binding.continuousStreamerLabelImageView");
            td.a.f(appCompatImageView3, str5);
        } else {
            this.f25471w.D.setVisibility(8);
        }
        this.f25471w.G.setText(str2);
    }

    public final void setOnProfileClickListener(final a<v> aVar) {
        p.h(aVar, "listener");
        this.f25471w.F.setOnClickListener(new View.OnClickListener() { // from class: yd.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveCatalogStreamerView.e(io.a.this, view);
            }
        });
        this.f25471w.G.setOnClickListener(new View.OnClickListener() { // from class: yd.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveCatalogStreamerView.f(io.a.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCatalogStreamerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25471w = (gk) f.e(LayoutInflater.from(getContext()), b1.view_live_catalog_streamer, this, true);
    }
}
