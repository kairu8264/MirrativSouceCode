package ai;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public abstract class jt2 extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public kt2 f5921a;

    /* renamed from: b  reason: collision with root package name */
    public final bt2 f5922b;

    public jt2(bt2 bt2Var, byte[] bArr) {
        this.f5922b = bt2Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        kt2 kt2Var = this.f5921a;
        if (kt2Var != null) {
            kt2Var.b(this);
        }
    }

    public final void b(kt2 kt2Var) {
        this.f5921a = kt2Var;
    }
}
