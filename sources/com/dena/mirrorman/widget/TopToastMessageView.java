package com.dena.mirrorman.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dena.mirrorman.widget.TopToastMessageView;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import jo.p;
import nd.b1;
import nd.h1;
import nd.v0;
import nd.z0;

/* loaded from: classes3.dex */
public final class TopToastMessageView extends LinearLayout {
    public final Handler A;

    /* renamed from: w  reason: collision with root package name */
    public TextView f26399w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f26400x;

    /* renamed from: y  reason: collision with root package name */
    public Animation f26401y;

    /* renamed from: z  reason: collision with root package name */
    public Animation f26402z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopToastMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        this.A = new Handler();
        c(context, attributeSet);
    }

    public static /* synthetic */ void e(TopToastMessageView topToastMessageView, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS;
        }
        topToastMessageView.d(j10);
    }

    public static final void f(TopToastMessageView topToastMessageView) {
        p.h(topToastMessageView, "this$0");
        topToastMessageView.b();
    }

    public final void b() {
        setAnimation(this.f26402z);
        setVisibility(8);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.f42115q4);
        p.g(obtainStyledAttributes, "context.obtainStyledAttr…able.TopToastMessageView)");
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), v0.top_toast_message_in);
        this.f26401y = loadAnimation;
        if (loadAnimation != null) {
            loadAnimation.setRepeatCount(0);
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), v0.top_toast_message_out);
        this.f26402z = loadAnimation2;
        if (loadAnimation2 != null) {
            loadAnimation2.setRepeatCount(0);
        }
        View inflate = LayoutInflater.from(context).inflate(b1.view_top_toast_message, this);
        TextView textView = (TextView) inflate.findViewById(z0.Ke);
        this.f26399w = textView;
        if (textView != null) {
            String string = obtainStyledAttributes.getString(h1.f42127s4);
            TextView textView2 = this.f26399w;
            p.e(textView2);
            textView2.setText(string);
        }
        TextView textView3 = (TextView) inflate.findViewById(z0.f42363w8);
        this.f26400x = textView3;
        if (textView3 != null) {
            String string2 = obtainStyledAttributes.getString(h1.f42121r4);
            TextView textView4 = this.f26400x;
            p.e(textView4);
            textView4.setText(string2);
        }
        setVisibility(8);
        obtainStyledAttributes.recycle();
    }

    public final void d(long j10) {
        setVisibility(0);
        setAnimation(this.f26401y);
        this.A.postDelayed(new Runnable() { // from class: sf.k
            @Override // java.lang.Runnable
            public final void run() {
                TopToastMessageView.f(TopToastMessageView.this);
            }
        }, j10);
    }

    public final void setMessage(String str) {
        TextView textView = this.f26400x;
        p.e(textView);
        textView.setText(str);
    }

    public final void setTitle(String str) {
        p.h(str, "title");
        if (str.length() == 0) {
            TextView textView = this.f26399w;
            p.e(textView);
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = this.f26399w;
        p.e(textView2);
        textView2.setVisibility(0);
        TextView textView3 = this.f26399w;
        p.e(textView3);
        textView3.setText(str);
    }
}
