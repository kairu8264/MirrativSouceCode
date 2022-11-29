package hf;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35541a;

    public g(Context context) {
        jo.p.h(context, "context");
        this.f35541a = context;
    }

    @Override // hf.f
    public void d() {
        File[] listFiles = this.f35541a.getCacheDir().listFiles();
        jo.p.g(listFiles, "context.cacheDir.listFiles()");
        for (File file : listFiles) {
            file.delete();
        }
    }
}
