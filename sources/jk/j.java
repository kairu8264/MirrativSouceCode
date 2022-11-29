package jk;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j<ResultT> implements m<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f38077a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38078b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final b f38079c;

    public j(Executor executor, b bVar) {
        this.f38077a = executor;
        this.f38079c = bVar;
    }

    @Override // jk.m
    public final void a(d<ResultT> dVar) {
        if (dVar.i()) {
            return;
        }
        synchronized (this.f38078b) {
            if (this.f38079c == null) {
                return;
            }
            this.f38077a.execute(new i(this, dVar));
        }
    }
}
