package ai;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class hj0 {

    /* renamed from: a  reason: collision with root package name */
    public BigInteger f4861a = BigInteger.ONE;

    /* renamed from: b  reason: collision with root package name */
    public String f4862b = "0";

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.f4861a.toString();
        this.f4861a = this.f4861a.add(BigInteger.ONE);
        this.f4862b = bigInteger;
        return bigInteger;
    }

    public final synchronized String b() {
        return this.f4862b;
    }
}
