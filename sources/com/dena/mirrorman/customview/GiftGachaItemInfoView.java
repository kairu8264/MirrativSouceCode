package com.dena.mirrorman.customview;

import ae.oa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import c3.a;
import jo.p;
import nd.b1;
import nd.f1;
import nd.w0;

/* loaded from: classes2.dex */
public final class GiftGachaItemInfoView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final oa f25366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGachaItemInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25366w = (oa) f.e(LayoutInflater.from(getContext()), b1.view_gift_gacha_item_info, this, true);
    }

    public final void a(int i10, String str, int i11) {
        p.h(str, "infoText");
        this.f25366w.C.setStarCountAndApply(i10);
        oa oaVar = this.f25366w;
        oaVar.B.setTextColor(a.d(oaVar.u().getContext(), i11));
        this.f25366w.B.setText(str);
    }

    public final void b(int i10, boolean z10, boolean z11, int i11) {
        this.f25366w.C.setStarCountAndApply(i11);
        if (z11) {
            oa oaVar = this.f25366w;
            oaVar.B.setTextColor(a.d(oaVar.u().getContext(), w0.f42231f0));
            this.f25366w.B.setText(getResources().getString(f1.f42000z2));
        } else if (z10) {
            oa oaVar2 = this.f25366w;
            oaVar2.B.setTextColor(a.d(oaVar2.u().getContext(), w0.sunYellow));
            this.f25366w.B.setText(getResources().getString(f1.text_giftgacha_duplicated_point_1, String.valueOf(i10)));
        } else {
            oa oaVar3 = this.f25366w;
            oaVar3.B.setTextColor(a.d(oaVar3.u().getContext(), w0.Y));
            this.f25366w.B.setText(getResources().getString(f1.N1));
        }
    }
}
