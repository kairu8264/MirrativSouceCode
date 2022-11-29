package com.dena.mirrativ.player.gifting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hb.x1;
import io.l;
import io.p;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.q;
import kb.b0;
import o3.g0;
import ro.n;
import ud.a0;
import wn.v;
import xn.t;
import yd.g1;

/* loaded from: classes2.dex */
public final class EmomoRunGiftsView extends ConstraintLayout {
    public final b0 U;
    public p<? super String, ? super View, v> V;

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<String, View, v> {
        public a() {
            super(2);
        }

        public final void a(String str, View view) {
            jo.p.h(str, "giftId");
            jo.p.h(view, "cell");
            p pVar = EmomoRunGiftsView.this.V;
            if (pVar != null) {
                pVar.invoke(str, view);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(String str, View view) {
            a(str, view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Boolean, v> f22658x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super Boolean, v> lVar) {
            super(1);
            this.f22658x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EmomoRunGiftsView.this.U.E.setVisibility(8);
            this.f22658x.invoke(Boolean.TRUE);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Boolean, v> f22660x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super Boolean, v> lVar) {
            super(1);
            this.f22660x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EmomoRunGiftsView.this.U.E.setVisibility(8);
            this.f22660x.invoke(Boolean.TRUE);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l<Boolean, v> f22662x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(l<? super Boolean, v> lVar) {
            super(1);
            this.f22662x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EmomoRunGiftsView.this.U.E.setVisibility(8);
            this.f22662x.invoke(Boolean.FALSE);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmomoRunGiftsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ EmomoRunGiftsView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final View getScoreGiftView() {
        RecyclerView recyclerView = this.U.B;
        jo.p.g(recyclerView, "binding.giftListRecyclerView");
        return (View) n.q(g0.a(recyclerView));
    }

    public final void y(List<jf.q> list, boolean z10, l<? super Boolean, v> lVar, p<? super String, ? super View, v> pVar) {
        jo.p.h(list, "gifts");
        jo.p.h(lVar, "helpClickListener");
        jo.p.h(pVar, "itemClickListener");
        RecyclerView.h adapter = this.U.B.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.EmomoRunGiftListAdapter");
        rd.n nVar = (rd.n) adapter;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        for (jf.q qVar : list) {
            a0 a0Var = new a0(null, 1, null);
            a0Var.a(qVar);
            arrayList.add(a0Var);
        }
        nVar.c(arrayList);
        this.V = pVar;
        AppCompatImageView appCompatImageView = this.U.C;
        jo.p.g(appCompatImageView, "binding.helpImageView");
        g1.a(appCompatImageView, new b(lVar));
        ConstraintLayout constraintLayout = this.U.E;
        jo.p.g(constraintLayout, "binding.helpInfoContainer");
        g1.a(constraintLayout, new c(lVar));
        ConstraintLayout constraintLayout2 = this.U.D;
        jo.p.g(constraintLayout2, "binding.helpInfoCloseContainer");
        g1.a(constraintLayout2, new d(lVar));
        this.U.E.setVisibility(z10 ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmomoRunGiftsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        b0 b0Var = (b0) f.e(LayoutInflater.from(context), x1.view_emomo_run_gifts, this, true);
        this.U = b0Var;
        b0Var.B.setLayoutManager(new LinearLayoutManager(b0Var.u().getContext()) { // from class: com.dena.mirrativ.player.gifting.EmomoRunGiftsView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return false;
            }
        });
        b0Var.B.g(new p001if.c(de.n.b(this, 4), 0, 0, 0, 0, 0, 32, null));
        RecyclerView recyclerView = b0Var.B;
        rd.n nVar = new rd.n();
        nVar.b(new a());
        recyclerView.setAdapter(nVar);
    }
}
