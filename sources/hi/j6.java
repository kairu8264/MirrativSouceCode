package hi;

import android.util.Log;

/* loaded from: classes3.dex */
public final class j6 extends q6<Long> {
    public j6(n6 n6Var, String str, Long l10, boolean z10) {
        super(n6Var, str, l10, true, null);
    }

    @Override // hi.q6
    public final /* bridge */ /* synthetic */ Long a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = super.c();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 25 + str.length());
            sb2.append("Invalid long value for ");
            sb2.append(c10);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
