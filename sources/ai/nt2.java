package ai;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nt2 extends it2 {
    /* JADX WARN: Multi-variable type inference failed */
    public nt2(bt2 bt2Var, bt2 bt2Var2, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bt2Var, bt2Var2, hashSet, jSONObject, null);
    }

    @Override // ai.jt2
    public final void a(String str) {
        ds2 a10;
        if (!TextUtils.isEmpty(str) && (a10 = ds2.a()) != null) {
            for (sr2 sr2Var : a10.e()) {
                if (this.f5405c.contains(sr2Var.h())) {
                    sr2Var.g().f(str, this.f5407e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        if (vs2.i(this.f5406d, this.f5922b.d())) {
            return null;
        }
        this.f5922b.e(this.f5406d);
        return this.f5406d.toString();
    }

    @Override // ai.jt2, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }
}
