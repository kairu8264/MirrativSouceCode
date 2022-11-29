package com.dena.mirrorman.customview;

import ae.mn;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import c3.a;
import com.dena.mirrorman.net.api.response.user.Anniversary;
import com.dena.mirrorman.net.api.response.user.AnniversaryType;
import jo.p;
import nd.f1;
import nd.w0;
import so.o;

/* loaded from: classes2.dex */
public final class UserProfileAnniversaryFollowBalloonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final mn f25622w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileAnniversaryFollowBalloonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        mn T = mn.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f25622w = T;
    }

    public final void a(Anniversary anniversary) {
        p.h(anniversary, "anniversary");
        if (anniversary.getType() != AnniversaryType.FOLLOWER) {
            return;
        }
        String string = getContext().getString(f1.G3);
        p.g(string, "context.getString(R.string.text_person_unit)");
        AppCompatTextView appCompatTextView = this.f25622w.D;
        SpannableString spannableString = new SpannableString(getContext().getString(f1.text_anniversary_exceed_1, String.valueOf(anniversary.getCount()), string));
        int U = o.U(spannableString, String.valueOf(anniversary.getCount()), 0, false, 6, null);
        int length = String.valueOf(anniversary.getCount()).length() + U;
        Context context = getContext();
        int i10 = w0.sunYellow;
        spannableString.setSpan(new ForegroundColorSpan(a.d(context, i10)), U, length, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(15, true), U, length, 33);
        int U2 = o.U(spannableString, string, 0, false, 6, null);
        spannableString.setSpan(new ForegroundColorSpan(a.d(getContext(), i10)), U2, string.length() + U2, 33);
        appCompatTextView.setText(spannableString);
    }
}
