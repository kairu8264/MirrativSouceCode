package com.dena.mirrorman.customview;

import ae.q8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.BeginnerStreamHolidayBalloonView;
import io.a;
import jo.h;
import jo.p;
import nd.b1;
import ud.b4;
import wn.v;

/* loaded from: classes2.dex */
public final class BeginnerStreamHolidayBalloonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final q8 f25310w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeginnerStreamHolidayBalloonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ BeginnerStreamHolidayBalloonView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public final void b(b4 b4Var, final a<v> aVar) {
        p.h(b4Var, "bindModel");
        p.h(aVar, "listener");
        this.f25310w.T(b4Var);
        this.f25310w.I.setOnClickListener(new View.OnClickListener() { // from class: yd.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeginnerStreamHolidayBalloonView.c(io.a.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnerStreamHolidayBalloonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25310w = (q8) f.e(LayoutInflater.from(getContext()), b1.view_beginner_stream_holiday_balloon, this, true);
    }
}
