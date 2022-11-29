package ai;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class yi0 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f12608a;

    /* renamed from: b  reason: collision with root package name */
    public final jj0 f12609b;

    /* renamed from: e  reason: collision with root package name */
    public final String f12612e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12613f;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12611d = new Object();

    /* renamed from: g  reason: collision with root package name */
    public long f12614g = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f12615h = -1;

    /* renamed from: i  reason: collision with root package name */
    public long f12616i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f12617j = -1;

    /* renamed from: k  reason: collision with root package name */
    public long f12618k = -1;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList<xi0> f12610c = new LinkedList<>();

    public yi0(vh.f fVar, jj0 jj0Var, String str, String str2) {
        this.f12608a = fVar;
        this.f12609b = jj0Var;
        this.f12612e = str;
        this.f12613f = str2;
    }

    public final void b(as asVar) {
        synchronized (this.f12611d) {
            long elapsedRealtime = this.f12608a.elapsedRealtime();
            this.f12617j = elapsedRealtime;
            this.f12609b.f(asVar, elapsedRealtime);
        }
    }

    public final void c() {
        synchronized (this.f12611d) {
            this.f12609b.g();
        }
    }

    public final void d() {
        synchronized (this.f12611d) {
            this.f12609b.h();
        }
    }

    public final void e(long j10) {
        synchronized (this.f12611d) {
            this.f12618k = j10;
            if (j10 != -1) {
                this.f12609b.a(this);
            }
        }
    }

    public final void f() {
        synchronized (this.f12611d) {
            if (this.f12618k != -1 && this.f12614g == -1) {
                this.f12614g = this.f12608a.elapsedRealtime();
                this.f12609b.a(this);
            }
            this.f12609b.e();
        }
    }

    public final void g() {
        synchronized (this.f12611d) {
            if (this.f12618k != -1) {
                xi0 xi0Var = new xi0(this);
                xi0Var.c();
                this.f12610c.add(xi0Var);
                this.f12616i++;
                this.f12609b.d();
                this.f12609b.a(this);
            }
        }
    }

    public final void h() {
        synchronized (this.f12611d) {
            if (this.f12618k != -1 && !this.f12610c.isEmpty()) {
                xi0 last = this.f12610c.getLast();
                if (last.a() == -1) {
                    last.b();
                    this.f12609b.a(this);
                }
            }
        }
    }

    public final void i(boolean z10) {
        synchronized (this.f12611d) {
            if (this.f12618k != -1) {
                this.f12615h = this.f12608a.elapsedRealtime();
            }
        }
    }

    public final Bundle j() {
        Bundle bundle;
        synchronized (this.f12611d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f12612e);
            bundle.putString("slotid", this.f12613f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f12617j);
            bundle.putLong("tresponse", this.f12618k);
            bundle.putLong("timp", this.f12614g);
            bundle.putLong("tload", this.f12615h);
            bundle.putLong("pcc", this.f12616i);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<xi0> it = this.f12610c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String k() {
        return this.f12612e;
    }
}
