package com.dena.mirrorman.customview;

import ae.s8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import jo.h;
import jo.p;
import nd.b1;
import nd.f1;
import ud.k;

/* loaded from: classes2.dex */
public final class BirthdayBalloonView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f25311x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f25312y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final s8 f25313w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthdayBalloonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ BirthdayBalloonView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void b(BirthdayBalloonView birthdayBalloonView, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        birthdayBalloonView.a(i10, z10);
    }

    public final void a(int i10, boolean z10) {
        s8 s8Var = this.f25313w;
        String string = getContext().getResources().getString(f1.text_birthday_limit_text, String.valueOf(i10));
        p.g(string, "context.resources.getStr…, remainCount.toString())");
        s8Var.T(new k(string, 8 <= i10 && i10 < 15, (z10 ? 1 : 0) + 1 <= i10 && i10 < 8, !z10 && i10 == 0, z10 && i10 == 1, z10 && i10 == 0, z10 && i10 == -1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayBalloonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25313w = (s8) f.e(LayoutInflater.from(getContext()), b1.view_birthday_balloon, this, true);
    }
}
