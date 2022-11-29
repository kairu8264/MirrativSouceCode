package com.dena.mirrorman.fragment;

import ae.e7;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrorman.fragment.StreamEmomoCommentFragment;
import da.j;
import gf.v0;
import java.util.ArrayList;
import java.util.List;
import je.g;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import ud.d4;
import uo.q0;
import uo.r0;
import wn.f;
import wn.i;
import xn.s;

/* loaded from: classes2.dex */
public final class StreamEmomoCommentFragment extends Fragment implements q0 {
    public static final a B0 = new a(null);
    public static final int C0 = 8;
    public final f A0;

    /* renamed from: x0 */
    public final /* synthetic */ j f26132x0;

    /* renamed from: y0 */
    public final f f26133y0;

    /* renamed from: z0 */
    public v0 f26134z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public static /* synthetic */ StreamEmomoCommentFragment b(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(z10);
        }

        public final StreamEmomoCommentFragment a(boolean z10) {
            StreamEmomoCommentFragment streamEmomoCommentFragment = new StreamEmomoCommentFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_HIDE_EVENT_BANNER", z10);
            streamEmomoCommentFragment.V2(bundle);
            return streamEmomoCommentFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            StreamEmomoCommentFragment.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(StreamEmomoCommentFragment.this.M2().getBoolean("EXTRA_HIDE_EVENT_BANNER"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.j {

        /* renamed from: a */
        public final /* synthetic */ LinearLayoutManager f26136a;

        /* renamed from: b */
        public final /* synthetic */ e7 f26137b;

        public c(LinearLayoutManager linearLayoutManager, e7 e7Var) {
            this.f26136a = linearLayoutManager;
            this.f26137b = e7Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            super.d(i10, i11);
            if (this.f26136a.i2() == 0) {
                this.f26137b.B.p1(0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements g.b {
        public d() {
            StreamEmomoCommentFragment.this = r1;
        }

        @Override // je.g.b
        public void a(String str) {
            p.h(str, "linkOwnerLiveId");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.I2(str);
            }
        }

        @Override // je.g.b
        public void b(String str) {
            p.h(str, "userId");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.L(str);
            }
        }

        @Override // je.g.b
        public void c(String str) {
            p.h(str, "url");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.u0(str);
            }
        }

        @Override // je.g.b
        public void d(String str) {
            p.h(str, "liveId");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.d1(str);
            }
        }

        @Override // je.g.b
        public void e(String str) {
            p.h(str, "userId");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.S(str);
            }
        }

        @Override // je.g.b
        public void f(String str) {
            p.h(str, "appUserId");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.Z0(str);
            }
        }

        @Override // je.g.b
        public void g() {
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.r2();
            }
        }

        @Override // je.g.b
        public void h(EventBannerResponse eventBannerResponse) {
            p.h(eventBannerResponse, "eventBanner");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.e0(eventBannerResponse);
            }
        }

        @Override // je.g.b
        public void i(String str) {
            p.h(str, "lpUrl");
            v0 v0Var = StreamEmomoCommentFragment.this.f26134z0;
            if (v0Var != null) {
                v0Var.s2(str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<nf.c> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f26139w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f26140x;

        /* renamed from: y */
        public final /* synthetic */ io.a f26141y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26139w = componentCallbacks;
            this.f26140x = aVar;
            this.f26141y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f26139w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.c.class), this.f26140x, this.f26141y);
        }
    }

    public StreamEmomoCommentFragment() {
        super(b1.fragment_stream_comment);
        this.f26132x0 = new j();
        this.f26133y0 = wn.g.b(i.SYNCHRONIZED, new e(this, null, null));
        this.A0 = wn.g.a(new b());
    }

    public static final void o3(StreamEmomoCommentFragment streamEmomoCommentFragment, e7 e7Var, List list) {
        p.h(streamEmomoCommentFragment, "this$0");
        if (list == null) {
            g9.a.c(new NullPointerException("newComments is null"));
            return;
        }
        if (streamEmomoCommentFragment.m3()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!s.m(-103, 106).contains(Integer.valueOf(((d4) obj).d()))) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        RecyclerView.h adapter = e7Var.B.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.emomo.StreamEmomoCommentAdapter");
        ((g) adapter).d(list);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        a1().g().a(new androidx.lifecycle.h() { // from class: com.dena.mirrorman.fragment.StreamEmomoCommentFragment$onViewCreated$1
            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void b(u uVar) {
                p.h(uVar, "owner");
                StreamEmomoCommentFragment streamEmomoCommentFragment = StreamEmomoCommentFragment.this;
                Context q02 = streamEmomoCommentFragment.q0();
                streamEmomoCommentFragment.f26134z0 = q02 instanceof v0 ? (v0) q02 : null;
            }

            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void g(u uVar) {
                p.h(uVar, "owner");
                StreamEmomoCommentFragment.this.f26134z0 = null;
                r0.d(StreamEmomoCommentFragment.this, null, 1, null);
            }
        });
        final e7 T = e7.T(view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(q0());
        g gVar = new g();
        gVar.registerAdapterDataObserver(new c(linearLayoutManager, T));
        gVar.h(new d());
        T.B.setLayoutManager(linearLayoutManager);
        T.B.g(new p001if.b(de.e.b(this, 4)));
        T.B.setAdapter(gVar);
        n3().S().i(a1(), new androidx.lifecycle.f0() { // from class: gf.w0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoCommentFragment.o3(StreamEmomoCommentFragment.this, T, (List) obj);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f26132x0.getCoroutineContext();
    }

    public final boolean m3() {
        return ((Boolean) this.A0.getValue()).booleanValue();
    }

    public final nf.c n3() {
        return (nf.c) this.f26133y0.getValue();
    }
}
