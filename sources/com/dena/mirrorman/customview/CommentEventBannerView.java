package com.dena.mirrorman.customview;

import ae.e9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import ud.w;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class CommentEventBannerView extends ConstraintLayout {
    public final e9 U;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f25330w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.a<v> aVar) {
            super(1);
            this.f25330w = aVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            io.a<v> aVar = this.f25330w;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentEventBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ CommentEventBannerView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void w(w wVar, io.a<v> aVar) {
        p.h(wVar, "commentEventBannerBindModel");
        this.U.T(wVar);
        AppCompatTextView appCompatTextView = this.U.D;
        p.g(appCompatTextView, "binding.eventCheckTextView");
        g1.a(appCompatTextView, new a(aVar));
        this.U.o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentEventBannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (e9) f.e(LayoutInflater.from(getContext()), b1.view_comment_event_banner, this, true);
    }
}
