package com.dena.mirrorman.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dena.mirrorman.widget.SettingButtonView;
import io.l;
import jo.p;
import nd.b1;
import nd.h1;
import nd.w0;
import nd.z0;
import wn.v;

/* loaded from: classes3.dex */
public final class SettingButtonView extends LinearLayout {

    /* renamed from: w  reason: collision with root package name */
    public ImageView f26392w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f26393x;

    /* renamed from: y  reason: collision with root package name */
    public View f26394y;

    /* renamed from: z  reason: collision with root package name */
    public l<? super SettingButtonView, v> f26395z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        c(context, attributeSet);
    }

    public static final void d(SettingButtonView settingButtonView, View view) {
        p.h(settingButtonView, "this$0");
        settingButtonView.b();
    }

    public final void b() {
        l<? super SettingButtonView, v> lVar = this.f26395z;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.K3);
        p.g(obtainStyledAttributes, "context.obtainStyledAttr…leable.SettingButtonView)");
        View inflate = LayoutInflater.from(context).inflate(b1.view_setting_button, this);
        View findViewById = inflate.findViewById(z0.cover);
        ImageView imageView = (ImageView) inflate.findViewById(z0.I6);
        this.f26392w = imageView;
        if (imageView != null) {
            Drawable drawable = obtainStyledAttributes.getDrawable(h1.L3);
            ImageView imageView2 = this.f26392w;
            p.e(imageView2);
            imageView2.setImageDrawable(drawable);
        }
        TextView textView = (TextView) inflate.findViewById(z0.f42343se);
        this.f26393x = textView;
        if (textView != null) {
            String string = obtainStyledAttributes.getString(h1.M3);
            TextView textView2 = this.f26393x;
            p.e(textView2);
            textView2.setText(string);
        }
        this.f26394y = inflate.findViewById(z0.newmark);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: sf.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingButtonView.d(SettingButtonView.this, view);
            }
        });
        obtainStyledAttributes.recycle();
    }

    public final void setImage(int i10) {
        ImageView imageView = this.f26392w;
        p.e(imageView);
        imageView.setImageResource(i10);
    }

    public final void setOnClickListener(l<? super SettingButtonView, v> lVar) {
        this.f26395z = lVar;
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        TextView textView = this.f26393x;
        if (textView != null) {
            if (z10) {
                p.e(textView);
                textView.setTextColor(getResources().getColor(w0.f42242u0));
            } else {
                p.e(textView);
                textView.setTextColor(getResources().getColor(w0.Y));
            }
        }
        ImageView imageView = this.f26392w;
        if (imageView != null) {
            p.e(imageView);
            imageView.setSelected(z10);
        }
    }

    public final void setText(int i10) {
        TextView textView = this.f26393x;
        p.e(textView);
        textView.setText(i10);
    }
}
