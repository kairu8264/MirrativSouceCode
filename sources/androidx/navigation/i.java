package androidx.navigation;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final v f15738a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15739b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15740c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15741d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public v<?> f15742a;

        /* renamed from: c  reason: collision with root package name */
        public Object f15744c;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15743b = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15745d = false;

        public i a() {
            if (this.f15742a == null) {
                this.f15742a = v.e(this.f15744c);
            }
            return new i(this.f15742a, this.f15743b, this.f15744c, this.f15745d);
        }

        public a b(Object obj) {
            this.f15744c = obj;
            this.f15745d = true;
            return this;
        }

        public a c(boolean z10) {
            this.f15743b = z10;
            return this;
        }

        public a d(v<?> vVar) {
            this.f15742a = vVar;
            return this;
        }
    }

    public i(v<?> vVar, boolean z10, Object obj, boolean z11) {
        if (!vVar.f() && z10) {
            throw new IllegalArgumentException(vVar.c() + " does not allow nullable values");
        } else if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + vVar.c() + " has null value but is not nullable.");
        } else {
            this.f15738a = vVar;
            this.f15739b = z10;
            this.f15741d = obj;
            this.f15740c = z11;
        }
    }

    public v<?> a() {
        return this.f15738a;
    }

    public boolean b() {
        return this.f15740c;
    }

    public void c(String str, Bundle bundle) {
        if (this.f15740c) {
            this.f15738a.i(bundle, str, this.f15741d);
        }
    }

    public boolean d(String str, Bundle bundle) {
        if (!this.f15739b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f15738a.b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f15739b == iVar.f15739b && this.f15740c == iVar.f15740c && this.f15738a.equals(iVar.f15738a)) {
            Object obj2 = this.f15741d;
            return obj2 != null ? obj2.equals(iVar.f15741d) : iVar.f15741d == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f15738a.hashCode() * 31) + (this.f15739b ? 1 : 0)) * 31) + (this.f15740c ? 1 : 0)) * 31;
        Object obj = this.f15741d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
