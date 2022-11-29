package com.dena.mirrativ.streaming.emokara;

import ac.v2;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.navigation.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.b1;
import bc.d0;
import bc.e1;
import bc.j1;
import bc.s;
import bc.z2;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.streaming.emokara.EmokaraSearchFragment;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.KaraokeDetail;
import com.dena.mirrorman.net.api.response.KaraokeSearch;
import com.dena.mirrorman.net.api.response.Singer;
import com.dena.mirrorman.net.fme.FmeParser;
import com.dena.mirrorman.net.fme.KaraokeConverter;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ep.e0;
import java.util.List;
import jf.v;
import jo.f0;
import jo.p;
import jo.q;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class EmokaraSearchFragment extends Fragment implements d0, q0 {
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public s E0;
    public j1 F0;
    public e1 G0;
    public v H0;

    /* renamed from: y0  reason: collision with root package name */
    public v2 f22993y0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ q0 f22992x0 = r0.b();

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f22994z0 = wn.g.a(o.f23022w);
    public final wn.f A0 = wn.g.a(k.f23012w);

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.l<Karaoke, wn.v> {
        public a() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            p.h(karaoke, "karaoke");
            EmokaraSearchFragment.this.M3(KaraokeLog.Companion.createSearchReferer(), karaoke.getId());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<Singer, wn.v> {
        public b() {
            super(1);
        }

        public final void a(Singer singer) {
            p.h(singer, "singer");
            androidx.navigation.p b10 = b1.b.b(b1.f17267a, singer.getName(), singer.getId(), "search", null, 8, null);
            v2 v2Var = EmokaraSearchFragment.this.f22993y0;
            if (v2Var == null) {
                p.v("binding");
                v2Var = null;
            }
            w.b(v2Var.u()).r(b10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Singer singer) {
            a(singer);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<Karaoke, wn.v> {
        public c() {
            super(1);
        }

        public final void a(Karaoke karaoke) {
            p.h(karaoke, "karaoke");
            s sVar = EmokaraSearchFragment.this.E0;
            if (sVar != null) {
                sVar.r0(karaoke, true);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Karaoke karaoke) {
            a(karaoke);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<String, wn.v> {
        public d() {
            super(1);
        }

        public final void a(String str) {
            p.h(str, "it");
            v2 v2Var = EmokaraSearchFragment.this.f22993y0;
            if (v2Var == null) {
                p.v("binding");
                v2Var = null;
            }
            v2Var.K.setText(str);
            EmokaraSearchFragment.this.Z3(str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.l<String, wn.v> {
        public e() {
            super(1);
        }

        public final void a(String str) {
            p.h(str, "it");
            EmokaraSearchFragment.this.O3().b(str);
            EmokaraSearchFragment.this.N3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSearchFragment$convertKaraokeModel$1", f = "EmokaraSearchFragment.kt", l = {333}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23000w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ KaraokeDetail f23002y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(KaraokeDetail karaokeDetail, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f23002y = karaokeDetail;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f23002y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23000w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest Q3 = EmokaraSearchFragment.this.Q3();
                        String fmeUrl = this.f23002y.getFmeUrl();
                        this.f23000w = 1;
                        obj = Q3.getFmeData(fmeUrl, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    v karaokeModel = KaraokeConverter.INSTANCE.getKaraokeModel(FmeParser.Companion.parse(((e0) obj).c()));
                    EmokaraSearchFragment.this.H0 = karaokeModel;
                    EmokaraSearchFragment.this.S3().j().m(karaokeModel);
                } catch (Exception e10) {
                    g9.a.c(e10);
                    EmokaraSearchFragment.this.S3().f().m(co.b.a(true));
                    EmokaraSearchFragment.this.S3().l().m(co.b.a(false));
                }
                EmokaraSearchFragment.this.S3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                EmokaraSearchFragment.this.S3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSearchFragment$fetchKaraokeDetail$1", f = "EmokaraSearchFragment.kt", l = {319}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23003w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f23005y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f23006z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, int i10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f23005y = str;
            this.f23006z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f23005y, this.f23006z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23003w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest Q3 = EmokaraSearchFragment.this.Q3();
                    String str = this.f23005y;
                    int i11 = this.f23006z;
                    String c11 = EmokaraSearchFragment.this.P3().c();
                    this.f23003w = 1;
                    obj = Q3.getKaraokeDetail(str, i11, c11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                KaraokeDetail karaokeDetail = (KaraokeDetail) obj;
                EmokaraSearchFragment.this.S3().h().m(karaokeDetail);
                EmokaraSearchFragment.this.L3(karaokeDetail);
            } catch (Exception e10) {
                g9.a.c(e10);
                EmokaraSearchFragment.this.S3().f().m(co.b.a(true));
                EmokaraSearchFragment.this.S3().l().m(co.b.a(false));
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements TextWatcher {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v2 f23007w;

        public h(v2 v2Var) {
            this.f23007w = v2Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() == 0) {
                this.f23007w.C.setVisibility(8);
            } else {
                this.f23007w.C.setVisibility(0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends androidx.recyclerview.widget.k {
        public i(Context context, int i10) {
            super(context, i10);
        }

        @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            p.h(rect, "outRect");
            p.h(view, "view");
            p.h(recyclerView, "parent");
            p.h(b0Var, "state");
            j1 j1Var = EmokaraSearchFragment.this.F0;
            if (j1Var != null) {
                int f02 = recyclerView.f0(view);
                int itemViewType = j1Var.getItemViewType(f02);
                int i10 = f02 + 1;
                if (p(itemViewType, j1Var.getItemCount() == i10 ? 0 : j1Var.getItemViewType(i10))) {
                    super.g(rect, view, recyclerView, b0Var);
                } else {
                    rect.set(0, 0, 0, 0);
                }
            }
        }

        public final boolean p(int i10, int i11) {
            z2 z2Var = z2.values()[i10];
            z2 z2Var2 = z2.SONG;
            if (z2Var != z2Var2 || z2.values()[i11] != z2Var2) {
                z2 z2Var3 = z2.values()[i10];
                z2 z2Var4 = z2.SINGER;
                if (z2Var3 != z2Var4 || z2.values()[i11] != z2Var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emokara.EmokaraSearchFragment$search$1", f = "EmokaraSearchFragment.kt", l = {304}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23009w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f23011y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f23011y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f23011y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23009w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest Q3 = EmokaraSearchFragment.this.Q3();
                        String c11 = EmokaraSearchFragment.this.P3().c();
                        String str = this.f23011y;
                        this.f23009w = 1;
                        obj = MRRequest.DefaultImpls.searchKaraoke$default(Q3, c11, str, null, this, 4, null);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    KaraokeSearch karaokeSearch = (KaraokeSearch) obj;
                    karaokeSearch.setKeyward(this.f23011y);
                    EmokaraSearchFragment.this.S3().k().m(karaokeSearch);
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
                EmokaraSearchFragment.this.S3().l().m(co.b.a(false));
                return wn.v.f59242a;
            } catch (Throwable th2) {
                EmokaraSearchFragment.this.S3().l().m(co.b.a(false));
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<rf.a> {

        /* renamed from: w  reason: collision with root package name */
        public static final k f23012w = new k();

        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.a invoke() {
            return (rf.a) new t0.d().a(rf.a.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23013w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23014x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23015y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23013w = componentCallbacks;
            this.f23014x = aVar;
            this.f23015y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f23013w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f23014x, this.f23015y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23016w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23017x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23018y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23016w = componentCallbacks;
            this.f23017x = aVar;
            this.f23018y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23016w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.d0.class), this.f23017x, this.f23018y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<hf.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23019w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23020x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23021y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23019w = componentCallbacks;
            this.f23020x = aVar;
            this.f23021y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.p, java.lang.Object] */
        @Override // io.a
        public final hf.p invoke() {
            ComponentCallbacks componentCallbacks = this.f23019w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.p.class), this.f23020x, this.f23021y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<rf.b> {

        /* renamed from: w  reason: collision with root package name */
        public static final o f23022w = new o();

        public o() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.b invoke() {
            return (rf.b) new t0.d().a(rf.b.class);
        }
    }

    public EmokaraSearchFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B0 = wn.g.b(iVar, new l(this, null, null));
        this.C0 = wn.g.b(iVar, new m(this, null, null));
        this.D0 = wn.g.b(iVar, new n(this, null, null));
    }

    public static final void G3(EmokaraSearchFragment emokaraSearchFragment, Boolean bool) {
        p.h(emokaraSearchFragment, "this$0");
        if (bool != null) {
            bool.booleanValue();
            s sVar = emokaraSearchFragment.E0;
            if (sVar != null) {
                sVar.O0();
            }
        }
    }

    public static final void H3(EmokaraSearchFragment emokaraSearchFragment, Boolean bool) {
        p.h(emokaraSearchFragment, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                emokaraSearchFragment.a4();
            } else {
                emokaraSearchFragment.T3();
            }
        }
    }

    public static final void I3(EmokaraSearchFragment emokaraSearchFragment, KaraokeSearch karaokeSearch) {
        p.h(emokaraSearchFragment, "this$0");
        Context N2 = emokaraSearchFragment.N2();
        p.g(N2, "requireContext()");
        emokaraSearchFragment.F0 = new j1(N2, karaokeSearch.getKeyward(), karaokeSearch.getKaraokes(), karaokeSearch.getSingers(), new a(), new b(), new c());
        v2 v2Var = emokaraSearchFragment.f22993y0;
        v2 v2Var2 = null;
        if (v2Var == null) {
            p.v("binding");
            v2Var = null;
        }
        v2Var.M.setVisibility(0);
        v2 v2Var3 = emokaraSearchFragment.f22993y0;
        if (v2Var3 == null) {
            p.v("binding");
            v2Var3 = null;
        }
        v2Var3.L.setVisibility(8);
        v2 v2Var4 = emokaraSearchFragment.f22993y0;
        if (v2Var4 == null) {
            p.v("binding");
        } else {
            v2Var2 = v2Var4;
        }
        v2Var2.M.setAdapter(emokaraSearchFragment.F0);
    }

    public static final void J3(EmokaraSearchFragment emokaraSearchFragment, List list) {
        p.h(emokaraSearchFragment, "this$0");
        if (list != null) {
            v2 v2Var = null;
            if (list.isEmpty()) {
                v2 v2Var2 = emokaraSearchFragment.f22993y0;
                if (v2Var2 == null) {
                    p.v("binding");
                    v2Var2 = null;
                }
                v2Var2.M.setVisibility(8);
                v2 v2Var3 = emokaraSearchFragment.f22993y0;
                if (v2Var3 == null) {
                    p.v("binding");
                } else {
                    v2Var = v2Var3;
                }
                v2Var.L.setVisibility(8);
                return;
            }
            v2 v2Var4 = emokaraSearchFragment.f22993y0;
            if (v2Var4 == null) {
                p.v("binding");
                v2Var4 = null;
            }
            v2Var4.M.setVisibility(8);
            v2 v2Var5 = emokaraSearchFragment.f22993y0;
            if (v2Var5 == null) {
                p.v("binding");
                v2Var5 = null;
            }
            v2Var5.L.setVisibility(0);
            emokaraSearchFragment.G0 = new e1(list, new d(), new e());
            v2 v2Var6 = emokaraSearchFragment.f22993y0;
            if (v2Var6 == null) {
                p.v("binding");
            } else {
                v2Var = v2Var6;
            }
            v2Var.L.setAdapter(emokaraSearchFragment.G0);
        }
    }

    public static final void K3(EmokaraSearchFragment emokaraSearchFragment, v vVar) {
        s sVar;
        p.h(emokaraSearchFragment, "this$0");
        KaraokeDetail f10 = emokaraSearchFragment.S3().h().f();
        if (f10 == null || (sVar = emokaraSearchFragment.E0) == null) {
            return;
        }
        p.g(vVar, "karaokeModel");
        sVar.N0(f10, vVar);
    }

    public static final void U3(EmokaraSearchFragment emokaraSearchFragment) {
        p.h(emokaraSearchFragment, "this$0");
        v2 v2Var = emokaraSearchFragment.f22993y0;
        if (v2Var == null) {
            p.v("binding");
            v2Var = null;
        }
        v2Var.H.setVisibility(8);
    }

    public static final void V3(EmokaraSearchFragment emokaraSearchFragment, View view) {
        p.h(emokaraSearchFragment, "this$0");
        w.b(emokaraSearchFragment.Q2()).t();
        of.j.f45405a.c(emokaraSearchFragment.N2(), emokaraSearchFragment.Z0());
    }

    public static final boolean W3(EmokaraSearchFragment emokaraSearchFragment, v2 v2Var, TextView textView, int i10, KeyEvent keyEvent) {
        p.h(emokaraSearchFragment, "this$0");
        p.h(v2Var, "$this_apply");
        if (i10 == 3 || i10 == 6) {
            emokaraSearchFragment.Z3(v2Var.K.getText().toString());
            of.j.f45405a.c(emokaraSearchFragment.N2(), textView);
            return true;
        }
        return false;
    }

    public static final void X3(v2 v2Var, View view) {
        p.h(v2Var, "$this_apply");
        v2Var.K.setText("");
    }

    public static final void Y3(EmokaraSearchFragment emokaraSearchFragment) {
        p.h(emokaraSearchFragment, "this$0");
        v2 v2Var = emokaraSearchFragment.f22993y0;
        v2 v2Var2 = null;
        if (v2Var == null) {
            p.v("binding");
            v2Var = null;
        }
        v2Var.K.requestFocus();
        of.j jVar = of.j.f45405a;
        Context N2 = emokaraSearchFragment.N2();
        v2 v2Var3 = emokaraSearchFragment.f22993y0;
        if (v2Var3 == null) {
            p.v("binding");
        } else {
            v2Var2 = v2Var3;
        }
        of.j.e(jVar, N2, v2Var2.K, 0, 4, null);
    }

    public static final void b4(EmokaraSearchFragment emokaraSearchFragment) {
        p.h(emokaraSearchFragment, "this$0");
        v2 v2Var = emokaraSearchFragment.f22993y0;
        if (v2Var == null) {
            p.v("binding");
            v2Var = null;
        }
        v2Var.H.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        final v2 T = v2.T(LayoutInflater.from(q0()), viewGroup, false);
        p.g(T, "inflate(\n            Lay…          false\n        )");
        T.B.setOnClickListener(new View.OnClickListener() { // from class: bc.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmokaraSearchFragment.V3(EmokaraSearchFragment.this, view);
            }
        });
        T.K.addTextChangedListener(new h(T));
        T.K.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: bc.t0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean W3;
                W3 = EmokaraSearchFragment.W3(EmokaraSearchFragment.this, T, textView, i10, keyEvent);
                return W3;
            }
        });
        T.C.setOnClickListener(new View.OnClickListener() { // from class: bc.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmokaraSearchFragment.X3(ac.v2.this, view);
            }
        });
        RecyclerView recyclerView = T.M;
        i iVar = new i(q0(), new LinearLayoutManager(j0()).w2());
        Drawable f10 = c3.a.f(N2(), xb.n.divider_left_margin16_white_two);
        if (f10 != null) {
            iVar.n(f10);
        }
        recyclerView.g(iVar);
        KaraokeSearch f11 = S3().k().f();
        if (f11 != null) {
            S3().k().m(f11);
        }
        this.f22993y0 = T;
        F3();
        N3();
        Puree.d(KaraokeLog.Companion.createOpenSearchLog(P3().c()));
        v2 v2Var = this.f22993y0;
        if (v2Var == null) {
            p.v("binding");
            v2Var = null;
        }
        View u10 = v2Var.u();
        p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        r0.d(this, null, 1, null);
        super.F1();
    }

    public final void F3() {
        S3().j().i(a1(), new androidx.lifecycle.f0() { // from class: bc.u0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSearchFragment.K3(EmokaraSearchFragment.this, (jf.v) obj);
            }
        });
        S3().f().i(a1(), new androidx.lifecycle.f0() { // from class: bc.w0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSearchFragment.G3(EmokaraSearchFragment.this, (Boolean) obj);
            }
        });
        S3().l().i(a1(), new androidx.lifecycle.f0() { // from class: bc.x0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSearchFragment.H3(EmokaraSearchFragment.this, (Boolean) obj);
            }
        });
        S3().k().i(a1(), new androidx.lifecycle.f0() { // from class: bc.v0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSearchFragment.I3(EmokaraSearchFragment.this, (KaraokeSearch) obj);
            }
        });
        R3().f().i(a1(), new androidx.lifecycle.f0() { // from class: bc.y0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmokaraSearchFragment.J3(EmokaraSearchFragment.this, (List) obj);
            }
        });
    }

    @Override // bc.d0
    public void G() {
        j1 j1Var;
        if (this.E0 == null || (j1Var = this.F0) == null) {
            return;
        }
        j1Var.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.E0 = null;
        super.I1();
    }

    public final void L3(KaraokeDetail karaokeDetail) {
        uo.l.d(this, null, null, new f(karaokeDetail, null), 3, null);
    }

    public final void M3(String str, int i10) {
        S3().l().m(Boolean.TRUE);
        uo.l.d(this, null, null, new g(str, i10, null), 3, null);
    }

    public final void N3() {
        R3().f().m(O3().c());
    }

    public final hf.p O3() {
        return (hf.p) this.D0.getValue();
    }

    public final hf.d0 P3() {
        return (hf.d0) this.C0.getValue();
    }

    public final MRRequest Q3() {
        return (MRRequest) this.B0.getValue();
    }

    public final rf.a R3() {
        return (rf.a) this.A0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        of.j.f45405a.c(N2(), Z0());
        super.S1();
    }

    public final rf.b S3() {
        return (rf.b) this.f22994z0.getValue();
    }

    public final void T3() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.a1
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSearchFragment.U3(EmokaraSearchFragment.this);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        new Handler().postDelayed(new Runnable() { // from class: bc.r0
            @Override // java.lang.Runnable
            public final void run() {
                EmokaraSearchFragment.Y3(EmokaraSearchFragment.this);
            }
        }, 200L);
    }

    public final void Z3(String str) {
        p.h(str, "keyword");
        if (str.length() == 0) {
            j1 j1Var = this.F0;
            if (j1Var != null) {
                j1Var.clear();
                return;
            }
            return;
        }
        O3().a(str);
        S3().l().m(Boolean.TRUE);
        uo.l.d(this, null, null, new j(str, null), 3, null);
    }

    public final void a4() {
        androidx.fragment.app.h j02 = j0();
        if (j02 != null) {
            j02.runOnUiThread(new Runnable() { // from class: bc.z0
                @Override // java.lang.Runnable
                public final void run() {
                    EmokaraSearchFragment.b4(EmokaraSearchFragment.this);
                }
            });
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f22992x0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.E0 = context instanceof s ? (s) context : null;
    }
}
