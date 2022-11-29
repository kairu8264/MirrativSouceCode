package com.dena.mirrativ.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import com.dena.mirrativ.player.PlayerAdAppView;
import com.dena.mirrorman.net.glide.GlideApp;
import hb.x1;
import hb.z1;
import io.a;
import jo.h;
import jo.p;
import kb.i1;
import wn.v;

/* loaded from: classes2.dex */
public final class PlayerAdAppView extends ConstraintLayout {
    public final i1 U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerAdAppView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ PlayerAdAppView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void y(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public static final void z(a aVar, View view) {
        p.h(aVar, "$listener");
        aVar.invoke();
    }

    public final void setAppImageUrl(String str) {
        GlideApp.with(getContext()).load(str).placeholder(z1.f35041e).into(this.U.B);
    }

    public final void setCloseButtonClickListener(final a<v> aVar) {
        p.h(aVar, "listener");
        this.U.C.setOnClickListener(new View.OnClickListener() { // from class: hb.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerAdAppView.y(io.a.this, view);
            }
        });
    }

    public final void setDescription(String str) {
        this.U.D.setText(str);
    }

    public final void setDownloadButtonClickListener(final a<v> aVar) {
        p.h(aVar, "listener");
        this.U.E.setOnClickListener(new View.OnClickListener() { // from class: hb.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerAdAppView.z(io.a.this, view);
            }
        });
    }

    public final void setTitle(String str) {
        this.U.F.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerAdAppView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.U = (i1) f.e(LayoutInflater.from(context), x1.view_player_ad_app, this, true);
    }
}
