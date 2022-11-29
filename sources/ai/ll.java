package ai;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ll {

    /* renamed from: b  reason: collision with root package name */
    public int f6601b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f6600a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final List<kl> f6602c = new LinkedList();

    public final kl a(boolean z10) {
        synchronized (this.f6600a) {
            kl klVar = null;
            if (this.f6602c.size() == 0) {
                uj0.a("Queue empty");
                return null;
            }
            int i10 = 0;
            if (this.f6602c.size() >= 2) {
                int i11 = Integer.MIN_VALUE;
                int i12 = 0;
                for (kl klVar2 : this.f6602c) {
                    int m10 = klVar2.m();
                    if (m10 > i11) {
                        i10 = i12;
                    }
                    int i13 = m10 > i11 ? m10 : i11;
                    if (m10 > i11) {
                        klVar = klVar2;
                    }
                    i12++;
                    i11 = i13;
                }
                this.f6602c.remove(i10);
                return klVar;
            }
            kl klVar3 = this.f6602c.get(0);
            if (z10) {
                this.f6602c.remove(0);
            } else {
                klVar3.e();
            }
            return klVar3;
        }
    }

    public final boolean b(kl klVar) {
        synchronized (this.f6600a) {
            return this.f6602c.contains(klVar);
        }
    }

    public final boolean c(kl klVar) {
        synchronized (this.f6600a) {
            Iterator<kl> it = this.f6602c.iterator();
            while (it.hasNext()) {
                kl next = it.next();
                if (!wg.t.h().p().d()) {
                    if (klVar != next && next.b().equals(klVar.b())) {
                        it.remove();
                        return true;
                    }
                } else if (!wg.t.h().p().e() && klVar != next && next.d().equals(klVar.d())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void d(kl klVar) {
        synchronized (this.f6600a) {
            if (this.f6602c.size() >= 10) {
                int size = this.f6602c.size();
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Queue is full, current size = ");
                sb2.append(size);
                uj0.a(sb2.toString());
                this.f6602c.remove(0);
            }
            int i10 = this.f6601b;
            this.f6601b = i10 + 1;
            klVar.n(i10);
            klVar.j();
            this.f6602c.add(klVar);
        }
    }
}
