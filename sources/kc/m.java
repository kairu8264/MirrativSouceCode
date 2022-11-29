package kc;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38596a;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<Boolean> f38597b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<Integer> f38598c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<Boolean> f38599d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<Float> f38600e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<Boolean> f38601f;

    /* renamed from: g  reason: collision with root package name */
    public final LiveData<Boolean> f38602g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<Boolean> f38603h;

    /* renamed from: i  reason: collision with root package name */
    public final e0<String> f38604i;

    /* renamed from: j  reason: collision with root package name */
    public final c0<String> f38605j;

    /* renamed from: k  reason: collision with root package name */
    public final c0<String> f38606k;

    /* renamed from: l  reason: collision with root package name */
    public final c0<Integer> f38607l;

    /* loaded from: classes2.dex */
    public static final class a<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f38608a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f38609b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f38610c;

        public a(c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f38608a = c0Var;
            this.f38609b = liveData;
            this.f38610c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f38608a.f();
            Object f11 = this.f38609b.f();
            Object f12 = this.f38610c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            wn.k kVar = (wn.k) f10;
            this.f38608a.p(wn.q.a(Boolean.valueOf(((Boolean) f11).booleanValue()), Integer.valueOf(((Number) f12).intValue())));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f38611a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f38612b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f38613c;

        public b(c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f38611a = c0Var;
            this.f38612b = liveData;
            this.f38613c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            int i10;
            T f10 = this.f38611a.f();
            Object f11 = this.f38612b.f();
            Object f12 = this.f38613c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            c0 c0Var = this.f38611a;
            float floatValue = ((Number) f12).floatValue();
            Integer num = (Integer) f10;
            if (((Boolean) f11).booleanValue()) {
                i10 = Integer.valueOf((int) (floatValue * 10.0f));
            } else {
                i10 = 0;
            }
            c0Var.p(i10);
        }
    }

    public m(Context context, LiveData<Boolean> liveData, LiveData<Integer> liveData2, LiveData<Boolean> liveData3, LiveData<Float> liveData4, LiveData<Boolean> liveData5, LiveData<Boolean> liveData6, LiveData<Boolean> liveData7, e0<String> e0Var) {
        jo.p.h(context, "applicationContext");
        jo.p.h(liveData, "isCollabEnabled");
        jo.p.h(liveData2, "maxCollabUserNum");
        jo.p.h(liveData3, "isTtsEnabled");
        jo.p.h(liveData4, "ttsVolume");
        jo.p.h(liveData5, "isCatalogEmomoEnabled");
        jo.p.h(liveData6, "isHideNotificationEnabled");
        jo.p.h(liveData7, "isInGameGift");
        jo.p.h(e0Var, "memoText");
        this.f38596a = context;
        this.f38597b = liveData;
        this.f38598c = liveData2;
        this.f38599d = liveData3;
        this.f38600e = liveData4;
        this.f38601f = liveData5;
        this.f38602g = liveData6;
        this.f38603h = liveData7;
        this.f38604i = e0Var;
        final c0<String> c0Var = new c0<>();
        c0Var.q(e0Var, new f0() { // from class: kc.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.l(c0.this, (String) obj);
            }
        });
        this.f38605j = c0Var;
        final c0<String> c0Var2 = new c0<>();
        wn.k a10 = wn.q.a(Boolean.FALSE, 0);
        c0 c0Var3 = new c0();
        c0Var3.p(a10);
        for (LiveData liveData8 : xn.s.m(liveData, liveData2)) {
            c0Var3.q(liveData8, new a(c0Var3, liveData, liveData2));
        }
        LiveData<S> a11 = p0.a(c0Var3);
        jo.p.g(a11, "distinctUntilChanged(this)");
        c0Var2.q(a11, new f0() { // from class: kc.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.d(c0.this, this, (wn.k) obj);
            }
        });
        this.f38606k = c0Var2;
        final c0<Integer> c0Var4 = new c0<>();
        LiveData<Boolean> liveData9 = this.f38599d;
        LiveData<Float> liveData10 = this.f38600e;
        c0 c0Var5 = new c0();
        c0Var5.p(0);
        for (LiveData liveData11 : xn.s.m(liveData9, liveData10)) {
            c0Var5.q(liveData11, new b(c0Var5, liveData9, liveData10));
        }
        LiveData<S> a12 = p0.a(c0Var5);
        jo.p.g(a12, "distinctUntilChanged(this)");
        c0Var4.q(a12, new f0() { // from class: kc.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.m(c0.this, (Integer) obj);
            }
        });
        this.f38607l = c0Var4;
    }

    public static final void d(c0 c0Var, m mVar, wn.k kVar) {
        String string;
        jo.p.h(c0Var, "$this_apply");
        jo.p.h(mVar, "this$0");
        boolean booleanValue = ((Boolean) kVar.a()).booleanValue();
        int intValue = ((Number) kVar.b()).intValue();
        if (booleanValue) {
            string = mVar.f38596a.getString(xb.r.G1, String.valueOf(intValue));
        } else {
            string = mVar.f38596a.getString(xb.r.text_not_allowed);
        }
        c0Var.p(string);
    }

    public static final void l(c0 c0Var, String str) {
        jo.p.h(c0Var, "$this_apply");
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb2.append(de.l.a(str));
        sb2.append("/200");
        c0Var.p(sb2.toString());
    }

    public static final void m(c0 c0Var, Integer num) {
        jo.p.h(c0Var, "$this_apply");
        c0Var.p(num);
    }

    public final c0<String> e() {
        return this.f38606k;
    }

    public final e0<String> f() {
        return this.f38604i;
    }

    public final c0<String> g() {
        return this.f38605j;
    }

    public final c0<Integer> h() {
        return this.f38607l;
    }

    public final LiveData<Boolean> i() {
        return this.f38601f;
    }

    public final LiveData<Boolean> j() {
        return this.f38602g;
    }

    public final LiveData<Boolean> k() {
        return this.f38603h;
    }

    public /* synthetic */ m(Context context, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, LiveData liveData5, LiveData liveData6, LiveData liveData7, e0 e0Var, int i10, jo.h hVar) {
        this(context, liveData, liveData2, liveData3, liveData4, liveData5, liveData6, liveData7, (i10 & 256) != 0 ? new e0(null) : e0Var);
    }
}
