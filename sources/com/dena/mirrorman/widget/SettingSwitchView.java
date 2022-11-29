package com.dena.mirrorman.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dena.mirrorman.widget.SettingSwitchView;
import io.p;
import nd.b1;
import nd.h1;
import nd.w0;
import nd.z0;
import wn.v;

/* loaded from: classes3.dex */
public final class SettingSwitchView extends LinearLayout implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: w  reason: collision with root package name */
    public CheckBox f26396w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f26397x;

    /* renamed from: y  reason: collision with root package name */
    public p<? super SettingSwitchView, ? super Boolean, v> f26398y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jo.p.h(context, "context");
        b(context, attributeSet);
    }

    public static final void c(SettingSwitchView settingSwitchView, View view) {
        jo.p.h(settingSwitchView, "this$0");
        CheckBox checkBox = settingSwitchView.f26396w;
        if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.N3);
        jo.p.g(obtainStyledAttributes, "context.obtainStyledAttr…leable.SettingSwitchView)");
        View inflate = LayoutInflater.from(context).inflate(b1.view_setting_switch, this);
        View findViewById = inflate.findViewById(z0.cover);
        CheckBox checkBox = (CheckBox) inflate.findViewById(z0.f42340s1);
        this.f26396w = checkBox;
        if (checkBox != null) {
            jo.p.e(checkBox);
            checkBox.setOnCheckedChangeListener(this);
            Drawable drawable = obtainStyledAttributes.getDrawable(h1.O3);
            CheckBox checkBox2 = this.f26396w;
            jo.p.e(checkBox2);
            checkBox2.setButtonDrawable(drawable);
        }
        TextView textView = (TextView) inflate.findViewById(z0.f42343se);
        this.f26397x = textView;
        if (textView != null) {
            String string = obtainStyledAttributes.getString(h1.P3);
            TextView textView2 = this.f26397x;
            jo.p.e(textView2);
            textView2.setText(string);
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: sf.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingSwitchView.c(SettingSwitchView.this, view);
            }
        });
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        jo.p.h(compoundButton, "buttonView");
        TextView textView = this.f26397x;
        if (textView != null) {
            if (z10) {
                jo.p.e(textView);
                textView.setTextColor(getResources().getColor(w0.f42242u0));
            } else {
                jo.p.e(textView);
                textView.setTextColor(getResources().getColor(w0.Y));
            }
        }
        p<? super SettingSwitchView, ? super Boolean, v> pVar = this.f26398y;
        if (pVar != null) {
            pVar.invoke(this, Boolean.valueOf(z10));
        }
    }

    public final void setChecked(boolean z10) {
        TextView textView = this.f26397x;
        if (textView != null) {
            if (z10) {
                jo.p.e(textView);
                textView.setTextColor(getResources().getColor(w0.f42242u0));
            } else {
                jo.p.e(textView);
                textView.setTextColor(getResources().getColor(w0.Y));
            }
        }
        CheckBox checkBox = this.f26396w;
        if (checkBox != null) {
            jo.p.e(checkBox);
            checkBox.setChecked(z10);
        }
    }

    public final void setImage(int i10) {
        CheckBox checkBox = this.f26396w;
        jo.p.e(checkBox);
        checkBox.setButtonDrawable(i10);
    }

    public final void setOnCheckedChangeListener(p<? super SettingSwitchView, ? super Boolean, v> pVar) {
        this.f26398y = pVar;
    }

    public final void setText(int i10) {
        TextView textView = this.f26397x;
        jo.p.e(textView);
        textView.setText(i10);
    }
}
