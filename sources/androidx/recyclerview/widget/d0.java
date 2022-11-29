package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public interface d0 {

    /* loaded from: classes.dex */
    public static class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public long f16081a = 0;

        /* renamed from: androidx.recyclerview.widget.d0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0073a implements d {

            /* renamed from: a  reason: collision with root package name */
            public final s.e<Long> f16082a = new s.e<>();

            public C0073a() {
            }

            @Override // androidx.recyclerview.widget.d0.d
            public long a(long j10) {
                Long h10 = this.f16082a.h(j10);
                if (h10 == null) {
                    h10 = Long.valueOf(a.this.b());
                    this.f16082a.m(j10, h10);
                }
                return h10.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.d0
        public d a() {
            return new C0073a();
        }

        public long b() {
            long j10 = this.f16081a;
            this.f16081a = 1 + j10;
            return j10;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public final d f16084a = new a();

        /* loaded from: classes.dex */
        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.d0.d
            public long a(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.d0
        public d a() {
            return this.f16084a;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public final d f16086a = new a();

        /* loaded from: classes.dex */
        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.d0.d
            public long a(long j10) {
                return j10;
            }
        }

        @Override // androidx.recyclerview.widget.d0
        public d a() {
            return this.f16086a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long a(long j10);
    }

    d a();
}
