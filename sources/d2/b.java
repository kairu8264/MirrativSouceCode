package d2;

import android.content.Context;
import android.graphics.Typeface;
import d2.a;
import d2.s;
import wn.l;

/* loaded from: classes.dex */
public final class b implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29057a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f29058b;

    public b(Context context) {
        jo.p.h(context, "context");
        this.f29057a = context.getApplicationContext();
    }

    @Override // d2.b0
    public Object a() {
        return this.f29058b;
    }

    @Override // d2.b0
    public Object c(k kVar, ao.d<? super Typeface> dVar) {
        Object d10;
        if (kVar instanceof a) {
            a aVar = (a) kVar;
            a.InterfaceC0269a d11 = aVar.d();
            Context context = this.f29057a;
            jo.p.g(context, "context");
            return d11.a(context, aVar, dVar);
        } else if (kVar instanceof h0) {
            Context context2 = this.f29057a;
            jo.p.g(context2, "context");
            d10 = c.d((h0) kVar, context2, dVar);
            return d10 == bo.c.c() ? d10 : (Typeface) d10;
        } else {
            throw new IllegalArgumentException("Unknown font type: " + kVar);
        }
    }

    @Override // d2.b0
    /* renamed from: d */
    public Typeface b(k kVar) {
        Object a10;
        jo.p.h(kVar, "font");
        if (kVar instanceof a) {
            a aVar = (a) kVar;
            a.InterfaceC0269a d10 = aVar.d();
            Context context = this.f29057a;
            jo.p.g(context, "context");
            return d10.b(context, aVar);
        } else if (kVar instanceof h0) {
            int a11 = kVar.a();
            s.a aVar2 = s.f29135a;
            if (s.e(a11, aVar2.b())) {
                Context context2 = this.f29057a;
                jo.p.g(context2, "context");
                return c.c((h0) kVar, context2);
            } else if (s.e(a11, aVar2.c())) {
                try {
                    l.a aVar3 = wn.l.f59224w;
                    Context context3 = this.f29057a;
                    jo.p.g(context3, "context");
                    a10 = wn.l.a(c.c((h0) kVar, context3));
                } catch (Throwable th2) {
                    l.a aVar4 = wn.l.f59224w;
                    a10 = wn.l.a(wn.m.a(th2));
                }
                return wn.l.c(a10) ? null : a10;
            } else if (s.e(a11, aVar2.a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + ((Object) s.g(kVar.a())));
            }
        } else {
            return null;
        }
    }
}
