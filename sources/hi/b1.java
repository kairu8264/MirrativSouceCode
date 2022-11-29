package hi;

import android.os.Bundle;
import android.util.Log;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b1 extends h1 {

    /* renamed from: w  reason: collision with root package name */
    public final AtomicReference<Bundle> f35655w = new AtomicReference<>();

    /* renamed from: x  reason: collision with root package name */
    public boolean f35656x;

    public static final <T> T h1(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(TopicConstant.EXTEND_AAC_RAW)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    @Override // hi.i1
    public final void g0(Bundle bundle) {
        synchronized (this.f35655w) {
            this.f35655w.set(bundle);
            this.f35656x = true;
            this.f35655w.notify();
        }
    }

    public final Bundle s0(long j10) {
        Bundle bundle;
        synchronized (this.f35655w) {
            if (!this.f35656x) {
                try {
                    this.f35655w.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f35655w.get();
        }
        return bundle;
    }

    public final String z0(long j10) {
        return (String) h1(s0(j10), String.class);
    }
}
