package com.dena.mirrorman.customview;

import ae.el;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.user.MutualFollowee;
import jo.p;
import nd.b1;
import rd.r0;
import xn.a0;
import yd.s0;

/* loaded from: classes2.dex */
public final class MutualFolloweeView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final el f25538w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutualFolloweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        el elVar = (el) f.e(LayoutInflater.from(getContext()), b1.view_mutual_followee, this, true);
        this.f25538w = elVar;
        RecyclerView recyclerView = elVar.B;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(elVar.u().getContext(), 0, true);
        linearLayoutManager.M2(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        elVar.B.g(new s0(this));
        elVar.B.setAdapter(new r0());
    }

    public final void b(MutualFollowee mutualFollowee) {
        p.h(mutualFollowee, "mutualFollowee");
        RecyclerView.h adapter = this.f25538w.B.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.MutualFolloweeAdapter");
        ((r0) adapter).c(a0.r0(mutualFollowee.getImageUrls()));
        this.f25538w.C.setText(mutualFollowee.getText());
    }
}
