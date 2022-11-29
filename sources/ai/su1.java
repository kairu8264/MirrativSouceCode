package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzeap;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class su1 extends mu1 {
    public String C;
    public int D = 1;

    public su1(Context context) {
        this.B = new sd0(context, wg.t.r().a(), this, this);
    }

    public final s43<InputStream> b(ie0 ie0Var) {
        synchronized (this.f7060x) {
            int i10 = this.D;
            if (i10 != 1 && i10 != 2) {
                return j43.c(new zzeap(2));
            } else if (this.f7061y) {
                return this.f7059w;
            } else {
                this.D = 2;
                this.f7061y = true;
                this.A = ie0Var;
                this.B.o();
                this.f7059w.c(new Runnable(this) { // from class: ai.qu1

                    /* renamed from: w  reason: collision with root package name */
                    public final su1 f9200w;

                    {
                        this.f9200w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9200w.a();
                    }
                }, hk0.f4883f);
                return this.f7059w;
            }
        }
    }

    public final s43<InputStream> c(String str) {
        synchronized (this.f7060x) {
            int i10 = this.D;
            if (i10 != 1 && i10 != 3) {
                return j43.c(new zzeap(2));
            } else if (this.f7061y) {
                return this.f7059w;
            } else {
                this.D = 3;
                this.f7061y = true;
                this.C = str;
                this.B.o();
                this.f7059w.c(new Runnable(this) { // from class: ai.ru1

                    /* renamed from: w  reason: collision with root package name */
                    public final su1 f9596w;

                    {
                        this.f9596w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9596w.a();
                    }
                }, hk0.f4883f);
                return this.f7059w;
            }
        }
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        synchronized (this.f7060x) {
            if (!this.f7062z) {
                this.f7062z = true;
                try {
                    int i10 = this.D;
                    if (i10 == 2) {
                        this.B.h0().m4(this.A, new ju1(this));
                    } else if (i10 == 3) {
                        this.B.h0().Z2(this.C, new ju1(this));
                    } else {
                        this.f7059w.e(new zzeap(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f7059w.e(new zzeap(1));
                }
            }
        }
    }

    @Override // ai.mu1, rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        uj0.a("Cannot connect to remote service, fallback to local instance.");
        this.f7059w.e(new zzeap(1));
    }
}
