package com.dena.mirrativ.player;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrativ.player.PlayerLinkedLiveBackView;
import hb.v1;
import hb.x1;
import jo.h;
import jo.p;
import kb.m1;
import of.f;
import wn.v;

/* loaded from: classes2.dex */
public final class PlayerLinkedLiveBackView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f22424x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f22425y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final m1 f22426w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerLinkedLiveBackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ PlayerLinkedLiveBackView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void d(io.a aVar, View view) {
        p.h(aVar, "$callback");
        aVar.invoke();
    }

    public static final void e(io.a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public static final void f(io.a aVar, View view) {
        p.h(aVar, "$callback");
        aVar.invoke();
    }

    public final void setCasterBadgeImageUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f22426w.B.setVisibility(8);
            return;
        }
        this.f22426w.B.setVisibility(0);
        f fVar = f.f45394a;
        Context context = getContext();
        p.g(context, "context");
        fVar.c(context, str, this.f22426w.B);
    }

    public final void setCasterImageClickListener(final io.a<v> aVar) {
        p.h(aVar, "callback");
        this.f22426w.C.setOnClickListener(new View.OnClickListener() { // from class: hb.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerLinkedLiveBackView.d(io.a.this, view);
            }
        });
    }

    public final void setCasterImageUrl(String str) {
        if (str == null) {
            return;
        }
        AppCompatImageView appCompatImageView = this.f22426w.C;
        p.g(appCompatImageView, "binding.casterImageView");
        de.f.e(appCompatImageView, str, Integer.valueOf(v1.S));
    }

    public final void setCloseButtonClickListener(final io.a<v> aVar) {
        p.h(aVar, "listener");
        this.f22426w.D.setOnClickListener(new View.OnClickListener() { // from class: hb.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerLinkedLiveBackView.e(io.a.this, view);
            }
        });
    }

    public final void setLiveTitle(String str) {
        this.f22426w.F.setText(str);
    }

    public final void setTextContainerClickListener(final io.a<v> aVar) {
        p.h(aVar, "callback");
        this.f22426w.H.setOnClickListener(new View.OnClickListener() { // from class: hb.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerLinkedLiveBackView.f(io.a.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerLinkedLiveBackView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f22426w = (m1) androidx.databinding.f.e(LayoutInflater.from(context), x1.view_player_linked_live_back, this, true);
    }
}
