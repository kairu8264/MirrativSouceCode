package com.dena.mirrorman.customview;

import ae.am;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import nd.h1;

/* loaded from: classes2.dex */
public final class ProfileImageView extends FrameLayout {
    public Integer A;
    public String B;
    public Boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final am f25580w;

    /* renamed from: x  reason: collision with root package name */
    public AttributeSet f25581x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f25582y;

    /* renamed from: z  reason: collision with root package name */
    public String f25583z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25580w = (am) f.e(LayoutInflater.from(getContext()), b1.view_profile_image, this, true);
        this.f25581x = attributeSet;
        c();
    }

    public static /* synthetic */ void b(ProfileImageView profileImageView, String str, String str2, Integer num, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        profileImageView.a(str, str2, num, bool);
    }

    private final void setProfileBorderWidth(Integer num) {
        this.A = num;
        d();
    }

    private final void setProfileIsModerator(Boolean bool) {
        this.C = bool;
        d();
    }

    public final void a(String str, String str2, Integer num, Boolean bool) {
        this.f25582y = true;
        setProfileImageUrl(str);
        if (str2 == null) {
            str2 = "";
        }
        setProfileContinuousBadgeImageUrl(str2);
        setProfileBorderWidth(num);
        setProfileIsModerator(bool);
        this.f25582y = false;
        d();
    }

    public final void c() {
        AttributeSet attributeSet = this.f25581x;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h1.f42030c3, 0, 0);
            String string = obtainStyledAttributes.getString(h1.f42048f3);
            if (string == null) {
                string = "";
            }
            String string2 = obtainStyledAttributes.getString(h1.f42042e3);
            a(string, string2 != null ? string2 : "", Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(h1.f42036d3, 0)), Boolean.valueOf(obtainStyledAttributes.getBoolean(h1.f42054g3, false)));
            obtainStyledAttributes.recycle();
        }
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        if ((r2.length() > 0) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r6 = this;
            boolean r0 = r6.f25582y
            if (r0 != 0) goto La8
            boolean r0 = r6.isInEditMode()
            if (r0 == 0) goto Lc
            goto La8
        Lc:
            java.lang.Integer r0 = r6.A
            r1 = 0
            if (r0 != 0) goto L12
            goto L27
        L12:
            int r0 = r0.intValue()
            if (r0 != 0) goto L27
            ae.am r0 = r6.f25580w
            androidx.appcompat.widget.AppCompatImageView r0 = r0.D
            java.lang.String r2 = "binding.profileImageView"
            jo.p.g(r0, r2)
            java.lang.String r2 = r6.f25583z
            td.a.i(r0, r2)
            goto L67
        L27:
            ae.am r0 = r6.f25580w
            androidx.appcompat.widget.AppCompatImageView r0 = r0.D
            com.dena.mirrorman.net.glide.GlideRequests r0 = com.dena.mirrorman.net.glide.GlideApp.with(r0)
            java.lang.String r2 = r6.f25583z
            com.dena.mirrorman.net.glide.GlideRequest r0 = r0.load(r2)
            int r2 = nd.y0.V1
            com.dena.mirrorman.net.glide.GlideRequest r0 = r0.placeholder(r2)
            xd.a r2 = new xd.a
            java.lang.Integer r3 = r6.A
            if (r3 == 0) goto L46
            int r3 = r3.intValue()
            goto L47
        L46:
            r3 = r1
        L47:
            android.content.Context r4 = r6.getContext()
            int r5 = nd.w0.U0
            int r4 = c3.a.d(r4, r5)
            r2.<init>(r3, r4)
            e8.h r2 = e8.h.bitmapTransform(r2)
            com.dena.mirrorman.net.glide.GlideRequest r0 = r0.apply(r2)
            ae.am r2 = r6.f25580w
            androidx.appcompat.widget.AppCompatImageView r2 = r2.D
            f8.k r0 = r0.into(r2)
            r0.a()
        L67:
            ae.am r0 = r6.f25580w
            androidx.appcompat.widget.AppCompatImageView r0 = r0.B
            java.lang.String r2 = r6.B
            r3 = 1
            if (r2 == 0) goto L7c
            int r2 = r2.length()
            if (r2 <= 0) goto L78
            r2 = r3
            goto L79
        L78:
            r2 = r1
        L79:
            if (r2 != r3) goto L7c
            goto L7d
        L7c:
            r3 = r1
        L7d:
            r2 = 8
            if (r3 == 0) goto L83
            r3 = r1
            goto L84
        L83:
            r3 = r2
        L84:
            r0.setVisibility(r3)
            ae.am r0 = r6.f25580w
            androidx.appcompat.widget.AppCompatImageView r0 = r0.B
            java.lang.String r3 = "binding.continuousBadgeImageView"
            jo.p.g(r0, r3)
            java.lang.String r3 = r6.B
            td.a.f(r0, r3)
            ae.am r0 = r6.f25580w
            androidx.appcompat.widget.AppCompatImageView r0 = r0.C
            java.lang.Boolean r3 = r6.C
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = jo.p.c(r3, r4)
            if (r3 == 0) goto La4
            goto La5
        La4:
            r1 = r2
        La5:
            r0.setVisibility(r1)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.ProfileImageView.d():void");
    }

    public final String getProfileContinuousBadgeImageUrl() {
        return this.B;
    }

    public final String getProfileImageUrl() {
        return this.f25583z;
    }

    public final void setProfileContinuousBadgeImageUrl(String str) {
        this.B = str;
        d();
    }

    public final void setProfileImageUrl(String str) {
        this.f25583z = str;
        d();
    }
}
