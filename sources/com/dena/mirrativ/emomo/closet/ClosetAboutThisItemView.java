package com.dena.mirrativ.emomo.closet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.dena.mirrativ.emomo.closet.ClosetAboutThisItemView;
import io.a;
import jo.p;
import q9.h;
import s9.i0;
import wn.v;

/* loaded from: classes.dex */
public final class ClosetAboutThisItemView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final i0 f20801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosetAboutThisItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f20801w = (i0) f.e(LayoutInflater.from(getContext()), h.view_closet_about_this_item, this, true);
    }

    public static final void c(a aVar, View view) {
        p.h(aVar, "$onClickListener");
        aVar.invoke();
    }

    public final void b(final a<v> aVar) {
        p.h(aVar, "onClickListener");
        this.f20801w.B.setOnClickListener(new View.OnClickListener() { // from class: r9.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClosetAboutThisItemView.c(io.a.this, view);
            }
        });
    }
}
