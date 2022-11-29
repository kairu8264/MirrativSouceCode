package androidx.lifecycle;

/* loaded from: classes.dex */
public class p0 {

    /* loaded from: classes.dex */
    public class a implements f0<X> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f15605a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n.a f15606b;

        public a(c0 c0Var, n.a aVar) {
            this.f15605a = c0Var;
            this.f15606b = aVar;
        }

        @Override // androidx.lifecycle.f0
        public void d(X x10) {
            this.f15605a.p(this.f15606b.apply(x10));
        }
    }

    /* loaded from: classes.dex */
    public class b implements f0<X> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15607a = true;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c0 f15608b;

        public b(c0 c0Var) {
            this.f15608b = c0Var;
        }

        @Override // androidx.lifecycle.f0
        public void d(X x10) {
            T f10 = this.f15608b.f();
            if (this.f15607a || ((f10 == 0 && x10 != 0) || !(f10 == 0 || f10.equals(x10)))) {
                this.f15607a = false;
                this.f15608b.p(x10);
            }
        }
    }

    public static <X> LiveData<X> a(LiveData<X> liveData) {
        c0 c0Var = new c0();
        c0Var.q(liveData, new b(c0Var));
        return c0Var;
    }

    public static <X, Y> LiveData<Y> b(LiveData<X> liveData, n.a<X, Y> aVar) {
        c0 c0Var = new c0();
        c0Var.q(liveData, new a(c0Var, aVar));
        return c0Var;
    }
}
