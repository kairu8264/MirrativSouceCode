package bd;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import jo.p;
import wn.l;
import wn.m;
import xn.s;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f17574n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f17575o = 8;

    /* renamed from: a  reason: collision with root package name */
    public final e0<String> f17576a;

    /* renamed from: b  reason: collision with root package name */
    public final e0<String> f17577b;

    /* renamed from: c  reason: collision with root package name */
    public final e0<String> f17578c;

    /* renamed from: d  reason: collision with root package name */
    public final e0<String> f17579d;

    /* renamed from: e  reason: collision with root package name */
    public final e0<Integer> f17580e;

    /* renamed from: f  reason: collision with root package name */
    public final e0<String> f17581f;

    /* renamed from: g  reason: collision with root package name */
    public final e0<String> f17582g;

    /* renamed from: h  reason: collision with root package name */
    public final LiveData<Boolean> f17583h;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<Boolean> f17584i;

    /* renamed from: j  reason: collision with root package name */
    public final LiveData<Boolean> f17585j;

    /* renamed from: k  reason: collision with root package name */
    public final LiveData<String> f17586k;
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: l  reason: collision with root package name */
    public final LiveData<String> f17587l;

    /* renamed from: m  reason: collision with root package name */
    public final LiveData<Boolean> f17588m;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f17589a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f17590b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f17591c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f17592d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ LiveData f17593e;

        public b(c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4) {
            this.f17589a = c0Var;
            this.f17590b = liveData;
            this.f17591c = liveData2;
            this.f17592d = liveData3;
            this.f17593e = liveData4;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f17589a.f();
            Object f11 = this.f17590b.f();
            Object f12 = this.f17591c.f();
            Object f13 = this.f17592d.f();
            Object f14 = this.f17593e.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null || f14 == null) {
                return;
            }
            c0 c0Var = this.f17589a;
            String str = (String) f14;
            String str2 = (String) f13;
            String str3 = (String) f12;
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf((((String) f11).length() > 0) & (str3.length() > 0) & (str2.length() > 0) & (str.length() > 0)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f17594a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f17595b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f17596c;

        public c(c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f17594a = c0Var;
            this.f17595b = liveData;
            this.f17596c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f17594a.f();
            Object f11 = this.f17595b.f();
            Object f12 = this.f17596c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            c0 c0Var = this.f17594a;
            String str = (String) f12;
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf((((String) f11).length() > 0) & (str.length() > 0)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f17597a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f17598b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f17599c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f17600d;

        public d(c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3) {
            this.f17597a = c0Var;
            this.f17598b = liveData;
            this.f17599c = liveData2;
            this.f17600d = liveData3;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f17597a.f();
            Object f11 = this.f17598b.f();
            Object f12 = this.f17599c.f();
            Object f13 = this.f17600d.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null) {
                return;
            }
            c0 c0Var = this.f17597a;
            boolean booleanValue = ((Boolean) f13).booleanValue();
            boolean booleanValue2 = ((Boolean) f12).booleanValue();
            boolean booleanValue3 = ((Boolean) f11).booleanValue();
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf(booleanValue3 & booleanValue2 & booleanValue));
        }
    }

    /* renamed from: bd.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0119e<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f17601a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f17602b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f17603c;

        public C0119e(c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f17601a = c0Var;
            this.f17602b = liveData;
            this.f17603c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f17601a.f();
            Object f11 = this.f17602b.f();
            Object f12 = this.f17603c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            c0 c0Var = this.f17601a;
            String str = (String) f10;
            c0Var.p(((String) f11) + ' ' + ((String) f12));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(Integer num) {
            Integer num2 = num;
            return Boolean.valueOf(num2 == null || num2.intValue() != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<I, O> implements n.a {
        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // n.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String apply(java.lang.Integer r4) {
            /*
                r3 = this;
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r0 = 0
                wn.l$a r1 = wn.l.f59224w     // Catch: java.lang.Throwable -> L2c
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L2c
                java.lang.String r2 = "yyyyMMdd"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
                java.util.Date r4 = r1.parse(r4)     // Catch: java.lang.Throwable -> L2c
                if (r4 != 0) goto L17
                goto L41
            L17:
                java.lang.String r1 = "SimpleDateFormat(\"yyyyMM…tring) ?: return@let null"
                jo.p.g(r4, r1)     // Catch: java.lang.Throwable -> L2c
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L2c
                java.lang.String r2 = "yyyy年M月d日"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
                java.lang.String r4 = r1.format(r4)     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r4 = wn.l.a(r4)     // Catch: java.lang.Throwable -> L2c
                goto L37
            L2c:
                r4 = move-exception
                wn.l$a r1 = wn.l.f59224w
                java.lang.Object r4 = wn.m.a(r4)
                java.lang.Object r4 = wn.l.a(r4)
            L37:
                boolean r1 = wn.l.c(r4)
                if (r1 == 0) goto L3e
                goto L3f
            L3e:
                r0 = r4
            L3f:
                java.lang.String r0 = (java.lang.String) r0
            L41:
                if (r0 != 0) goto L45
                java.lang.String r0 = ""
            L45:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.e.g.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(String str) {
            return Boolean.valueOf(str.length() == 0);
        }
    }

    public e() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public e(e0<String> e0Var, e0<String> e0Var2, e0<String> e0Var3, e0<String> e0Var4, e0<Integer> e0Var5, e0<String> e0Var6, e0<String> e0Var7) {
        p.h(e0Var, "lastNameKanji");
        p.h(e0Var2, "firstNameKanji");
        p.h(e0Var3, "lastName");
        p.h(e0Var4, "firstName");
        p.h(e0Var5, "birthDay");
        p.h(e0Var6, "postalCode");
        p.h(e0Var7, "address");
        this.f17576a = e0Var;
        this.f17577b = e0Var2;
        this.f17578c = e0Var3;
        this.f17579d = e0Var4;
        this.f17580e = e0Var5;
        this.f17581f = e0Var6;
        this.f17582g = e0Var7;
        Boolean bool = Boolean.FALSE;
        c0 c0Var = new c0();
        c0Var.p(bool);
        for (LiveData liveData : s.m(e0Var, e0Var2, e0Var3, e0Var4)) {
            c0Var.q(liveData, new b(c0Var, e0Var, e0Var2, e0Var3, e0Var4));
        }
        LiveData<Boolean> a10 = p0.a(c0Var);
        p.g(a10, "distinctUntilChanged(this)");
        this.f17583h = a10;
        Boolean bool2 = Boolean.FALSE;
        e0<String> e0Var8 = this.f17581f;
        e0<String> e0Var9 = this.f17582g;
        c0 c0Var2 = new c0();
        c0Var2.p(bool2);
        for (LiveData liveData2 : s.m(e0Var8, e0Var9)) {
            c0Var2.q(liveData2, new c(c0Var2, e0Var8, e0Var9));
        }
        LiveData<Boolean> a11 = p0.a(c0Var2);
        p.g(a11, "distinctUntilChanged(this)");
        this.f17584i = a11;
        Boolean bool3 = Boolean.FALSE;
        LiveData<Boolean> liveData3 = this.f17583h;
        LiveData b10 = p0.b(this.f17580e, new f());
        p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        c0 c0Var3 = new c0();
        c0Var3.p(bool3);
        for (LiveData liveData4 : s.m(liveData3, a11, b10)) {
            c0Var3.q(liveData4, new d(c0Var3, liveData3, a11, b10));
        }
        LiveData<Boolean> a12 = p0.a(c0Var3);
        p.g(a12, "distinctUntilChanged(this)");
        this.f17585j = a12;
        e0<String> e0Var10 = this.f17578c;
        e0<String> e0Var11 = this.f17579d;
        c0 c0Var4 = new c0();
        c0Var4.p("");
        for (LiveData liveData5 : s.m(e0Var10, e0Var11)) {
            c0Var4.q(liveData5, new C0119e(c0Var4, e0Var10, e0Var11));
        }
        LiveData<String> a13 = p0.a(c0Var4);
        p.g(a13, "distinctUntilChanged(this)");
        this.f17586k = a13;
        LiveData<String> b11 = p0.b(this.f17580e, new g());
        p.g(b11, "crossinline transform: (…p(this) { transform(it) }");
        this.f17587l = b11;
        LiveData<Boolean> b12 = p0.b(b11, new h());
        p.g(b12, "crossinline transform: (…p(this) { transform(it) }");
        this.f17588m = b12;
    }

    public final int a() {
        Calendar b10 = b();
        if (b10 == null) {
            b10 = Calendar.getInstance();
        }
        return b10.get(2);
    }

    @SuppressLint({"SimpleDateFormat"})
    public final Calendar b() {
        Object a10;
        Integer f10 = this.f17580e.f();
        if (f10 == null) {
            return null;
        }
        int intValue = f10.intValue();
        try {
            l.a aVar = l.f59224w;
            a10 = l.a(new SimpleDateFormat("yyyyMMdd").parse(String.valueOf(intValue)));
        } catch (Throwable th2) {
            l.a aVar2 = l.f59224w;
            a10 = l.a(m.a(th2));
        }
        if (l.c(a10)) {
            a10 = null;
        }
        Date date = (Date) a10;
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public final int c() {
        Calendar b10 = b();
        if (b10 == null) {
            b10 = Calendar.getInstance();
        }
        return b10.get(5);
    }

    public final int d() {
        Calendar b10 = b();
        if (b10 == null) {
            b10 = Calendar.getInstance();
        }
        return b10.get(1);
    }

    public final e0<String> e() {
        return this.f17582g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return p.c(this.f17576a, eVar.f17576a) && p.c(this.f17577b, eVar.f17577b) && p.c(this.f17578c, eVar.f17578c) && p.c(this.f17579d, eVar.f17579d) && p.c(this.f17580e, eVar.f17580e) && p.c(this.f17581f, eVar.f17581f) && p.c(this.f17582g, eVar.f17582g);
        }
        return false;
    }

    public final e0<Integer> f() {
        return this.f17580e;
    }

    public final LiveData<String> g() {
        return this.f17587l;
    }

    public final e0<String> h() {
        return this.f17579d;
    }

    public int hashCode() {
        return (((((((((((this.f17576a.hashCode() * 31) + this.f17577b.hashCode()) * 31) + this.f17578c.hashCode()) * 31) + this.f17579d.hashCode()) * 31) + this.f17580e.hashCode()) * 31) + this.f17581f.hashCode()) * 31) + this.f17582g.hashCode();
    }

    public final e0<String> i() {
        return this.f17577b;
    }

    public final e0<String> j() {
        return this.f17578c;
    }

    public final e0<String> k() {
        return this.f17576a;
    }

    public final e0<String> l() {
        return this.f17581f;
    }

    public final LiveData<Boolean> m() {
        return this.f17585j;
    }

    public final LiveData<Boolean> n() {
        return this.f17588m;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final void o(int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11, i12);
        e0<Integer> e0Var = this.f17580e;
        String format = new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
        p.g(format, "SimpleDateFormat(\"yyyyMMdd\").format(calendar.time)");
        e0Var.p(Integer.valueOf(Integer.parseInt(format)));
    }

    public String toString() {
        return "ContractEditIdentificationViewBindModel(lastNameKanji=" + this.f17576a + ", firstNameKanji=" + this.f17577b + ", lastName=" + this.f17578c + ", firstName=" + this.f17579d + ", birthDay=" + this.f17580e + ", postalCode=" + this.f17581f + ", address=" + this.f17582g + ')';
    }

    public /* synthetic */ e(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, e0 e0Var5, e0 e0Var6, e0 e0Var7, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? new e0("") : e0Var, (i10 & 2) != 0 ? new e0("") : e0Var2, (i10 & 4) != 0 ? new e0("") : e0Var3, (i10 & 8) != 0 ? new e0("") : e0Var4, (i10 & 16) != 0 ? new e0(0) : e0Var5, (i10 & 32) != 0 ? new e0("") : e0Var6, (i10 & 64) != 0 ? new e0("") : e0Var7);
    }
}
