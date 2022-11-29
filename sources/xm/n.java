package xm;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class n extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f60420a;

    public n(Boolean bool) {
        this.f60420a = zm.a.b(bool);
    }

    public static boolean y(n nVar) {
        Object obj = nVar.f60420a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    public boolean A() {
        return this.f60420a instanceof Number;
    }

    public boolean B() {
        return this.f60420a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f60420a == null) {
            return nVar.f60420a == null;
        } else if (y(this) && y(nVar)) {
            return w().longValue() == nVar.w().longValue();
        } else {
            Object obj2 = this.f60420a;
            if ((obj2 instanceof Number) && (nVar.f60420a instanceof Number)) {
                double doubleValue = w().doubleValue();
                double doubleValue2 = nVar.w().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(nVar.f60420a);
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f60420a == null) {
            return 31;
        }
        if (y(this)) {
            doubleToLongBits = w().longValue();
        } else {
            Object obj = this.f60420a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(w().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // xm.k
    public String j() {
        if (A()) {
            return w().toString();
        }
        if (x()) {
            return ((Boolean) this.f60420a).toString();
        }
        return (String) this.f60420a;
    }

    public boolean r() {
        if (x()) {
            return ((Boolean) this.f60420a).booleanValue();
        }
        return Boolean.parseBoolean(j());
    }

    public double s() {
        return A() ? w().doubleValue() : Double.parseDouble(j());
    }

    public int t() {
        return A() ? w().intValue() : Integer.parseInt(j());
    }

    public long u() {
        return A() ? w().longValue() : Long.parseLong(j());
    }

    public Number w() {
        Object obj = this.f60420a;
        return obj instanceof String ? new zm.g((String) obj) : (Number) obj;
    }

    public boolean x() {
        return this.f60420a instanceof Boolean;
    }

    public n(Number number) {
        this.f60420a = zm.a.b(number);
    }

    public n(String str) {
        this.f60420a = zm.a.b(str);
    }
}
