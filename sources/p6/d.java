package p6;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class d implements Serializable, Cloneable {
    public static final ObjectStreamField[] Y;

    /* renamed from: w  reason: collision with root package name */
    public transient z f45898w = k.h();

    /* renamed from: x  reason: collision with root package name */
    public String f45899x = c1.c();

    /* renamed from: y  reason: collision with root package name */
    public boolean f45900y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f45901z = false;
    public boolean A = false;
    public boolean B = false;
    public int C = 0;
    public int D = 0;
    public int E = -1;
    public long F = -1;
    public long G = -1;
    public long H = -1;
    public long I = -1;
    public boolean J = false;
    public LinkedList<String> K = null;
    public String L = null;
    public String M = null;
    public long N = 0;
    public long O = 0;
    public String P = null;
    public Boolean Q = null;
    public long R = 0;
    public long S = 0;
    public String T = null;
    public long U = 0;
    public long V = 0;
    public String W = null;
    public String X = null;

    static {
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        Class cls3 = Long.TYPE;
        Y = new ObjectStreamField[]{new ObjectStreamField("uuid", String.class), new ObjectStreamField("enabled", cls), new ObjectStreamField("isGdprForgotten", cls), new ObjectStreamField("isThirdPartySharingDisabled", cls), new ObjectStreamField("askingAttribution", cls), new ObjectStreamField("eventCount", cls2), new ObjectStreamField("sessionCount", cls2), new ObjectStreamField("subsessionCount", cls2), new ObjectStreamField("sessionLength", cls3), new ObjectStreamField("timeSpent", cls3), new ObjectStreamField("lastActivity", cls3), new ObjectStreamField("lastInterval", cls3), new ObjectStreamField("updatePackages", cls), new ObjectStreamField("orderIds", LinkedList.class), new ObjectStreamField("pushToken", String.class), new ObjectStreamField("adid", String.class), new ObjectStreamField("clickTime", cls3), new ObjectStreamField("installBegin", cls3), new ObjectStreamField("installReferrer", String.class), new ObjectStreamField("googlePlayInstant", Boolean.class), new ObjectStreamField("clickTimeServer", cls3), new ObjectStreamField("installBeginServer", cls3), new ObjectStreamField("installVersion", String.class), new ObjectStreamField("clickTimeHuawei", cls3), new ObjectStreamField("installBeginHuawei", cls3), new ObjectStreamField("installReferrerHuawei", String.class), new ObjectStreamField("installReferrerHuaweiAppGallery", String.class)};
    }

    public static String f(long j10) {
        Calendar.getInstance().setTimeInMillis(j10);
        return c1.k("%02d:%02d:%02d", 11, 12, 13);
    }

    public void b(String str) {
        if (this.K == null) {
            this.K = new LinkedList<>();
        }
        if (this.K.size() >= 10) {
            this.K.removeLast();
        }
        this.K.addFirst(str);
    }

    public boolean c(String str) {
        LinkedList<String> linkedList = this.K;
        if (linkedList == null) {
            return false;
        }
        return linkedList.contains(str);
    }

    public void e(long j10) {
        this.E = 1;
        this.F = 0L;
        this.G = 0L;
        this.H = j10;
        this.I = -1L;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            return c1.i(this.f45899x, dVar.f45899x) && c1.d(Boolean.valueOf(this.f45900y), Boolean.valueOf(dVar.f45900y)) && c1.d(Boolean.valueOf(this.f45901z), Boolean.valueOf(dVar.f45901z)) && c1.d(Boolean.valueOf(this.A), Boolean.valueOf(dVar.A)) && c1.d(Boolean.valueOf(this.B), Boolean.valueOf(dVar.B)) && c1.f(Integer.valueOf(this.C), Integer.valueOf(dVar.C)) && c1.f(Integer.valueOf(this.D), Integer.valueOf(dVar.D)) && c1.f(Integer.valueOf(this.E), Integer.valueOf(dVar.E)) && c1.g(Long.valueOf(this.F), Long.valueOf(dVar.F)) && c1.g(Long.valueOf(this.G), Long.valueOf(dVar.G)) && c1.g(Long.valueOf(this.I), Long.valueOf(dVar.I)) && c1.d(Boolean.valueOf(this.J), Boolean.valueOf(dVar.J)) && c1.h(this.K, dVar.K) && c1.i(this.L, dVar.L) && c1.i(this.M, dVar.M) && c1.g(Long.valueOf(this.N), Long.valueOf(dVar.N)) && c1.g(Long.valueOf(this.O), Long.valueOf(dVar.O)) && c1.i(this.P, dVar.P) && c1.d(this.Q, dVar.Q) && c1.g(Long.valueOf(this.R), Long.valueOf(dVar.R)) && c1.g(Long.valueOf(this.S), Long.valueOf(dVar.S)) && c1.i(this.T, dVar.T) && c1.g(Long.valueOf(this.U), Long.valueOf(dVar.U)) && c1.g(Long.valueOf(this.V), Long.valueOf(dVar.V)) && c1.i(this.W, dVar.W) && c1.i(this.X, dVar.X);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((629 + c1.L(this.f45899x)) * 37) + c1.G(Boolean.valueOf(this.f45900y))) * 37) + c1.G(Boolean.valueOf(this.f45901z))) * 37) + c1.G(Boolean.valueOf(this.A))) * 37) + c1.G(Boolean.valueOf(this.B))) * 37) + this.C) * 37) + this.D) * 37) + this.E) * 37) + c1.J(Long.valueOf(this.F))) * 37) + c1.J(Long.valueOf(this.G))) * 37) + c1.J(Long.valueOf(this.I))) * 37) + c1.G(Boolean.valueOf(this.J))) * 37) + c1.K(this.K)) * 37) + c1.L(this.L)) * 37) + c1.L(this.M)) * 37) + c1.J(Long.valueOf(this.N))) * 37) + c1.J(Long.valueOf(this.O))) * 37) + c1.L(this.P)) * 37) + c1.G(this.Q)) * 37) + c1.J(Long.valueOf(this.R))) * 37) + c1.J(Long.valueOf(this.S))) * 37) + c1.L(this.T)) * 37) + c1.J(Long.valueOf(this.U))) * 37) + c1.J(Long.valueOf(this.V))) * 37) + c1.L(this.W)) * 37) + c1.L(this.X);
    }

    public String toString() {
        return c1.k("ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", Integer.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Double.valueOf(this.F / 1000.0d), Double.valueOf(this.G / 1000.0d), f(this.H), this.f45899x);
    }
}
