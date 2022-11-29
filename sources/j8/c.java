package j8;

/* loaded from: classes.dex */
public abstract class c {

    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f37255a;

        public b() {
            super();
        }

        @Override // j8.c
        public void b(boolean z10) {
            this.f37255a = z10;
        }

        @Override // j8.c
        public void c() {
            if (this.f37255a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    public abstract void b(boolean z10);

    public abstract void c();

    public c() {
    }
}
