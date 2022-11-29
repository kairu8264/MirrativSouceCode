package kg;

import java.util.concurrent.Executor;
import mg.a;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f38805a;

    /* renamed from: b  reason: collision with root package name */
    public final lg.d f38806b;

    /* renamed from: c  reason: collision with root package name */
    public final y f38807c;

    /* renamed from: d  reason: collision with root package name */
    public final mg.a f38808d;

    public w(Executor executor, lg.d dVar, y yVar, mg.a aVar) {
        this.f38805a = executor;
        this.f38806b = dVar;
        this.f38807c = yVar;
        this.f38808d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (cg.o oVar : this.f38806b.M()) {
            this.f38807c.a(oVar, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f38808d.e(new a.InterfaceC0605a() { // from class: kg.v
            @Override // mg.a.InterfaceC0605a
            public final Object d() {
                Object d10;
                d10 = w.this.d();
                return d10;
            }
        });
    }

    public void c() {
        this.f38805a.execute(new Runnable() { // from class: kg.u
            @Override // java.lang.Runnable
            public final void run() {
                w.this.e();
            }
        });
    }
}
