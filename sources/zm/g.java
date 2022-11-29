package zm;

import java.math.BigDecimal;

/* loaded from: classes4.dex */
public final class g extends Number {

    /* renamed from: w  reason: collision with root package name */
    public final String f63245w;

    public g(String str) {
        this.f63245w = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f63245w);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            String str = this.f63245w;
            String str2 = ((g) obj).f63245w;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f63245w);
    }

    public int hashCode() {
        return this.f63245w.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f63245w);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f63245w).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f63245w);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f63245w);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f63245w).longValue();
        }
    }

    public String toString() {
        return this.f63245w;
    }
}
