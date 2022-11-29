package hi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class i implements q {

    /* renamed from: w  reason: collision with root package name */
    public final Double f35807w;

    public i(Double d10) {
        if (d10 == null) {
            this.f35807w = Double.valueOf(Double.NaN);
        } else {
            this.f35807w = d10;
        }
    }

    @Override // hi.q
    public final q d() {
        return new i(this.f35807w);
    }

    @Override // hi.q
    public final Double e() {
        return this.f35807w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f35807w.equals(((i) obj).f35807w);
        }
        return false;
    }

    @Override // hi.q
    public final Boolean f() {
        boolean z10 = false;
        if (!Double.isNaN(this.f35807w.doubleValue()) && this.f35807w.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // hi.q
    public final String h() {
        int scale;
        if (Double.isNaN(this.f35807w.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f35807w.doubleValue())) {
            return this.f35807w.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f35807w.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    public final int hashCode() {
        return this.f35807w.hashCode();
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return null;
    }

    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        if ("toString".equals(str)) {
            return new u(h());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", h(), str));
    }

    public final String toString() {
        return h();
    }
}
