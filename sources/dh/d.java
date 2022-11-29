package dh;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import rg.v;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29636a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29637b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f29638c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29639d;

    /* renamed from: e  reason: collision with root package name */
    public final v f29640e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f29641f;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public v f29645d;

        /* renamed from: a  reason: collision with root package name */
        public boolean f29642a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f29643b = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f29644c = false;

        /* renamed from: e  reason: collision with root package name */
        public int f29646e = 1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f29647f = false;

        @RecentlyNonNull
        public d a() {
            return new d(this, null);
        }

        @RecentlyNonNull
        public a b(int i10) {
            this.f29646e = i10;
            return this;
        }

        @RecentlyNonNull
        public a c(int i10) {
            this.f29643b = i10;
            return this;
        }

        @RecentlyNonNull
        public a d(boolean z10) {
            this.f29647f = z10;
            return this;
        }

        @RecentlyNonNull
        public a e(boolean z10) {
            this.f29644c = z10;
            return this;
        }

        @RecentlyNonNull
        public a f(boolean z10) {
            this.f29642a = z10;
            return this;
        }

        @RecentlyNonNull
        public a g(@RecentlyNonNull v vVar) {
            this.f29645d = vVar;
            return this;
        }
    }

    public /* synthetic */ d(a aVar, f fVar) {
        this.f29636a = aVar.f29642a;
        this.f29637b = aVar.f29643b;
        this.f29638c = aVar.f29644c;
        this.f29639d = aVar.f29646e;
        this.f29640e = aVar.f29645d;
        this.f29641f = aVar.f29647f;
    }

    public int a() {
        return this.f29639d;
    }

    public int b() {
        return this.f29637b;
    }

    @RecentlyNullable
    public v c() {
        return this.f29640e;
    }

    public boolean d() {
        return this.f29638c;
    }

    public boolean e() {
        return this.f29636a;
    }

    public final boolean f() {
        return this.f29641f;
    }
}
