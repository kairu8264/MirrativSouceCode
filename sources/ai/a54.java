package ai;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class a54 implements o44 {

    /* renamed from: a  reason: collision with root package name */
    public File f1752a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f1753b;

    public a54(Context context) {
        this.f1753b = context;
    }

    @Override // ai.o44
    public final File zza() {
        if (this.f1752a == null) {
            this.f1752a = new File(this.f1753b.getCacheDir(), "volley");
        }
        return this.f1752a;
    }
}
