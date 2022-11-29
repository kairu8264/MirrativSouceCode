package yo;

import java.util.Arrays;
import wn.l;
import xo.g0;
import yo.c;

/* loaded from: classes4.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: w  reason: collision with root package name */
    public S[] f62076w;

    /* renamed from: x  reason: collision with root package name */
    public int f62077x;

    /* renamed from: y  reason: collision with root package name */
    public int f62078y;

    /* renamed from: z  reason: collision with root package name */
    public w f62079z;

    public static final /* synthetic */ int g(a aVar) {
        return aVar.f62077x;
    }

    public static final /* synthetic */ c[] h(a aVar) {
        return aVar.f62076w;
    }

    public final g0<Integer> c() {
        w wVar;
        synchronized (this) {
            wVar = this.f62079z;
            if (wVar == null) {
                wVar = new w(m());
                this.f62079z = wVar;
            }
        }
        return wVar;
    }

    public final S i() {
        S s10;
        w wVar;
        synchronized (this) {
            S[] n10 = n();
            if (n10 == null) {
                n10 = k(2);
                this.f62076w = n10;
            } else if (m() >= n10.length) {
                Object[] copyOf = Arrays.copyOf(n10, n10.length * 2);
                jo.p.g(copyOf, "copyOf(this, newSize)");
                this.f62076w = (S[]) ((c[]) copyOf);
                n10 = (S[]) ((c[]) copyOf);
            }
            int i10 = this.f62078y;
            do {
                s10 = n10[i10];
                if (s10 == null) {
                    s10 = j();
                    n10[i10] = s10;
                }
                i10++;
                if (i10 >= n10.length) {
                    i10 = 0;
                }
            } while (!s10.a(this));
            this.f62078y = i10;
            this.f62077x = m() + 1;
            wVar = this.f62079z;
        }
        if (wVar != null) {
            wVar.a0(1);
        }
        return s10;
    }

    public abstract S j();

    public abstract S[] k(int i10);

    public final void l(S s10) {
        w wVar;
        int i10;
        ao.d<wn.v>[] b10;
        synchronized (this) {
            this.f62077x = m() - 1;
            wVar = this.f62079z;
            i10 = 0;
            if (m() == 0) {
                this.f62078y = 0;
            }
            b10 = s10.b(this);
        }
        int length = b10.length;
        while (i10 < length) {
            ao.d<wn.v> dVar = b10[i10];
            i10++;
            if (dVar != null) {
                l.a aVar = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(wn.v.f59242a));
            }
        }
        if (wVar == null) {
            return;
        }
        wVar.a0(-1);
    }

    public final int m() {
        return this.f62077x;
    }

    public final S[] n() {
        return this.f62076w;
    }
}
