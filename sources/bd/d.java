package bd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final a f17561h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f17562i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final e0<String> f17563a;

    /* renamed from: b  reason: collision with root package name */
    public final e0<String> f17564b;

    /* renamed from: c  reason: collision with root package name */
    public final e0<String> f17565c;

    /* renamed from: d  reason: collision with root package name */
    public final e0<String> f17566d;

    /* renamed from: e  reason: collision with root package name */
    public final LiveData<Boolean> f17567e;

    /* renamed from: f  reason: collision with root package name */
    public final LiveData<Float> f17568f;

    /* renamed from: g  reason: collision with root package name */
    public final LiveData<Boolean> f17569g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f17570a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f17571b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f17572c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f17573d;

        public b(c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3) {
            this.f17570a = c0Var;
            this.f17571b = liveData;
            this.f17572c = liveData2;
            this.f17573d = liveData3;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f17570a.f();
            Object f11 = this.f17571b.f();
            Object f12 = this.f17572c.f();
            Object f13 = this.f17573d.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null) {
                return;
            }
            c0 c0Var = this.f17570a;
            String str = (String) f13;
            String str2 = (String) f12;
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf((((String) f11).length() > 0) & (str2.length() > 0) & (str.length() > 0)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(String str) {
            String str2 = str;
            p.g(str2, "it");
            return Boolean.valueOf(str2.length() > 0);
        }
    }

    /* renamed from: bd.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0118d<I, O> implements n.a {
        @Override // n.a
        public final Float apply(Boolean bool) {
            return Float.valueOf(bool.booleanValue() ? 1.0f : 0.5f);
        }
    }

    public d() {
        this(null, null, null, null, 15, null);
    }

    public d(e0<String> e0Var, e0<String> e0Var2, e0<String> e0Var3, e0<String> e0Var4) {
        p.h(e0Var, "bankName");
        p.h(e0Var2, "bankId");
        p.h(e0Var3, "bankBranchCode");
        p.h(e0Var4, "bankAccountNumber");
        this.f17563a = e0Var;
        this.f17564b = e0Var2;
        this.f17565c = e0Var3;
        this.f17566d = e0Var4;
        LiveData<Boolean> b10 = p0.b(e0Var, new c());
        p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        this.f17567e = b10;
        LiveData<Float> b11 = p0.b(b10, new C0118d());
        p.g(b11, "crossinline transform: (…p(this) { transform(it) }");
        this.f17568f = b11;
        Boolean bool = Boolean.FALSE;
        c0 c0Var = new c0();
        c0Var.p(bool);
        for (LiveData liveData : s.m(e0Var, e0Var3, e0Var4)) {
            c0Var.q(liveData, new b(c0Var, e0Var, e0Var3, e0Var4));
        }
        LiveData<Boolean> a10 = p0.a(c0Var);
        p.g(a10, "distinctUntilChanged(this)");
        this.f17569g = a10;
    }

    public final e0<String> a() {
        return this.f17566d;
    }

    public final e0<String> b() {
        return this.f17565c;
    }

    public final e0<String> c() {
        return this.f17564b;
    }

    public final e0<String> d() {
        return this.f17563a;
    }

    public final LiveData<Float> e() {
        return this.f17568f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return p.c(this.f17563a, dVar.f17563a) && p.c(this.f17564b, dVar.f17564b) && p.c(this.f17565c, dVar.f17565c) && p.c(this.f17566d, dVar.f17566d);
        }
        return false;
    }

    public final LiveData<Boolean> f() {
        return this.f17569g;
    }

    public final LiveData<Boolean> g() {
        return this.f17567e;
    }

    public int hashCode() {
        return (((((this.f17563a.hashCode() * 31) + this.f17564b.hashCode()) * 31) + this.f17565c.hashCode()) * 31) + this.f17566d.hashCode();
    }

    public String toString() {
        return "ContractEditBankAccountViewBindModel(bankName=" + this.f17563a + ", bankId=" + this.f17564b + ", bankBranchCode=" + this.f17565c + ", bankAccountNumber=" + this.f17566d + ')';
    }

    public /* synthetic */ d(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, int i10, h hVar) {
        this((i10 & 1) != 0 ? new e0("") : e0Var, (i10 & 2) != 0 ? new e0("") : e0Var2, (i10 & 4) != 0 ? new e0("") : e0Var3, (i10 & 8) != 0 ? new e0("") : e0Var4);
    }
}
