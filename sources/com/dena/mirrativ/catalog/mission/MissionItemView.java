package com.dena.mirrativ.catalog.mission;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.f0;
import androidx.lifecycle.u;
import com.dena.mirrativ.catalog.mission.MissionItemView;
import com.dena.mirrorman.net.api.response.MissionStatus;
import com.dena.mirrorman.net.glide.GlideApp;
import io.l;
import jo.p;
import jo.q;
import r8.h1;
import t8.i2;
import wn.v;
import yd.g1;
import z8.g;

/* loaded from: classes.dex */
public final class MissionItemView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final i2 f20694w;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20695a;

        static {
            int[] iArr = new int[MissionStatus.values().length];
            iArr[MissionStatus.NOT_COMPLETED.ordinal()] = 1;
            iArr[MissionStatus.IN_PROGRESS.ordinal()] = 2;
            iArr[MissionStatus.COMPLETED.ordinal()] = 3;
            iArr[MissionStatus.REWARD_RECEIVED.ordinal()] = 4;
            iArr[MissionStatus.UNDEFINED_API_PARAM.ordinal()] = 5;
            f20695a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ l<g, v> f20696w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g f20697x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super g, v> lVar, g gVar) {
            super(1);
            this.f20696w = lVar;
            this.f20697x = gVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            l<g, v> lVar = this.f20696w;
            if (lVar != null) {
                lVar.invoke(this.f20697x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        i2 T = i2.T(LayoutInflater.from(getContext()), this, true);
        p.g(T, "inflate(LayoutInflater.from(context), this, true)");
        this.f20694w = T;
    }

    public static final void e(MissionItemView missionItemView, MissionStatus missionStatus) {
        p.h(missionItemView, "this$0");
        int i10 = missionStatus == null ? -1 : a.f20695a[missionStatus.ordinal()];
        if (i10 == 1) {
            missionItemView.f20694w.E.setEnabled(false);
            missionItemView.f20694w.B.setVisibility(8);
            missionItemView.f20694w.C.setVisibility(8);
            missionItemView.f20694w.E.setText(missionItemView.getContext().getString(h1.text_mission_reward_receive));
        } else if (i10 == 2) {
            missionItemView.f20694w.E.setEnabled(false);
            missionItemView.f20694w.B.setVisibility(8);
            missionItemView.f20694w.C.setVisibility(8);
            missionItemView.f20694w.E.setText(missionItemView.getContext().getString(h1.text_mission_reward_receive));
        } else if (i10 == 3) {
            missionItemView.f20694w.E.setEnabled(true);
            missionItemView.f20694w.B.setVisibility(8);
            missionItemView.f20694w.C.setVisibility(8);
            missionItemView.f20694w.E.setText(missionItemView.getContext().getString(h1.text_mission_reward_receive));
        } else if (i10 == 4) {
            missionItemView.f20694w.E.setEnabled(false);
            missionItemView.f20694w.B.setVisibility(0);
            missionItemView.f20694w.C.setVisibility(0);
            missionItemView.f20694w.E.setText(missionItemView.getContext().getString(h1.text_mission_reward_received));
        } else if (i10 != 5) {
        } else {
            missionItemView.f20694w.E.setEnabled(false);
            missionItemView.f20694w.B.setVisibility(8);
            missionItemView.f20694w.C.setVisibility(8);
            missionItemView.f20694w.E.setText(missionItemView.getContext().getString(h1.text_mission_reward_receive));
        }
    }

    public static final void f(l lVar, g gVar, l lVar2, View view) {
        p.h(lVar, "$onClickGetButton");
        p.h(gVar, "$bindModel");
        lVar.invoke(Integer.valueOf(gVar.b()));
        if (lVar2 != null) {
            lVar2.invoke(Boolean.TRUE);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void c(final g gVar, boolean z10, u uVar, final l<? super Integer, v> lVar, l<? super g, v> lVar2, final l<? super Boolean, v> lVar3) {
        p.h(gVar, "bindModel");
        p.h(uVar, "lifecycleOwner");
        p.h(lVar, "onClickGetButton");
        this.f20694w.K.setText(gVar.k());
        this.f20694w.I.setText(gVar.g());
        gVar.c().i(uVar, new f0() { // from class: z8.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MissionItemView.e(MissionItemView.this, (MissionStatus) obj);
            }
        });
        this.f20694w.H.setText(gVar.f());
        if (z10) {
            this.f20694w.E.setOnClickListener(null);
            this.f20694w.E.setClickable(false);
        } else {
            this.f20694w.E.setOnClickListener(new View.OnClickListener() { // from class: z8.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MissionItemView.f(io.l.this, gVar, lVar3, view);
                }
            });
            this.f20694w.E.setClickable(true);
        }
        this.f20694w.G.setMax(gVar.e());
        this.f20694w.G.setProgress(gVar.d());
        GlideApp.with(getContext()).load(gVar.h()).into(this.f20694w.J);
        if (gVar.l()) {
            this.f20694w.L.setVisibility(0);
            AppCompatImageView appCompatImageView = this.f20694w.J;
            p.g(appCompatImageView, "binding.rewardImageView");
            g1.a(appCompatImageView, new b(lVar2, gVar));
        } else {
            this.f20694w.L.setVisibility(8);
            this.f20694w.J.setOnClickListener(null);
        }
        if (p.c(gVar.a(), "")) {
            this.f20694w.D.setVisibility(8);
            return;
        }
        this.f20694w.D.setVisibility(0);
        this.f20694w.D.setText(gVar.a());
    }
}
