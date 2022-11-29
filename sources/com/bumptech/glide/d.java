package com.bumptech.glide;

import android.content.Context;
import b8.p;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q7.a;
import q7.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public o7.k f20068c;

    /* renamed from: d  reason: collision with root package name */
    public p7.e f20069d;

    /* renamed from: e  reason: collision with root package name */
    public p7.b f20070e;

    /* renamed from: f  reason: collision with root package name */
    public q7.h f20071f;

    /* renamed from: g  reason: collision with root package name */
    public r7.a f20072g;

    /* renamed from: h  reason: collision with root package name */
    public r7.a f20073h;

    /* renamed from: i  reason: collision with root package name */
    public a.InterfaceC0736a f20074i;

    /* renamed from: j  reason: collision with root package name */
    public q7.i f20075j;

    /* renamed from: k  reason: collision with root package name */
    public b8.d f20076k;

    /* renamed from: n  reason: collision with root package name */
    public p.b f20079n;

    /* renamed from: o  reason: collision with root package name */
    public r7.a f20080o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f20081p;

    /* renamed from: q  reason: collision with root package name */
    public List<e8.g<Object>> f20082q;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, l<?, ?>> f20066a = new s.a();

    /* renamed from: b  reason: collision with root package name */
    public final f.a f20067b = new f.a();

    /* renamed from: l  reason: collision with root package name */
    public int f20077l = 4;

    /* renamed from: m  reason: collision with root package name */
    public c.a f20078m = new a();

    /* loaded from: classes.dex */
    public class a implements c.a {
        public a() {
        }

        @Override // com.bumptech.glide.c.a
        public e8.h a() {
            return new e8.h();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    /* renamed from: com.bumptech.glide.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0174d {
    }

    public com.bumptech.glide.c a(Context context) {
        if (this.f20072g == null) {
            this.f20072g = r7.a.g();
        }
        if (this.f20073h == null) {
            this.f20073h = r7.a.e();
        }
        if (this.f20080o == null) {
            this.f20080o = r7.a.c();
        }
        if (this.f20075j == null) {
            this.f20075j = new i.a(context).a();
        }
        if (this.f20076k == null) {
            this.f20076k = new b8.f();
        }
        if (this.f20069d == null) {
            int b10 = this.f20075j.b();
            if (b10 > 0) {
                this.f20069d = new p7.k(b10);
            } else {
                this.f20069d = new p7.f();
            }
        }
        if (this.f20070e == null) {
            this.f20070e = new p7.j(this.f20075j.a());
        }
        if (this.f20071f == null) {
            this.f20071f = new q7.g(this.f20075j.d());
        }
        if (this.f20074i == null) {
            this.f20074i = new q7.f(context);
        }
        if (this.f20068c == null) {
            this.f20068c = new o7.k(this.f20071f, this.f20074i, this.f20073h, this.f20072g, r7.a.i(), this.f20080o, this.f20081p);
        }
        List<e8.g<Object>> list = this.f20082q;
        if (list == null) {
            this.f20082q = Collections.emptyList();
        } else {
            this.f20082q = Collections.unmodifiableList(list);
        }
        f b11 = this.f20067b.b();
        return new com.bumptech.glide.c(context, this.f20068c, this.f20071f, this.f20069d, this.f20070e, new p(this.f20079n, b11), this.f20076k, this.f20077l, this.f20078m, this.f20066a, this.f20082q, b11);
    }

    public void b(p.b bVar) {
        this.f20079n = bVar;
    }
}
