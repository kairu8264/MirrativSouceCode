package hi;

import android.util.Log;

/* loaded from: classes3.dex */
public final class k6 extends q6<Boolean> {
    public k6(n6 n6Var, String str, Boolean bool, boolean z10) {
        super(n6Var, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hi.q6
    public final /* bridge */ /* synthetic */ Boolean a(Object obj) {
        if (q5.f35932c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (q5.f35933d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String c10 = super.c();
        String str = (String) obj;
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 28 + str.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(c10);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
