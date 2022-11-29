package ai;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes3.dex */
public final class wv {

    /* renamed from: a  reason: collision with root package name */
    public final Date f11760a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11761b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f11762c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11763d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<String> f11764e;

    /* renamed from: f  reason: collision with root package name */
    public final Location f11765f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f11766g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<Object>, Object> f11767h;

    /* renamed from: i  reason: collision with root package name */
    public final String f11768i;

    /* renamed from: j  reason: collision with root package name */
    public final String f11769j;
    @NotOnlyInitialized

    /* renamed from: k  reason: collision with root package name */
    public final hh.a f11770k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11771l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<String> f11772m;

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f11773n;

    /* renamed from: o  reason: collision with root package name */
    public final Set<String> f11774o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f11775p;

    /* renamed from: q  reason: collision with root package name */
    public final fh.a f11776q;

    /* renamed from: r  reason: collision with root package name */
    public final String f11777r;

    /* renamed from: s  reason: collision with root package name */
    public final int f11778s;

    public wv(vv vvVar, hh.a aVar) {
        Date date;
        String str;
        List<String> list;
        int i10;
        HashSet hashSet;
        Location location;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i11;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z10;
        String str4;
        int i12;
        fh.a unused;
        date = vvVar.f11372g;
        this.f11760a = date;
        str = vvVar.f11373h;
        this.f11761b = str;
        list = vvVar.f11374i;
        this.f11762c = list;
        i10 = vvVar.f11375j;
        this.f11763d = i10;
        hashSet = vvVar.f11366a;
        this.f11764e = Collections.unmodifiableSet(hashSet);
        location = vvVar.f11376k;
        this.f11765f = location;
        bundle = vvVar.f11367b;
        this.f11766g = bundle;
        hashMap = vvVar.f11368c;
        this.f11767h = Collections.unmodifiableMap(hashMap);
        str2 = vvVar.f11377l;
        this.f11768i = str2;
        str3 = vvVar.f11378m;
        this.f11769j = str3;
        i11 = vvVar.f11379n;
        this.f11771l = i11;
        hashSet2 = vvVar.f11369d;
        this.f11772m = Collections.unmodifiableSet(hashSet2);
        bundle2 = vvVar.f11370e;
        this.f11773n = bundle2;
        hashSet3 = vvVar.f11371f;
        this.f11774o = Collections.unmodifiableSet(hashSet3);
        z10 = vvVar.f11380o;
        this.f11775p = z10;
        unused = vvVar.f11381p;
        str4 = vvVar.f11382q;
        this.f11777r = str4;
        i12 = vvVar.f11383r;
        this.f11778s = i12;
    }

    @Deprecated
    public final Date a() {
        return this.f11760a;
    }

    public final String b() {
        return this.f11761b;
    }

    public final List<String> c() {
        return new ArrayList(this.f11762c);
    }

    @Deprecated
    public final int d() {
        return this.f11763d;
    }

    public final Set<String> e() {
        return this.f11764e;
    }

    public final Location f() {
        return this.f11765f;
    }

    public final Bundle g(Class<Object> cls) {
        return this.f11766g.getBundle(cls.getName());
    }

    public final String h() {
        return this.f11768i;
    }

    public final String i() {
        return this.f11769j;
    }

    public final hh.a j() {
        return this.f11770k;
    }

    public final boolean k(Context context) {
        rg.s b10 = zv.a().b();
        dt.a();
        String r10 = nj0.r(context);
        return this.f11772m.contains(r10) || b10.d().contains(r10);
    }

    public final Map<Class<Object>, Object> l() {
        return this.f11767h;
    }

    public final Bundle m() {
        return this.f11766g;
    }

    public final int n() {
        return this.f11771l;
    }

    public final Bundle o() {
        return this.f11773n;
    }

    public final Set<String> p() {
        return this.f11774o;
    }

    @Deprecated
    public final boolean q() {
        return this.f11775p;
    }

    public final fh.a r() {
        return this.f11776q;
    }

    public final String s() {
        return this.f11777r;
    }

    public final int t() {
        return this.f11778s;
    }
}
