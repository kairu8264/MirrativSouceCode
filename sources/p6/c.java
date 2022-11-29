package p6;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class c implements Serializable {
    public static final ObjectStreamField[] M = {new ObjectStreamField("path", String.class), new ObjectStreamField("clientSdk", String.class), new ObjectStreamField("parameters", Map.class), new ObjectStreamField("activityKind", b.class), new ObjectStreamField("suffix", String.class), new ObjectStreamField("callbackParameters", Map.class), new ObjectStreamField("partnerParameters", Map.class)};
    public b A;
    public String B;
    public Map<String, String> C;
    public Map<String, String> D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public String K;
    public Boolean L;

    /* renamed from: w  reason: collision with root package name */
    public transient int f45886w;

    /* renamed from: x  reason: collision with root package name */
    public String f45887x;

    /* renamed from: y  reason: collision with root package name */
    public String f45888y;

    /* renamed from: z  reason: collision with root package name */
    public Map<String, String> f45889z;

    public c(b bVar) {
        this.A = b.UNKNOWN;
        this.A = bVar;
    }

    public void A(String str) {
        this.K = str;
    }

    public void B(Map<String, String> map) {
        this.f45889z = map;
    }

    public void C(Map<String, String> map) {
        this.D = map;
    }

    public void D(String str) {
        this.f45887x = str;
    }

    public void E(String str) {
        this.B = str;
    }

    public b a() {
        return this.A;
    }

    public Map<String, String> b() {
        return this.C;
    }

    public long c() {
        return this.F;
    }

    public long d() {
        return this.G;
    }

    public long e() {
        return this.I;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            return c1.i(this.f45887x, cVar.f45887x) && c1.i(this.f45888y, cVar.f45888y) && c1.h(this.f45889z, cVar.f45889z) && c1.e(this.A, cVar.A) && c1.i(this.B, cVar.B) && c1.h(this.C, cVar.C) && c1.h(this.D, cVar.D);
        }
        return false;
    }

    public String f() {
        return this.f45888y;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c1.k("Path:      %s\n", this.f45887x));
        sb2.append(c1.k("ClientSdk: %s\n", this.f45888y));
        if (this.f45889z != null) {
            sb2.append("Parameters:");
            TreeMap treeMap = new TreeMap(this.f45889z);
            List asList = Arrays.asList("app_secret", "secret_id", "event_callback_id");
            for (Map.Entry entry : treeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (!asList.contains(str)) {
                    sb2.append(c1.k("\n\t%-16s %s", str, entry.getValue()));
                }
            }
        }
        return sb2.toString();
    }

    public String h() {
        return c1.k("Failed to track %s%s", this.A.toString(), this.B);
    }

    public int hashCode() {
        if (this.f45886w == 0) {
            this.f45886w = 17;
            int L = (17 * 37) + c1.L(this.f45887x);
            this.f45886w = L;
            int L2 = (L * 37) + c1.L(this.f45888y);
            this.f45886w = L2;
            int K = (L2 * 37) + c1.K(this.f45889z);
            this.f45886w = K;
            int I = (K * 37) + c1.I(this.A);
            this.f45886w = I;
            int L3 = (I * 37) + c1.L(this.B);
            this.f45886w = L3;
            int K2 = (L3 * 37) + c1.K(this.C);
            this.f45886w = K2;
            this.f45886w = (K2 * 37) + c1.K(this.D);
        }
        return this.f45886w;
    }

    public Boolean i() {
        return this.L;
    }

    public long j() {
        return this.H;
    }

    public long k() {
        return this.J;
    }

    public String l() {
        return this.K;
    }

    public Map<String, String> m() {
        return this.f45889z;
    }

    public Map<String, String> n() {
        return this.D;
    }

    public String o() {
        return this.f45887x;
    }

    public int p() {
        return this.E;
    }

    public String q() {
        return this.B;
    }

    public int r() {
        int i10 = this.E + 1;
        this.E = i10;
        return i10;
    }

    public void s(Map<String, String> map) {
        this.C = map;
    }

    public void t(long j10) {
        this.F = j10;
    }

    public String toString() {
        return c1.k("%s%s", this.A.toString(), this.B);
    }

    public void u(long j10) {
        this.G = j10;
    }

    public void v(long j10) {
        this.I = j10;
    }

    public void w(String str) {
        this.f45888y = str;
    }

    public void x(Boolean bool) {
        this.L = bool;
    }

    public void y(long j10) {
        this.H = j10;
    }

    public void z(long j10) {
        this.J = j10;
    }
}
