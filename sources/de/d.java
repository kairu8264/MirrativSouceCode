package de;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import jo.p;

/* loaded from: classes2.dex */
public final class d {
    public static final String a(float f10) {
        DecimalFormat decimalFormat = new DecimalFormat("0.########");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String format = decimalFormat.format(new BigDecimal(String.valueOf(f10)));
        p.g(format, "DecimalFormat(\"0.#######…rmat(this.toBigDecimal())");
        return format;
    }
}
