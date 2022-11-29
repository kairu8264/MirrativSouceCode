package com.dena.mirrorman.customview;

import ae.i9;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrorman.customview.ContinuousStreamBalloonView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import io.a;
import jo.h;
import jo.p;
import nd.b1;
import ud.x;
import wn.v;

/* loaded from: classes2.dex */
public final class ContinuousStreamBalloonView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final i9 f25331w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContinuousStreamBalloonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ ContinuousStreamBalloonView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public final void b(UserProfile userProfile, boolean z10, final a<v> aVar) {
        p.h(userProfile, Referer.PROFILE);
        p.h(aVar, "listener");
        i9 i9Var = this.f25331w;
        x.a aVar2 = x.f55659e;
        Resources resources = getContext().getResources();
        p.g(resources, "context.resources");
        i9Var.T(aVar2.a(resources, userProfile, z10));
        this.f25331w.G.setOnClickListener(new View.OnClickListener() { // from class: yd.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContinuousStreamBalloonView.c(io.a.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuousStreamBalloonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25331w = (i9) f.e(LayoutInflater.from(getContext()), b1.view_continuous_stream_balloon, this, true);
    }
}
