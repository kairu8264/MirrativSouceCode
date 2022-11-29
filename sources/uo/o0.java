package uo;

import ao.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class o0 extends ao.a implements c3<String> {

    /* renamed from: x  reason: collision with root package name */
    public static final a f56073x = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final long f56074w;

    /* loaded from: classes4.dex */
    public static final class a implements g.c<o0> {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public o0(long j10) {
        super(f56073x);
        this.f56074w = j10;
    }

    public final long X() {
        return this.f56074w;
    }

    @Override // uo.c3
    /* renamed from: Y */
    public void z(ao.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // uo.c3
    /* renamed from: c0 */
    public String N(ao.g gVar) {
        String X;
        p0 p0Var = (p0) gVar.get(p0.f56075x);
        String str = "coroutine";
        if (p0Var != null && (X = p0Var.X()) != null) {
            str = X;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int Z = so.o.Z(name, " @", 0, false, 6, null);
        if (Z < 0) {
            Z = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + Z + 10);
        String substring = name.substring(0, Z);
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(" @");
        sb2.append(str);
        sb2.append('#');
        sb2.append(X());
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f56074w == ((o0) obj).f56074w;
    }

    public int hashCode() {
        return Long.hashCode(this.f56074w);
    }

    public String toString() {
        return "CoroutineId(" + this.f56074w + ')';
    }
}
