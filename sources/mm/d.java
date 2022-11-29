package mm;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import rm.k;
import tm.h;

/* loaded from: classes4.dex */
public final class d extends hm.b implements pm.b {
    public static final lm.a E = lm.a.e();
    public final WeakReference<pm.b> A;
    public String B;
    public boolean C;
    public boolean D;

    /* renamed from: w  reason: collision with root package name */
    public final List<pm.a> f41215w;

    /* renamed from: x  reason: collision with root package name */
    public final GaugeManager f41216x;

    /* renamed from: y  reason: collision with root package name */
    public final k f41217y;

    /* renamed from: z  reason: collision with root package name */
    public final h.b f41218z;

    public d(k kVar) {
        this(kVar, hm.a.b(), GaugeManager.getInstance());
    }

    public static d c(k kVar) {
        return new d(kVar);
    }

    public static boolean j(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // pm.b
    public void a(pm.a aVar) {
        if (aVar == null) {
            E.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (!h() || i()) {
        } else {
            this.f41215w.add(aVar);
        }
    }

    public h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.A);
        unregisterForAppState();
        tm.k[] b10 = pm.a.b(d());
        if (b10 != null) {
            this.f41218z.G(Arrays.asList(b10));
        }
        h a10 = this.f41218z.a();
        if (!om.h.c(this.B)) {
            E.a("Dropping network request from a 'User-Agent' that is not allowed");
            return a10;
        } else if (!this.C) {
            this.f41217y.B(a10, getAppState());
            this.C = true;
            return a10;
        } else {
            if (this.D) {
                E.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return a10;
        }
    }

    public List<pm.a> d() {
        List<pm.a> unmodifiableList;
        synchronized (this.f41215w) {
            ArrayList arrayList = new ArrayList();
            for (pm.a aVar : this.f41215w) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public long e() {
        return this.f41218z.J();
    }

    public String f() {
        return this.f41218z.K();
    }

    public boolean g() {
        return this.f41218z.M();
    }

    public final boolean h() {
        return this.f41218z.L();
    }

    public final boolean i() {
        return this.f41218z.N();
    }

    public d k(Map<String, String> map) {
        this.f41218z.H().O(map);
        return this;
    }

    public d l(String str) {
        if (str != null) {
            h.d dVar = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    dVar = h.d.OPTIONS;
                    break;
                case 1:
                    dVar = h.d.GET;
                    break;
                case 2:
                    dVar = h.d.PUT;
                    break;
                case 3:
                    dVar = h.d.HEAD;
                    break;
                case 4:
                    dVar = h.d.POST;
                    break;
                case 5:
                    dVar = h.d.PATCH;
                    break;
                case 6:
                    dVar = h.d.TRACE;
                    break;
                case 7:
                    dVar = h.d.CONNECT;
                    break;
                case '\b':
                    dVar = h.d.DELETE;
                    break;
            }
            this.f41218z.R(dVar);
        }
        return this;
    }

    public d m(int i10) {
        this.f41218z.T(i10);
        return this;
    }

    public void n() {
        this.D = true;
    }

    public d o() {
        this.f41218z.V(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public d p(long j10) {
        this.f41218z.W(j10);
        return this;
    }

    public d q(long j10) {
        pm.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.A);
        this.f41218z.Q(j10);
        a(perfSession);
        if (perfSession.f()) {
            this.f41216x.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public d r(String str) {
        if (str == null) {
            this.f41218z.I();
            return this;
        }
        if (j(str)) {
            this.f41218z.X(str);
        } else {
            lm.a aVar = E;
            aVar.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public d s(long j10) {
        this.f41218z.Y(j10);
        return this;
    }

    public d t(long j10) {
        this.f41218z.Z(j10);
        return this;
    }

    public d u(long j10) {
        this.f41218z.a0(j10);
        if (SessionManager.getInstance().perfSession().f()) {
            this.f41216x.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public d v(long j10) {
        this.f41218z.b0(j10);
        return this;
    }

    public d w(String str) {
        if (str != null) {
            this.f41218z.c0(sm.k.e(sm.k.d(str), 2000));
        }
        return this;
    }

    public d x(String str) {
        this.B = str;
        return this;
    }

    public d(k kVar, hm.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f41218z = h.F0();
        this.A = new WeakReference<>(this);
        this.f41217y = kVar;
        this.f41216x = gaugeManager;
        this.f41215w = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
