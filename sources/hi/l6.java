package hi;

import android.util.Log;

/* loaded from: classes3.dex */
public final class l6 extends q6<Double> {
    public l6(n6 n6Var, String str, Double d10, boolean z10) {
        super(n6Var, "measurement.test.double_flag", d10, true, null);
    }

    @Override // hi.q6
    public final /* bridge */ /* synthetic */ Double a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = super.c();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 27 + str.length());
            sb2.append("Invalid double value for ");
            sb2.append(c10);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
