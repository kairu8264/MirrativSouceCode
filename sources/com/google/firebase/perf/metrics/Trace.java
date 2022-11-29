package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nm.e;
import rm.k;
import sm.h;

/* loaded from: classes4.dex */
public class Trace extends hm.b implements Parcelable, pm.b {
    public final Map<String, mm.b> A;
    public final Map<String, String> B;
    public final List<pm.a> C;
    public final List<Trace> D;
    public final k E;
    public final sm.a F;
    public h G;
    public h H;

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<pm.b> f28015w;

    /* renamed from: x  reason: collision with root package name */
    public final Trace f28016x;

    /* renamed from: y  reason: collision with root package name */
    public final GaugeManager f28017y;

    /* renamed from: z  reason: collision with root package name */
    public final String f28018z;
    public static final lm.a I = lm.a.e();
    public static final Map<String, Trace> J = new ConcurrentHashMap();
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();
    public static final Parcelable.Creator<Trace> K = new b();

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    @Override // pm.b
    public void a(pm.a aVar) {
        if (aVar == null) {
            I.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (!j() || l()) {
        } else {
            this.C.add(aVar);
        }
    }

    public final void b(String str, String str2) {
        if (!l()) {
            if (!this.B.containsKey(str) && this.B.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            String d10 = e.d(new AbstractMap.SimpleEntry(str, str2));
            if (d10 != null) {
                throw new IllegalArgumentException(d10);
            }
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f28018z));
    }

    public Map<String, mm.b> d() {
        return this.A;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public h e() {
        return this.H;
    }

    public String f() {
        return this.f28018z;
    }

    public void finalize() throws Throwable {
        try {
            if (k()) {
                I.k("Trace '%s' is started but not stopped when it is destructed!", this.f28018z);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public List<pm.a> g() {
        List<pm.a> unmodifiableList;
        synchronized (this.C) {
            ArrayList arrayList = new ArrayList();
            for (pm.a aVar : this.C) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @Keep
    public String getAttribute(String str) {
        return this.B.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.B);
    }

    @Keep
    public long getLongMetric(String str) {
        mm.b bVar = str != null ? this.A.get(str.trim()) : null;
        if (bVar == null) {
            return 0L;
        }
        return bVar.a();
    }

    public h h() {
        return this.G;
    }

    public List<Trace> i() {
        return this.D;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            I.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!j()) {
            I.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f28018z);
        } else if (l()) {
            I.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f28018z);
        } else {
            mm.b m10 = m(str.trim());
            m10.c(j10);
            I.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m10.a()), this.f28018z);
        }
    }

    public boolean j() {
        return this.G != null;
    }

    public boolean k() {
        return j() && !l();
    }

    public boolean l() {
        return this.H != null;
    }

    public final mm.b m(String str) {
        mm.b bVar = this.A.get(str);
        if (bVar == null) {
            mm.b bVar2 = new mm.b(str);
            this.A.put(str, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public final void n(h hVar) {
        if (this.D.isEmpty()) {
            return;
        }
        Trace trace = this.D.get(this.D.size() - 1);
        if (trace.H == null) {
            trace.H = hVar;
        }
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            I.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f28018z);
            z10 = true;
        } catch (Exception e10) {
            I.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.B.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            I.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!j()) {
            I.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f28018z);
        } else if (l()) {
            I.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f28018z);
        } else {
            m(str.trim()).d(j10);
            I.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f28018z);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (l()) {
            I.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.B.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!im.a.f().I()) {
            I.a("Trace feature is disabled.");
            return;
        }
        String f10 = e.f(this.f28018z);
        if (f10 != null) {
            I.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f28018z, f10);
        } else if (this.G != null) {
            I.d("Trace '%s' has already started, should not start again!", this.f28018z);
        } else {
            this.G = this.F.a();
            registerForAppState();
            pm.a perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f28015w);
            a(perfSession);
            if (perfSession.f()) {
                this.f28017y.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!j()) {
            I.d("Trace '%s' has not been started so unable to stop!", this.f28018z);
        } else if (l()) {
            I.d("Trace '%s' has already stopped, should not stop again!", this.f28018z);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f28015w);
            unregisterForAppState();
            h a10 = this.F.a();
            this.H = a10;
            if (this.f28016x == null) {
                n(a10);
                if (!this.f28018z.isEmpty()) {
                    this.E.C(new mm.e(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().f()) {
                        this.f28017y.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                        return;
                    }
                    return;
                }
                I.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f28016x, 0);
        parcel.writeString(this.f28018z);
        parcel.writeList(this.D);
        parcel.writeMap(this.A);
        parcel.writeParcelable(this.G, 0);
        parcel.writeParcelable(this.H, 0);
        synchronized (this.C) {
            parcel.writeList(this.C);
        }
    }

    public Trace(String str) {
        this(str, k.k(), new sm.a(), hm.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, sm.a aVar, hm.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, sm.a aVar, hm.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f28015w = new WeakReference<>(this);
        this.f28016x = null;
        this.f28018z = str.trim();
        this.D = new ArrayList();
        this.A = new ConcurrentHashMap();
        this.B = new ConcurrentHashMap();
        this.F = aVar;
        this.E = kVar;
        this.C = Collections.synchronizedList(new ArrayList());
        this.f28017y = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : hm.a.b());
        this.f28015w = new WeakReference<>(this);
        this.f28016x = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f28018z = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A = concurrentHashMap;
        this.B = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, mm.b.class.getClassLoader());
        this.G = (h) parcel.readParcelable(h.class.getClassLoader());
        this.H = (h) parcel.readParcelable(h.class.getClassLoader());
        List<pm.a> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.C = synchronizedList;
        parcel.readList(synchronizedList, pm.a.class.getClassLoader());
        if (z10) {
            this.E = null;
            this.F = null;
            this.f28017y = null;
            return;
        }
        this.E = k.k();
        this.F = new sm.a();
        this.f28017y = GaugeManager.getInstance();
    }
}
