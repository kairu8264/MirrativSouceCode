package com.dena.mirrativ.player;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dena.mirrativ.player.PlayerLinkedLiveView;
import hb.v1;
import hb.x1;
import jo.h;
import jo.p;
import kb.o1;
import of.f;
import wn.v;

/* loaded from: classes2.dex */
public final class PlayerLinkedLiveView extends ConstraintLayout {
    public static final a V = new a(null);
    public static final int W = 8;
    public final o1 U;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerLinkedLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ PlayerLinkedLiveView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void A(io.a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public static final void B(io.a aVar, View view) {
        p.h(aVar, "$callback");
        aVar.invoke();
    }

    public static final void z(io.a aVar, View view) {
        p.h(aVar, "$callback");
        aVar.invoke();
    }

    public final void setCasterBadgeImageUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            this.U.B.setVisibility(8);
            return;
        }
        this.U.B.setVisibility(0);
        f fVar = f.f45394a;
        Context context = getContext();
        p.g(context, "context");
        fVar.c(context, str, this.U.B);
    }

    public final void setCasterImageClickListener(final io.a<v> aVar) {
        p.h(aVar, "callback");
        this.U.C.setOnClickListener(new View.OnClickListener() { // from class: hb.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerLinkedLiveView.z(io.a.this, view);
            }
        });
    }

    public final void setCasterImageUrl(String str) {
        if (str == null) {
            return;
        }
        AppCompatImageView appCompatImageView = this.U.C;
        p.g(appCompatImageView, "binding.casterImageView");
        de.f.e(appCompatImageView, str, Integer.valueOf(v1.S));
    }

    public final void setCloseButtonClickListener(final io.a<v> aVar) {
        p.h(aVar, "listener");
        this.U.D.setOnClickListener(new View.OnClickListener() { // from class: hb.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerLinkedLiveView.A(io.a.this, view);
            }
        });
    }

    public final void setLiveTitle(String str) {
        this.U.F.setText(str);
    }

    public final void setTextContainerClickListener(final io.a<v> aVar) {
        p.h(aVar, "callback");
        this.U.H.setOnClickListener(new View.OnClickListener() { // from class: hb.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerLinkedLiveView.B(io.a.this, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerLinkedLiveView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (o1) androidx.databinding.f.e(LayoutInflater.from(context), x1.view_player_linked_live, this, true);
    }
}
