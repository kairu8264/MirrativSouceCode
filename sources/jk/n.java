package jk;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class n<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38085a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public Queue<m<ResultT>> f38086b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38087c;

    public final void a(m<ResultT> mVar) {
        synchronized (this.f38085a) {
            if (this.f38086b == null) {
                this.f38086b = new ArrayDeque();
            }
            this.f38086b.add(mVar);
        }
    }

    public final void b(d<ResultT> dVar) {
        m<ResultT> poll;
        synchronized (this.f38085a) {
            if (this.f38086b != null && !this.f38087c) {
                this.f38087c = true;
                while (true) {
                    synchronized (this.f38085a) {
                        poll = this.f38086b.poll();
                        if (poll == null) {
                            this.f38087c = false;
                            return;
                        }
                    }
                    poll.a(dVar);
                }
            }
        }
    }
}
