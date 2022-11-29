package com.dena.mirrorman.customview;

import ae.um;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.StreamHolidayBalloonView;
import io.a;
import jo.h;
import jo.p;
import nd.b1;
import ud.b4;
import wn.v;

/* loaded from: classes2.dex */
public final class StreamHolidayBalloonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final um f25605w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamHolidayBalloonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ StreamHolidayBalloonView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public final void b(b4 b4Var, final a<v> aVar) {
        p.h(b4Var, "bindModel");
        p.h(aVar, "listener");
        this.f25605w.T(b4Var);
        this.f25605w.I.setOnClickListener(new View.OnClickListener() { // from class: yd.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamHolidayBalloonView.c(io.a.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamHolidayBalloonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25605w = (um) f.e(LayoutInflater.from(getContext()), b1.view_stream_holiday_balloon, this, true);
    }
}
