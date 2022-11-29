package com.dena.mirrorman.customview;

import ae.gn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dena.mirrorman.customview.UrgeUsersView;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import io.l;
import java.util.List;
import jo.h;
import jo.p;
import nd.b1;
import pe.e;
import wn.v;

/* loaded from: classes2.dex */
public final class UrgeUsersView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final gn f25621w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UrgeUsersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ UrgeUsersView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void c(l lVar, e eVar, View view) {
        p.h(lVar, "$listener");
        p.h(eVar, "$adapter");
        lVar.invoke(eVar.f());
    }

    public final void b(String str, String str2, List<UrgeUser> list, final l<? super List<String>, v> lVar) {
        p.h(str, "urgeUserTitle");
        p.h(str2, "urgeUserDescription");
        p.h(list, "urgeUsers");
        p.h(lVar, "listener");
        this.f25621w.G.setText(str);
        this.f25621w.B.setText(str2);
        final e eVar = new e(list);
        this.f25621w.E.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f25621w.E.setAdapter(eVar);
        this.f25621w.D.setOnClickListener(new View.OnClickListener() { // from class: yd.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UrgeUsersView.c(io.l.this, eVar, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrgeUsersView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25621w = (gn) f.e(LayoutInflater.from(getContext()), b1.view_urge_users, this, true);
    }
}
