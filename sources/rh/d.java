package rh;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Account f51414a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f51415b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f51416c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<com.google.android.gms.common.api.a<?>, a0> f51417d;

    /* renamed from: e  reason: collision with root package name */
    public final int f51418e;

    /* renamed from: f  reason: collision with root package name */
    public final View f51419f;

    /* renamed from: g  reason: collision with root package name */
    public final String f51420g;

    /* renamed from: h  reason: collision with root package name */
    public final String f51421h;

    /* renamed from: i  reason: collision with root package name */
    public final si.a f51422i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f51423j;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Account f51424a;

        /* renamed from: b  reason: collision with root package name */
        public s.b<Scope> f51425b;

        /* renamed from: c  reason: collision with root package name */
        public String f51426c;

        /* renamed from: d  reason: collision with root package name */
        public String f51427d;

        /* renamed from: e  reason: collision with root package name */
        public si.a f51428e = si.a.f52699k;

        public d a() {
            return new d(this.f51424a, this.f51425b, null, 0, null, this.f51426c, this.f51427d, this.f51428e, false);
        }

        public a b(String str) {
            this.f51426c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.f51425b == null) {
                this.f51425b = new s.b<>();
            }
            this.f51425b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f51424a = account;
            return this;
        }

        public final a e(String str) {
            this.f51427d = str;
            return this;
        }
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, a0> map, int i10, View view, String str, String str2, si.a aVar, boolean z10) {
        this.f51414a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f51415b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f51417d = map;
        this.f51419f = view;
        this.f51418e = i10;
        this.f51420g = str;
        this.f51421h = str2;
        this.f51422i = aVar == null ? si.a.f52699k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (a0 a0Var : map.values()) {
            hashSet.addAll(a0Var.f51396a);
        }
        this.f51416c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f51414a;
    }

    public Account b() {
        Account account = this.f51414a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f51416c;
    }

    public String d() {
        return this.f51420g;
    }

    public Set<Scope> e() {
        return this.f51415b;
    }

    public final si.a f() {
        return this.f51422i;
    }

    public final Integer g() {
        return this.f51423j;
    }

    public final String h() {
        return this.f51421h;
    }

    public final void i(Integer num) {
        this.f51423j = num;
    }
}
