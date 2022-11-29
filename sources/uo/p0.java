package uo;

import ao.g;

/* loaded from: classes4.dex */
public final class p0 extends ao.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f56075x = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final String f56076w;

    /* loaded from: classes4.dex */
    public static final class a implements g.c<p0> {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public p0(String str) {
        super(f56075x);
        this.f56076w = str;
    }

    public final String X() {
        return this.f56076w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && jo.p.c(this.f56076w, ((p0) obj).f56076w);
    }

    public int hashCode() {
        return this.f56076w.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f56076w + ')';
    }
}
