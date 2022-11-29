package jg;

import cg.o;
import cg.t;
import dg.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kg.y;
import mg.a;

/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f38039f = Logger.getLogger(t.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final y f38040a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f38041b;

    /* renamed from: c  reason: collision with root package name */
    public final dg.e f38042c;

    /* renamed from: d  reason: collision with root package name */
    public final lg.d f38043d;

    /* renamed from: e  reason: collision with root package name */
    public final mg.a f38044e;

    public c(Executor executor, dg.e eVar, y yVar, lg.d dVar, mg.a aVar) {
        this.f38041b = executor;
        this.f38042c = eVar;
        this.f38040a = yVar;
        this.f38043d = dVar;
        this.f38044e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, cg.i iVar) {
        this.f38043d.F1(oVar, iVar);
        this.f38040a.a(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final o oVar, zf.h hVar, cg.i iVar) {
        try {
            m a10 = this.f38042c.a(oVar.b());
            if (a10 == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f38039f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final cg.i a11 = a10.a(iVar);
            this.f38044e.e(new a.InterfaceC0605a() { // from class: jg.b
                @Override // mg.a.InterfaceC0605a
                public final Object d() {
                    Object d10;
                    d10 = c.this.d(oVar, a11);
                    return d10;
                }
            });
            hVar.a(null);
        } catch (Exception e10) {
            Logger logger = f38039f;
            logger.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override // jg.e
    public void a(final o oVar, final cg.i iVar, final zf.h hVar) {
        this.f38041b.execute(new Runnable() { // from class: jg.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(oVar, hVar, iVar);
            }
        });
    }
}
