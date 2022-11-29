package com.dena.mirrorman.customview;

import ae.m8;
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
public final class AnniversaryStreamBalloonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final m8 f25303w;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25304a;

        static {
            int[] iArr = new int[AnniversaryType.values().length];
            iArr[AnniversaryType.NORMAL_CONTINUOUS.ordinal()] = 1;
            iArr[AnniversaryType.MASTER_CONTINUOUS.ordinal()] = 2;
            iArr[AnniversaryType.SUPER_CONTINUOUS.ordinal()] = 3;
            iArr[AnniversaryType.EXTREME_CONTINUOUS.ordinal()] = 4;
            iArr[AnniversaryType.MASTER_MONTHLY_CONTINUOUS.ordinal()] = 5;
            iArr[AnniversaryType.SUPER_MONTHLY_CONTINUOUS.ordinal()] = 6;
            iArr[AnniversaryType.EXTREME_MONTHLY_CONTINUOUS.ordinal()] = 7;
            f25304a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnniversaryStreamBalloonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25303w = (m8) f.e(LayoutInflater.from(getContext()), b1.view_anniversary_stream_balloon, this, true);
    }

    public final void a(Anniversary anniversary, boolean z10) {
        p.h(anniversary, "anniversary");
        AnniversaryType type = anniversary.getType();
        switch (type == null ? -1 : a.f25304a[type.ordinal()]) {
            case 1:
                this.f25303w.D.setVisibility(0);
                if (z10) {
                    this.f25303w.D.setImageResource(y0.bg_mypage_anniversary_normal_popup);
                    return;
                } else {
                    this.f25303w.D.setImageResource(y0.bg_profile_anniversary_normal_popup);
                    return;
                }
            case 2:
                this.f25303w.D.setVisibility(0);
                if (z10) {
                    this.f25303w.D.setImageResource(y0.bg_mypage_anniversary_master_popup);
                    return;
                } else {
                    this.f25303w.D.setImageResource(y0.bg_profile_anniversary_master_popup);
                    return;
                }
            case 3:
                this.f25303w.D.setVisibility(0);
                if (z10) {
                    this.f25303w.D.setImageResource(y0.bg_mypage_anniversary_super_popup);
                    return;
                } else {
                    this.f25303w.D.setImageResource(y0.bg_profile_anniversary_super_popup);
                    return;
                }
            case 4:
                this.f25303w.D.setVisibility(0);
                if (z10) {
                    this.f25303w.D.setImageResource(y0.bg_mypage_anniversary_extreme_popup);
                    return;
                } else {
                    this.f25303w.D.setImageResource(y0.bg_profile_anniversary_extreme_popup);
                    return;
                }
            case 5:
            case 6:
            case 7:
                if (z10) {
                    this.f25303w.B.setVisibility(0);
                    this.f25303w.B.a(anniversary);
                    return;
                }
                this.f25303w.C.setVisibility(0);
                this.f25303w.C.a(anniversary);
                return;
            default:
                this.f25303w.D.setVisibility(8);
                this.f25303w.B.setVisibility(8);
                this.f25303w.C.setVisibility(8);
                return;
        }
    }
}
