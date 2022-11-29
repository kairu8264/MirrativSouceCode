package ai;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w80 extends y80 {

    /* renamed from: x  reason: collision with root package name */
    public static final cb0 f11508x = new cb0();

    /* renamed from: w  reason: collision with root package name */
    public Map<Class<Object>, Object> f11509w;

    @Override // ai.z80
    public final boolean A(String str) throws RemoteException {
        try {
            return bh.a.class.isAssignableFrom(Class.forName(str, false, w80.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            uj0.f(sb2.toString());
            return false;
        }
    }

    public final void S5(Map<Class<Object>, Object> map) {
        this.f11509w = map;
    }

    @Override // ai.z80
    public final ya0 s(String str) throws RemoteException {
        return new jb0((RtbAdapter) Class.forName(str, false, cb0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // ai.z80
    public final c90 t(String str) throws RemoteException {
        c90 da0Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, w80.class.getClassLoader());
                if (wf.b.class.isAssignableFrom(cls)) {
                    wf.b bVar = (wf.b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new da0(bVar, (wf.e) this.f11509w.get(bVar.getAdditionalParametersType()));
                } else if (ah.f.class.isAssignableFrom(cls)) {
                    return new y90((ah.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    if (ah.a.class.isAssignableFrom(cls)) {
                        return new y90((ah.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                    sb2.append("Could not instantiate mediation adapter: ");
                    sb2.append(str);
                    sb2.append(" (not a valid adapter).");
                    uj0.f(sb2.toString());
                    throw new RemoteException();
                }
            } catch (Throwable unused) {
                uj0.a("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    da0Var = new y90(new AdMobAdapter());
                } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                    da0Var = new y90(new AdUrlAdapter());
                } else if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    da0Var = new y90(new CustomEventAdapter());
                } else {
                    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                        da0Var = new da0(customEventAdapter, (bh.c) this.f11509w.get(customEventAdapter.getAdditionalParametersType()));
                    }
                    throw new RemoteException();
                }
                return da0Var;
            }
        } catch (Throwable th2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
            sb3.append("Could not instantiate mediation adapter: ");
            sb3.append(str);
            sb3.append(". ");
            uj0.g(sb3.toString(), th2);
            throw new RemoteException();
        }
    }

    @Override // ai.z80
    public final boolean x4(String str) throws RemoteException {
        try {
            return ah.a.class.isAssignableFrom(Class.forName(str, false, w80.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            uj0.f(sb2.toString());
            return false;
        }
    }
}
