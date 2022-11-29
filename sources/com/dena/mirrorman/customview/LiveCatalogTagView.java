package com.dena.mirrorman.customview;

import ae.ik;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import com.dena.mirrorman.net.api.response.live.LiveTag;
import de.n;
import jo.h;
import jo.p;
import nd.b1;
import nd.h1;
import td.a;

/* loaded from: classes2.dex */
public final class LiveCatalogTagView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ik f25472w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveCatalogTagView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ LiveCatalogTagView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void a(LiveTag liveTag) {
        p.h(liveTag, "liveTag");
        AppCompatImageView appCompatImageView = this.f25472w.B;
        p.g(appCompatImageView, "binding.tagImageView");
        a.d(appCompatImageView, liveTag.getTagIconUrl());
        this.f25472w.C.setText(liveTag.getTagText());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveCatalogTagView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        ik ikVar = (ik) f.e(LayoutInflater.from(getContext()), b1.view_live_catalog_tag, this, true);
        this.f25472w = ikVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.f42136u1, 0, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(h1.f42142v1, n.b(this, 20));
            ikVar.B.getLayoutParams().width = dimensionPixelSize;
            ikVar.B.getLayoutParams().height = dimensionPixelSize;
            float dimension = obtainStyledAttributes.getDimension(h1.f42148w1, 0.0f);
            if (!(dimension == 0.0f)) {
                ikVar.C.setTextSize(0, dimension);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
