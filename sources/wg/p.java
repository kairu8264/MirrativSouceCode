package wg;

import ai.u;
import ai.uj0;
import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class p extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f58720a;

    public /* synthetic */ p(s sVar, q qVar) {
        this.f58720a = sVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            s sVar = this.f58720a;
            s.d6(sVar, (u) s.Y5(sVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e10) {
            e = e10;
            uj0.g("", e);
        } catch (ExecutionException e11) {
            e = e11;
            uj0.g("", e);
        } catch (TimeoutException e12) {
            uj0.g("", e12);
        }
        return this.f58720a.T5();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (s.a6(this.f58720a) == null || str2 == null) {
            return;
        }
        s.a6(this.f58720a).loadUrl(str2);
    }
}
