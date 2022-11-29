package tg;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import rg.v;

@Deprecated
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f53623a;

    /* renamed from: b  reason: collision with root package name */
    public final int f53624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f53625c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f53626d;

    /* renamed from: e  reason: collision with root package name */
    public final int f53627e;

    /* renamed from: f  reason: collision with root package name */
    public final v f53628f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f53629g;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public v f53634e;

        /* renamed from: a  reason: collision with root package name */
        public boolean f53630a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f53631b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f53632c = 0;

        /* renamed from: d  reason: collision with root package name */
        public boolean f53633d = false;

        /* renamed from: f  reason: collision with root package name */
        public int f53635f = 1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f53636g = false;

        @RecentlyNonNull
        public e a() {
            return new e(this, null);
        }

        @RecentlyNonNull
        public a b(int i10) {
            this.f53635f = i10;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public a c(int i10) {
            this.f53631b = i10;
            return this;
        }

        @RecentlyNonNull
        public a d(int i10) {
            this.f53632c = i10;
            return this;
        }

        @RecentlyNonNull
        public a e(boolean z10) {
            this.f53636g = z10;
            return this;
        }

        @RecentlyNonNull
        public a f(boolean z10) {
            this.f53633d = z10;
            return this;
        }

        @RecentlyNonNull
        public a g(boolean z10) {
            this.f53630a = z10;
            return this;
        }

        @RecentlyNonNull
        public a h(@RecentlyNonNull v vVar) {
            this.f53634e = vVar;
            return this;
        }
    }

    public /* synthetic */ e(a aVar, k kVar) {
        this.f53623a = aVar.f53630a;
        this.f53624b = aVar.f53631b;
        this.f53625c = aVar.f53632c;
        this.f53626d = aVar.f53633d;
        this.f53627e = aVar.f53635f;
        this.f53628f = aVar.f53634e;
        this.f53629g = aVar.f53636g;
    }

    public int a() {
        return this.f53627e;
    }

    @Deprecated
    public int b() {
        return this.f53624b;
    }

    public int c() {
        return this.f53625c;
    }

    @RecentlyNullable
    public v d() {
        return this.f53628f;
    }

    public boolean e() {
        return this.f53626d;
    }

    public boolean f() {
        return this.f53623a;
    }

    public final boolean g() {
        return this.f53629g;
    }
}
