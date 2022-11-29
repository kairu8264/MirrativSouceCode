package com.dena.mirrorman.customview;

import ae.yb;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import jo.p;
import nd.b1;
import td.a;

/* loaded from: classes2.dex */
public final class GroupShotBackgroundSettingItemView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final yb f25459w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupShotBackgroundSettingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25459w = (yb) f.e(LayoutInflater.from(getContext()), b1.view_group_shot_background_setting_item, this, true);
    }

    public final void setBackgroundImage(Bitmap bitmap) {
        p.h(bitmap, "backgroundImage");
        AppCompatImageView appCompatImageView = this.f25459w.B;
        p.g(appCompatImageView, "binding.imageView");
        a.C(appCompatImageView, bitmap);
    }

    public final void setBackgroundImageUrl(String str) {
        p.h(str, "backgroundImageUrl");
        AppCompatImageView appCompatImageView = this.f25459w.B;
        p.g(appCompatImageView, "binding.imageView");
        a.D(appCompatImageView, str);
    }

    public final void setChecked(boolean z10) {
        this.f25459w.C.setVisibility(z10 ? 0 : 8);
        this.f25459w.D.setVisibility(z10 ? 0 : 8);
    }
}
