package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgw;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class r80 {

    /* renamed from: b  reason: collision with root package name */
    public static r80 f9370b;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f9371a = new AtomicBoolean(false);

    public static r80 a() {
        if (f9370b == null) {
            f9370b = new r80();
        }
        return f9370b;
    }

    public final Thread b(final Context context, final String str) {
        if (this.f9371a.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this, context, str) { // from class: ai.p80

                /* renamed from: w  reason: collision with root package name */
                public final r80 f8345w;

                /* renamed from: x  reason: collision with root package name */
                public final Context f8346x;

                /* renamed from: y  reason: collision with root package name */
                public final String f8347y;

                {
                    this.f8345w = this;
                    this.f8346x = context;
                    this.f8347y = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = this.f8346x;
                    String str2 = this.f8347y;
                    ox.a(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) ft.c().c(ox.f7956c0)).booleanValue());
                    if (((Boolean) ft.c().c(ox.f8013j0)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((nr0) xj0.a(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", q80.f8848a)).M2(yh.b.h1(context2), new o80(oi.a.k(context2, "FA-Ads", TopicConstant.PACKET_TYPE_AUDIO_MP3, str2, bundle)));
                    } catch (RemoteException | zzcgw | NullPointerException e10) {
                        uj0.i("#007 Could not call remote method.", e10);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}
