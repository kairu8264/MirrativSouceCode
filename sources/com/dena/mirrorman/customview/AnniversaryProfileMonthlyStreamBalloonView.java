package com.dena.mirrorman.customview;

import ae.k8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.net.api.response.user.Anniversary;
import com.dena.mirrorman.net.api.response.user.AnniversaryType;
import jo.p;
import nd.b1;
import nd.y0;

/* loaded from: classes2.dex */
public final class AnniversaryProfileMonthlyStreamBalloonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final k8 f25301w;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25302a;

        static {
            int[] iArr = new int[AnniversaryType.values().length];
            iArr[AnniversaryType.MASTER_MONTHLY_CONTINUOUS.ordinal()] = 1;
            iArr[AnniversaryType.SUPER_MONTHLY_CONTINUOUS.ordinal()] = 2;
            iArr[AnniversaryType.EXTREME_MONTHLY_CONTINUOUS.ordinal()] = 3;
            f25302a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnniversaryProfileMonthlyStreamBalloonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25301w = (k8) f.e(LayoutInflater.from(getContext()), b1.view_anniversary_profile_monthly_stream_balloon, this, true);
    }

    public final void a(Anniversary anniversary) {
        p.h(anniversary, "anniversary");
        AnniversaryType type = anniversary.getType();
        int i10 = type == null ? -1 : a.f25302a[type.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            this.f25301w.F.setVisibility(8);
            return;
        }
        this.f25301w.F.setVisibility(0);
        this.f25301w.D.setText(String.valueOf(anniversary.getCount()));
        if (anniversary.getType() == AnniversaryType.MASTER_MONTHLY_CONTINUOUS) {
            this.f25301w.C.setImageResource(y0.popup_master_continuous_badge);
        }
        if (anniversary.getType() == AnniversaryType.SUPER_MONTHLY_CONTINUOUS) {
            this.f25301w.C.setImageResource(y0.popup_super_continuous_badge);
        }
        if (anniversary.getType() == AnniversaryType.EXTREME_MONTHLY_CONTINUOUS) {
            this.f25301w.C.setImageResource(y0.popup_extreme_continuous_badge);
        }
    }
}
