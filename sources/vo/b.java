package vo;

import android.os.Handler;
import android.os.Looper;
import ao.g;
import io.l;
import java.util.concurrent.CancellationException;
import jo.h;
import jo.q;
import po.n;
import uo.g1;
import uo.g2;
import uo.i1;
import uo.p;
import uo.r2;
import wn.v;

/* loaded from: classes4.dex */
public final class b extends c {
    public final b A;
    private volatile b _immediate;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f57532x;

    /* renamed from: y  reason: collision with root package name */
    public final String f57533y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f57534z;

    /* loaded from: classes4.dex */
    public static final class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f57535w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b f57536x;

        public a(p pVar, b bVar) {
            this.f57535w = pVar;
            this.f57536x = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f57535w.k(this.f57536x, v.f59242a);
        }
    }

    /* renamed from: vo.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0934b extends q implements l<Throwable, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Runnable f57538x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0934b(Runnable runnable) {
            super(1);
            this.f57538x = runnable;
        }

        public final void a(Throwable th2) {
            b.this.f57532x.removeCallbacks(this.f57538x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f59242a;
        }
    }

    public b(Handler handler, String str, boolean z10) {
        super(null);
        this.f57532x = handler;
        this.f57533y = str;
        this.f57534z = z10;
        this._immediate = z10 ? this : null;
        b bVar = this._immediate;
        if (bVar == null) {
            bVar = new b(handler, str, true);
            this._immediate = bVar;
        }
        this.A = bVar;
    }

    public static final void w0(b bVar, Runnable runnable) {
        bVar.f57532x.removeCallbacks(runnable);
    }

    @Override // uo.a1
    public void S(long j10, p<? super v> pVar) {
        a aVar = new a(pVar, this);
        if (this.f57532x.postDelayed(aVar, n.j(j10, 4611686018427387903L))) {
            pVar.M(new C0934b(aVar));
        } else {
            q0(pVar.getContext(), aVar);
        }
    }

    @Override // uo.k0
    public void X(g gVar, Runnable runnable) {
        if (this.f57532x.post(runnable)) {
            return;
        }
        q0(gVar, runnable);
    }

    @Override // uo.k0
    public boolean c0(g gVar) {
        return (this.f57534z && jo.p.c(Looper.myLooper(), this.f57532x.getLooper())) ? false : true;
    }

    @Override // vo.c, uo.a1
    public i1 d(long j10, final Runnable runnable, g gVar) {
        if (this.f57532x.postDelayed(runnable, n.j(j10, 4611686018427387903L))) {
            return new i1() { // from class: vo.a
                @Override // uo.i1
                public final void dispose() {
                    b.w0(b.this, runnable);
                }
            };
        }
        q0(gVar, runnable);
        return r2.f56082w;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f57532x == this.f57532x;
    }

    public int hashCode() {
        return System.identityHashCode(this.f57532x);
    }

    public final void q0(g gVar, Runnable runnable) {
        g2.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        g1.b().X(gVar, runnable);
    }

    @Override // vo.c
    /* renamed from: r0 */
    public b k0() {
        return this.A;
    }

    @Override // uo.o2, uo.k0
    public String toString() {
        String i02 = i0();
        if (i02 == null) {
            String str = this.f57533y;
            if (str == null) {
                str = this.f57532x.toString();
            }
            return this.f57534z ? jo.p.o(str, ".immediate") : str;
        }
        return i02;
    }

    public /* synthetic */ b(Handler handler, String str, int i10, h hVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public b(Handler handler, String str) {
        this(handler, str, false);
    }
}
