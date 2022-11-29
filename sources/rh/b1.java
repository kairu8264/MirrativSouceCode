package rh;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class b1<TListener> {

    /* renamed from: a  reason: collision with root package name */
    public TListener f51400a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f51401b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f51402c;

    public b1(c cVar, TListener tlistener) {
        this.f51402c = cVar;
        this.f51400a = tlistener;
    }

    public abstract void a(TListener tlistener);

    public abstract void b();

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f51400a;
            if (this.f51401b) {
                String obj = toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(obj);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (tlistener != null) {
            try {
                a(tlistener);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f51401b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f51400a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f51402c.N;
        synchronized (arrayList) {
            arrayList2 = this.f51402c.N;
            arrayList2.remove(this);
        }
    }
}
